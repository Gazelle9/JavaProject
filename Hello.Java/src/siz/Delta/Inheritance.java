package siz.Delta;

public class Inheritance {

	public static void main(String[] args) {
		// 클래스간 상속관계가 형성되면
		// 각 클래스는 is-a 관계가 만들어진다.
		// 자식 클래스의 객체를 부모클래스타입으로 처리가능
		Tiger t = new Tiger();
		Animals t2 = new Tiger();
		Animals e = new Eagle();
		Animals g = new Goldfish();
	}

}

class Animals extends Object {
	protected String eye;
	protected String mouth;
	protected String hp;

	public void eat() {
	}

	public void sleep() {
	}

}

class Tiger extends Animals {
	protected String leg;

	public void run() {

	}

}

class Eagle extends Animals {
	protected String wing;

	public void fly() {

	}
}

class Goldfish extends Animals {
	protected String fin;

	public void swim() {
	}
}
