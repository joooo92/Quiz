package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 파일명을 입력을 받습니다. 
		 * 2. 입력받은 파일을 filecopy로 복사해서 옮겨주면 됩니다.
		 * 3. 자원해제 주의!
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일명을 입력하세요: ");
		String name = scan.next();
		
		String read = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + name;
		String write = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\" + name;
		
			
		try(InputStream in = new FileInputStream(read);
				OutputStream out = new FileOutputStream(write)){
			
				byte[] arr = new byte[1024];
				
				int result;
				while((result = in.read(arr)) != -1) {
					out.write(arr, 0, result);
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
		}
		
		
		
		
		
	}


