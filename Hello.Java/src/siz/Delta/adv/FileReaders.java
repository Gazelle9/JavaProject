package siz.Delta.adv;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaders {

	public static void main(String[] args) {
		// 파일 입출력- 문자기반 스트림
		// 파일 읽기 테스트 - 파일에 저장된 내용을 읽어서 화면에 출력.
		String fpath = "c:/java/data01.txt";

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fpath);
			// 지정한 경로상의 파일을 읽기위해 읽기 스트림 생성

			br = new BufferedReader(fr);
			// 버퍼기능이 있는 reader클래스 선언

			while (br.ready()) { // fr vs br 스트림에서 읽을 문자가 있는지 출력
				// System.out.print((char) fr.read());
				// 파일에서 한문자씩 읽어서 화면에 출력.

				System.out.println(br.readLine());
				// 파일에서 한 행씩 읽어서 화면에 출력.
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				br.close();

			} catch (Exception ex) {

			}
			try {

				fr.close();

			} catch (Exception e) {

			}
		}

	}

}
