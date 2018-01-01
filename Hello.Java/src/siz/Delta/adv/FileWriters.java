package siz.Delta.adv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {

	public static void main(String[] args) throws IOException {
		// 파일 입출력 - 문자기반 스트림
		// 파일쓰기 테스트
		// 키보드로 입력한 문자를 파일에 저장,

		String fpath = "c:/java/data01.txt";
		// 입력받은 문자를 저장할대 위치지정

		// FileWriter fw = new FileWriter(fpath);

		FileWriter fw = new FileWriter(fpath, true);

		// 스트림생성 지정된 경로에 파일을 만들고
		// 입력한부분 파일로 저장할수있도록 데이터 통로생성

		BufferedWriter bw = new BufferedWriter(fw);
		// 빠른 입출력 처리를 위해 buffer기능이 있는 writer클래스 사용

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("파일에 저장할 내용을 입력하시오(종료는 q:)");
			String msg = sc.nextLine();

			if (msg.equals("q:")) {// 입력한 문자가 q:이면
				break;// while문 중지
			} else {
				// fw.write(msg + "\r\n");// 파일에 저장
				bw.write(msg + "\r\n");// 파일에 저장
			}

		}
		bw.close(); // 순서에 주의! 먼저 만든것을 나중에 닫음
		fw.close();
		// 파일에 입력한 내용을 완전히 저장하려면 반드시 필요.

		sc.close();
	}

}
