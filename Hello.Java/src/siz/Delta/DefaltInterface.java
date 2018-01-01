package siz.Delta;

public class DefaltInterface {

	public static void main(String[] args) {
		// 인터페이스의 업캐스팅

		// 일반 호출
		Sportcar sc = new Sportcar();
		sc.move();
		sc.OpenRoof();
		// Movable isc =new Movable(); //interface라서 불가;

		// 업캐스팅 호출
		Movable isc = new Sportcar();
		isc.move();
		// isc.OpenRoof(); # Sportcar에만 존재함.

		Sportcar spc = (Sportcar) isc;
		spc.OpenRoof(); // 다운캐스팅

	}

}

interface A {
	void sayHello();

	// void sayHello(String msg);
	default void sayHello(String msg) {
	}
	// defualt 메서드 : JDK8.0부터 지원.
}

class x implements A {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub

	}

}

class Y implements A {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub

	}

}
// 업캐스팅 테스트 예제

interface Movable {
	void move();
}

class Sportcar implements Movable {

	@Override
	public void move() {
	}

	public void OpenRoof() {
	}

}