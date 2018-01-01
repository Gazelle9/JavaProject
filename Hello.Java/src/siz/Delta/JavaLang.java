package siz.Delta;

import project.v1.SungJukV0;

public class JavaLang {

	public static void main(String[] args) throws ClassNotFoundException {
		// 정적방식으로 객체생성
		// 생성할 객체의 클래스를 직접기술
		SungJukV0 sj = new SungJukV0();
		Parent p = new Parent();
		Son s = new Son();

		// 동적으로 객체 생성
		// 클래스를 배열로 동적으로 구동.

		Class obj1 = new SungJukV0().getClass();
		Class obj2 = SungJukV0.class;
		Class obj3 = Class.forName("project.v1.SungJukV0");
		// 클래스목록을 배열로 선언
		String[] cls = { "project.v1.SungJukV0", "osopola.Son", "osopola.Parent" };
		Class[] clsBase = new Class[3];
		// for 문을 통해 생성.
		for (int i = 0; i < 3; ++i) {
			clsBase[i] = Class.forName(cls[i]);

		}

		// 동적으로 생성한 클래스 이름확인
		System.out.println(clsBase[0].getName());
		System.out.println(clsBase[1].getName());
		System.out.println(clsBase[2].getName());

		// 클래스의 정보를 확인 - reflection

		// 문자열 클래스 - String :변경불가 클래스
		String a = "abc";
		// char[] a={'a','b','c'}; 로 표현한것과 동일하다.

		System.out.println(a);
		a = "xcx"; // xcx가 들어갈 공간을 새로 만듦.
		System.out.println(a);

		// +연산자로 문자열 연결시 심각한 리소스 낭비 발생
		a = "1" + "2" + "3" + "4" + "5";
		// 따라서 StringBuffer를 사용할것을 추천.
	}

}
