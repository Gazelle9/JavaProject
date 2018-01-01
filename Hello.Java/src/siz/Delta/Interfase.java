package siz.Delta;

import osopola.lab.SungJukService;

public class Interfase {

	public static void main(String[] args) {
		// 인터페이스 -객체화 불가 클래스
		// 인터페이스를 구현한 클래스를 통해객체화 가능

		// ISungJukService isjsrv=new ISungJukService();

		ISungJukService sjsrv = new SungJukServiceImpl();
		sjsrv.getAverage();

		// 타입 변환 (업/다운 캐스팅)
		// 인터페이스의 참조변수로 구현한 클래스의 객체를 할당할 수 있음
		ISungJukService isjsrv = (ISungJukService) new SungJukService();

		// 추상 클래스 객체 생성가능?
		// 추상 메서드를 포함한 클래스를 의미 - 객체화 불가.
		// abstractClass ac = new abstractClass();

		// 추상클래스의 객체화는 상속을 통해 가능!
		CompleteClass cpc = new CompleteClass();
	}

}

interface ISungJukService {
	int tot = 0; // 상수 (초기화필요!!)
	double avg = 0.0;

	abstract void getTotal(); // 추상 매서드 (abstract쓰나안쓰나 상관x)

	void getAverage();

	void gerGrade();

}

class SungJukServiceImpl implements ISungJukService {

	@Override
	public void getTotal() {

	}

	@Override
	public void getAverage() {

	}

	@Override
	public void gerGrade() {

	}

}

abstract class abstractClass {
}

class CompleteClass extends abstractClass {
}

class unit {
}

interface Fightable {
	void move(int x, int y);

	void attack(unit u);

}// 미완된 메서드 포함

class Firebat implements Fightable {

	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(unit u) {
	}

}

// 인터페이스를 구현하는중 인터페이스의 모든 추상메서드를 구현할 필요가 없으면
// 추상클래스로 만들면 된다.
abstract class Medic implements Fightable {
	@Override
	public void move(int x, int y) {
	}

}