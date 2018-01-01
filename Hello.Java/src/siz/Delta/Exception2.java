package siz.Delta;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exception2 {
	public static void main(String[] args) {
		// 예외처리2 -multi catch block
		// 각각의 코드에 try-catch를 사용하는것보다
		// 하나의 try catch블럭을 사용하고 여러개의 catch문으로 예외출력처리하는것이 효율적.

		try {

			int[] intArray = { 9, 2, 5, 4, 7 };

			System.out.println(intArray[25]);

			int x = 1000 / 0;

			FileReader fr = new FileReader("");

			DriverManager.getConnection("");
			// }catch(Exception ex) {
			// System.out.println("예상치못한 예외발생");// 모든것을 커버하는 catch문이라 이하의 catch에 오류
		} catch (ArrayIndexOutOfBoundsException ary) {
			System.out.println("잘못된 배열");
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식사용");
		} catch (FileNotFoundException ffe) {
			System.out.println("올바른 파일경로 지정하시오");
		} catch (SQLException se) {
			System.out.println("올바른 데이터베이스 서버주소를 설정하시오");
		}

		// finally 블럭
		// 나머지 코드를 실행하지 않고 예외처리
		// 꼭 시행해야하는 코드가 있을때는 finally블럭에 작성.
		try {
			// 데이터베이스 서버연결
			// sql처리 및 기타 작업
		} catch (Exception ex) {
			System.out.println("예외처리함");
		} finally {
			// 데이터베이스 서버 끊음

		}
	}
}

class MakeException1 {
	public void exception1() {
		int[] intArray = { 9, 2, 5, 4, 7 };

		System.out.println(intArray[25]);

	}

	public void exception2() throws ArithmeticException {
		int x = 1000 / 0;

	}
}