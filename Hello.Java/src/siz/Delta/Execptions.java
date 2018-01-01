package siz.Delta;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Execptions {

	public static void main(String[] args) throws SQLException {
		// unchecked 예외처리 -개발자가 직접 인지하고 예외처리
		int[] intArray = { 9, 2, 5, 4, 7 };
		System.out.println(intArray[2]);

		try {
			System.out.println(intArray[5]);
		} catch (Exception ex) {
			System.out.println("오류발생!");
			// System.out.println(ex.getMessage());
			// ex.printStackTrace();
		} // 시도해서 나타나는 오류를 받아 catch로 나타냄.

		try {
			int x = 1000 / 0;
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());

		}

		// checked 예외 -컴파일러가 미리 예외처리에 대한 정보 알림
		String fpath = "c:/Java/abc.dat";
		try {
			FileReader fr = new FileReader(fpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 관련 예외 발생");

		}
		// 예외처리 좋은예
		Scanner sc = new Scanner(System.in);
		int key = 999;
		while (true) {
			System.out.println("숫자만 입력하시오");

			try {
				key = sc.nextInt();
				if (key == 0)
					break;
			} catch (Exception e) {
				// 무한반복 방지 스캐너 초기화
				sc = new Scanner(System.in);
			}
			System.out.println("문자는 입력불가요!");

		}
		sc.close();

		// 데이터 베이스 서버 접속코드 - checked예외
		// throws 구문으로 이메서드를 호출한 사위메서드로 예외처리를 던짐(처리를 대신해달라고 짬처리)
		DriverManager.getConnection("...");

		System.out.println("이글이 보이나요?");
	}
}
