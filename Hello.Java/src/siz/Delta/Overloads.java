package siz.Delta;

public class Overloads {

	public static void main(String[] args) {
		// method Overloads - 다중정의
		// 같은 이름을 가지지만 '서명'이 달라야 다중정의가 가능하다.
		System.out.println();

	}

}

class Calaulator {
	public int add(int a, int b) {
		return a + b;
	} // 정수더하기

	public double add(double a, double b) {
		return a + b;
	} // 실수더하기

	public String add(String a, String b) {
		return a + b;
	} // 문자열 더하기
}
