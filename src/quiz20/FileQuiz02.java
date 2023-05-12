package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class FileQuiz02 {
	public static void main(String[] args) {
		
          
//       1. Date클래스를 이용해서 File경로에 하위폴더로 230504file 폴더를 생성합니다
//       2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
//       3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
//          \r\n을 적절하게 이용해서 파일 출력을 완료 
//       4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.

		

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		
		String folder = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now + "file";
		
		try {
			File f = new File(folder);
			
			if(f.exists() == false) {
				f.mkdir();
				System.out.println("폴더명은 " + now + "입니다.");
				System.out.println("폴더생성 완료");
			}else {
				System.out.println("이미 폴더가 존재합니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명을 입력하세요: ");
		String fileName = scan.next();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(folder + "\\" +fileName + ".txt", true))) {
			String str = "";
			while(true) {
				System.out.print("내용을 쓰렴");
				str = scan.next();
				
				if(str.equals("그만")) {
					break;
				}
				
				bw.write(str);
				bw.write("\r\n");
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (BufferedReader bw = new BufferedReader(new FileReader(folder + "\\" +fileName + ".txt"))) {
			
			String result;
			while((result = bw.readLine()) != null) {
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
