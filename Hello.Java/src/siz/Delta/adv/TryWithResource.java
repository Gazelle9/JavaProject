package siz.Delta.adv;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {
		// try-with-resources 구문
		// 파일 입출력 관련 코드 작성시 예외처리 코드를 다루기 불편한 상황발생-특히finally블럭
		// 이런경우 try-with-resources구문을 사용하면 예외처리가 간편하게 할수있고 finally블럭 문제도 쉽게 해결
		// close 메서드가 Autoclosable 인터페이스를 구현했기때문에 가능
		String fpath = "c:/java/data01.txt";

		try (FileReader fr = new FileReader(fpath); BufferedReader br = new BufferedReader(fr);) {

			while (br.ready()) { // fr vs br 스트림에서 읽을 문자가 있는지 출력
				// System.out.print((char) fr.read());
				// 파일에서 한문자씩 읽어서 화면에 출력.

				System.out.println(br.readLine());
				// 파일에서 한 행씩 읽어서 화면에 출력.
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

}
