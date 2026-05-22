package ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestEx {

	public static void main(String[] args) {
		
		  try {

	            // 파일 열기
	            FileReader fr = new FileReader("src/ex/test.txt");

	            // 한 글자씩 읽기
	            int data;

	            while ((data = fr.read()) != -1) {

	                System.out.print((char)data);
	            }

	            // 파일 닫기
	            fr.close();

	            System.out.println("\n파일 읽기 완료");

	        } catch (IOException e) {

	            System.out.println("파일이 없거나 읽는 중 오류 발생");
	        }
	}

}
