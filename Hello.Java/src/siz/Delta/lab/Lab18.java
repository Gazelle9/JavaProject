package siz.Delta.lab;

import java.util.Scanner;

public class Lab18 {

	public static void main(String[] args) {
		// 연습문제 7-7*, 7-8, 7-9, 7-10*, 7-15,7-17,8-2,8-8

	}

}

class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;

	}

}

class child extends Parent {
	int x = 3000;

	child() {
		this.x = x;

	}
}

class Exercise7_7 {
	public static void main(String[] args) {
		child c = new child();
		System.out.println("x=" + c.getX());
	}
}

// 7-10
class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;

	public MyTv2() {

	}

	public MyTv2(boolean isPowerOn, int channel, int volume) {
		super();
		this.isPowerOn = isPowerOn;
		this.channel = channel;
		this.volume = volume;
	}

	public boolean isPowerOn() {
		return isPowerOn;

	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}

	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}

	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}

	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}

}

class Exercise7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();

		t.setChannel(10);
		;
		System.out.println("CH:" + t.getChannel());

		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());

	}
}

abstract class unit {
	int x, y; // 현재 위치

	void move(int x, int y) {
		/* 지정된 위치로 이동 */ }

	void stop() {
		/* 현재 위치에 정지 */ }
}

class Marine extends unit { // 보병

	void stimPack() {
		/* 스팀팩을 사용한다. */}
}

class Tank extends unit { // 탱크

	void changeMode() {
		/* 공격모드를 변환한다. */}
}

class Dropship extends unit { // 수송선

	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}

class Exercise8_8 {
	public static void main(String[] args) {
		// answer1~100 사이의 임의의 값을 얻어서 에 저장한다 // .
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		do {
			count++;
			System.out.print("1 100 과 사이의 값을 입력하세요 :");
			// input = new Scanner(System.in).nextInt();

			try {
				input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다 . " + "다시 값을 입력해주세요 .");
				continue;
			}

			if (answer > input) {
				System.out.println(" 더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println(" 더 작은 수를 입력하세요.");
			} else {
				System.out.println(" 맞췄습니다.");
				System.out.println("시도횟수는 " + count + "  번입니다.");
				break; // do-while문을 벗어난다
			}
		} while (true); // 무한반복문
	}
}
