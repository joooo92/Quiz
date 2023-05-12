package quiz22;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {
		/*
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽어들입니다.
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴 분석
		 * Product객체에 저장하고, 리스트에 저장
		 * 
		 * 3. 외부라이브러리(POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록 하느 기능
		 * 	하나에 시트에 각 행데이터를 엑셀파일로 출력
		 * 
		 */
		List<Product> list = new ArrayList<>();
		Product p = new Product();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
		
		
		
		String day = "\\d{8}-\\d{2}-\\d{12,13}";
		String store = "[가-힣]+\s[가-힣]+";
		String grade = "\\[[가-힣A-Z]+\\]";
		String detail = "";
		String price = "[0-9,]+원";
		
		
		
		p.setDay(day);
		p.setStore(store);
		p.setGrade(grade);
		p.setDetail(detail);
		p.setPrice(price);
		
		List<String> list1 = Arrays.asList(path);
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String str = "";
			while((str = br.readLine()) != null) {
				
				int index1 = str.indexOf("]") + 2;
				int index2 = str.indexOf("원") - 6;
				detail = str.substring(index1, index2);
				
				
				
				
				
					Matcher m1 = Pattern.compile(day).matcher(str);
					Matcher m2 = Pattern.compile(store).matcher(str);
					Matcher m3 = Pattern.compile(grade).matcher(str);
			//		Matcher m4 = Pattern.compile(detail).matcher(str);
					Matcher m5 = Pattern.compile(price).matcher(str);
					
					if(m1.find() && m2.find() && m3.find() && m5.find()) {
						System.out.println(m1.group());
						System.out.println(m2.group());
						System.out.println(m3.group());
						System.out.println(detail);
						System.out.println(m5.group());
					}
				
				Workbook xlsWb = new XSSFWorkbook();
				
				Sheet sheet1 = xlsWb.createSheet("건담");
				int rowNo = 0;
				
				Row head =sheet1.createRow(rowNo++);
				head.createCell(0).setCellValue("날짜");
				head.createCell(1).setCellValue("지점");
				head.createCell(2).setCellValue("등급");
				head.createCell(3).setCellValue("디테일");
				head.createCell(4).setCellValue("금액");

				for(Product p1 : list) {
					Row row = sheet1.createRow(rowNo++);
					row.createCell(0).setCellValue(p1.getDay());
					row.createCell(1).setCellValue(p1.getStore());
					row.createCell(2).setCellValue(p1.getGrade());
					row.createCell(3).setCellValue(p1.getDetail());
					row.createCell(4).setCellValue(p1.getPrice());
				}
				
				xlsWb.write(new FileOutputStream("C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\excel.xlsx"));
//				sheet1.setColumnWidth(0, 10000);
//				sheet1.setColumnWidth(9, 10000);
				
				
				
			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
