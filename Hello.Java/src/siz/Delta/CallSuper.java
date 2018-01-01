package siz.Delta;

public class CallSuper {

	public static void main(String[] args) {
		// 부모클래스의 생성자 호출하기. super()
		// 부모클래스의 메서드 호출하기. super.메서드 이름
		// 자식클래스의 생성자 호출하면
		// 먼저부모클래스를 생성하고 그다음 자식클래스를 생성한다.
		Child c = new Child();
		Child2 c2 = new Child2();
		// 상속관계에서 형변환 - 다형성
		Child c3 = new Child();
		Parent p3 = new Parent();

		p3 = c3; // upcasting
		p3 = new Child();

		c3 = (Child) p3; // downcasting, 명시적 형변환 필요.
		System.out.println(c instanceof Parent);
		System.out.println(c3 instanceof Parent);

		System.out.println(Son instanceof Parent);
	}

}

class Parent {
	protected String name;

	public Parent() {
		System.out.println("Parent의 생성자");

	}

	public String sayName() {
		return name;
	}

	public void sayLove(Daughter d) {
		System.out.println("사랑한다 딸아");
	}

	public void sayLove(Son s) {
		System.out.println("사랑한다 아들아");
	}

	public void sayLove(Parent p) { // 매개변수를 쓸때 코드를 추가하지않고 상의코드만 지정해주면 하위코드를 사용할수있다.
		System.out.println("사랑한다 애들아");
	}

}

class Child extends Parent {
	protected String name;

	public Child() {
		super(); // 컴파일러가 자동으로 추가해줌/ 첫줄에 존재해야함.

		// super와 this 차이.
		super.name = "1"; // 상위의 name을 지정할때 super(); 후 'super.이름' 을통해서 지정가능
		this.name = "2"; // 하위의 name을 지정하고자할때 this.
		super.sayName(); // 상위의 method를 호출할때도.
		System.out.println("Child의 생성자");

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

class Parent2 {
	protected String name;

	public Parent2(String name) {
		System.out.println("parent / " + name);

	}

}

class Child2 extends Parent2 {
	public Child2() {
		super("혜교");

	}

}

final class Daughter extends Parent {

}

final class Son extends Parent {
}// 상속하지 않는 클래스 선언 'final'

// class GrandSon extends sun { }
// 상속불가!
