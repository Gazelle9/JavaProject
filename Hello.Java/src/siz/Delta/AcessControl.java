package siz.Delta;

public class AcessControl {
	public static void main(String[] args) {
		// defualt 접근 제한자 테스트
		// Animal 클래스는 default접근제어 부여
		// 같은패키지에 존재하는
		// Access control클래스에서 접근가능

		// Animal1 lion;
		// lion = new Animal();

		DefaultClass dc = new DefaultClass();
		dc.name = "해교"; // default
		dc.age = 29; // protected
		dc.email = "asd@qwe.com"; // public
		// dc.regdate = "2017-12-15"; // private
		dc.setRegdate("2017-12-15");// setter
		// System.out.println(dc.redate);
		System.out.println(dc.getRegdate()); // getter (printout할때)

		// 객체의 생성값 확인
		DefaultClass dc1 = new DefaultClass();
		System.out.println(dc1);

		dc1 = new DefaultClass();
		System.out.println(dc1);

		dc1 = new DefaultClass();
		System.out.println(dc1);

	}
}

class DefaultClass {
	// 멤버변수에 허용된
	String name;// default
	protected int age;// protected
	public String email;// public
	private String regdate;// private

	// private로 선언된 멤버변수를 외부 클래스에서 접근하게 할려면
	// setter/getter 메서드를 사용
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getRegdate() {
		return regdate;
	}
}
