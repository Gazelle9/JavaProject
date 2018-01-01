package siz.Delta;

public class Methods {

	public static void main(String[] args) {

		; // 빈 문장도 적법
		{ // 블럭 시작
			// 블럭 내부에서 선언한 변수는 '지역변수'라고 한다.
			// 지역변수는 블럭 안에서만 유효
			// 해당 블럭을 벗어나면 사용불가!!!
			// 변수의 유효범위'Scope'를 주의할것!.
			String name = "혜교";
			int kor = 89;

		} // 블럭 끝

		// name="지현"; //블럭 밖에서 변수 선언시 오류가 생김.

		{
			String name = "혜교";
			{
				// String name="혜교";
				// 오류발생 바깥블럭에서 선언한 name이 안쪽블럭까지 영향을 미침

			}
		}
		// 위 블럭에 선언한 name변수의 유효범위는
		// 해당블럭내 이므로 블럭 바깥에 선언한 변수와 겹치지 않음.
		String name = "혜교";

		// 메서드
		// 어떤 기능을 하는 문장들을 블럭으로 정의하고 그것에 이름을 붙인것.
		// 가독성과 코드 재사용성을 높이기 위해 사용

		// 접근수정자 반환값 메서드이름(매개변수 목록) {
		// 메서드를 구성하는 문장
		// }

		int a = 3, b = 4;

		// int c = a + b;
		int c = add(a, b);

		a = 10;
		b = 15;

		c = add(a, b);

		a = 45;
		b = 78;

		c = add(a, b);

		// 클래스 / 인스턴스 변수 **이해안가는데.....
		System.out.println(Cars.count);
		Cars 스포츠카 = new Cars();
		스포츠카.name = "페라리";
		스포츠카.type = "스포츠";
		System.out.println(++스포츠카.count);
		System.out.println(Cars.count);

		스포츠카.printCarinfo();

		Cars 트럭 = new Cars();
		++트럭.count;
		System.out.println(++트럭.count);
		System.out.println(Cars.count);
		트럭.printCarinfo();

	} // main의 끝

	// Method

	public static int add(int a, int b) {

		return a + b;
	}

}

class Cars {
	String name; // 인스턴스변수
	String type;
	static int count; // 클래스 변수

	public void printCarinfo() {
		System.out.println(name + "/" + count);
	}

	public static void showCount() {
		System.out.println(count);

	}

	public static void showName() {
		// 멤버변수 name을 출력하기 위해
		// showName 메서드 작성
		// showName 하지만 showName 메서드는 stasic이므로 멤버변수는 사용불가.

		// System.out.println(name);

	}

}