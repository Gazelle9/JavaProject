package siz.Delta;

import osopola.lab.SungJukMain;
import osopola.lab.SungJukService;

// import osopola.lab.*;      //lab패키지 하위 모든 클래스를 load

public class OtherClass {
	public static void main(String[] args) {
		// 다른 클래스 사용(불러오기)하기.
		// 같은 패키지내 다른 클래스는 별다른 과정없이 바로 사용가능.
		Overloads o = new Overloads();
		Overrides r = new Overrides();

		// 다른 패키지 클래스 사용하기
		osopola.lab.SungJukV1 sj = new osopola.lab.SungJukV1();

		// 다른 패키지 클래스 사용하기
		// import문을 사용하면 편리하게 다른 패키지상의 클래스를 사용할수 있음
		SungJukService sjsrv = new SungJukService();// 통합계발환경 ctrl space사용하면 자동 완성
		SungJukMain sjm = new SungJukMain();

	}// main end
}
