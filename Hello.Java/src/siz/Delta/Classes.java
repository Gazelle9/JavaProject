package siz.Delta;

import osopola.lab.SungJukV0;

public class Classes {

	public static void main(String[] args) {
		// // 클래스 - 객체를 만들기위한 틀, 설계도
		// Animal1 tiger = new Animal();
		//
		// tiger.name = "호돌이";
		// tiger.weight = 100;
		// tiger.type = "호랑이";
		// tiger.gender = "수컷";
		//
		// tiger.move();
		// tiger.eat();
		// System.out.println(tiger.name);
		// System.out.println(tiger.type);
		// System.out.println(tiger.gender);
		// System.out.println(tiger.weight);
		//
		// // shark
		// Animal1 shark = new Animal();
		// shark.name = "상어상어";
		// shark.weight = 2000;
		// shark.type = "생선";
		// shark.gender = "수컷";
		//
		// shark.eat();
		// shark.move();
		// System.out.println(shark.name);
		// System.out.println(shark.type);
		// System.out.println(shark.gender);
		// System.out.println(shark.weight);
		//
		// // eagle
		//
		// Animal1 eagle = new Animal1();
		//
		// eagle.name = "독수리";
		// eagle.weight = 10;
		// eagle.type = "조류";
		// eagle.gender = "암컷";
		//
		// eagle.move();
		// eagle.eat();
		// System.out.println(eagle.name);
		// System.out.println(eagle.type);
		// System.out.println(eagle.gender);
		// System.out.println(eagle.weight);
		//
		// Animal1 tiger2 = new Animal1();
		// System.out.println(tiger2.name);
		// System.out.println(tiger2.gender);
		// System.out.println(tiger2.type);
		// System.out.println(tiger2.weight);
		//
		// Animal1 cat = new Animal1();
		// System.out.println(cat.name);
		// System.out.println(cat.type);
		//
		// cat = new Animal1("고순이", 25, "암컷", "고양이");
		//
		// System.out.println(cat.name);
		// System.out.println(cat.weight);
		// System.out.println(cat.type);

		SungJukV0 sj = new SungJukV0("해교", 90, 98, 77);
		System.out.println(sj);

	}// main end

}// class end

class Anima1 { // 동물 클래스 +(두번째 클래스는 public은 생략.)

	// 필드(맴버 변수)
	// 변수들을 의미하고, 기본자료형
	String name;
	int weight;
	String gender;
	String type;

	public void Animal() {

		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int weight, String gender, String type) {
		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type;
	}

	// 기본생성자
	public Animal() {

	}

	// 메서드
	void move() {
		System.out.println(name + "이(가) 움직였다.");
	}

	void eat() {
		System.out.println(name + "이(가) 먹이를 먹었다.");
	}

}

// setter/getter;

class Car {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Engin getEngin() {
		return engin;
	}

	public void setEngin(Engin engin) {
		this.engin = engin;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Wheel getWhell() {
		return whell;
	}

	public void setWhell(Wheel whell) {
		this.whell = whell;
	}

	String name; // 참조자료형
	int size;
	// 클래스는 클래스의 멤버 변수로 선언가능.
	Engin engin;
	Door door;
	Wheel whell;
}

class Engin {
}

class Door {
}

class Wheel {
}
