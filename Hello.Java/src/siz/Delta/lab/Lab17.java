package siz.Delta.lab;

public class Lab17 {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new tv());
		b.buy(new Computer());

		System.out.println("현재남은 돈은" + b.money + "만원 입니다.");
		System.out.println("현재 보너스점수는" + b.bonusPoint + "점 입니다.");

	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class tv extends Product {
	tv() {
		super(100);

	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200);

	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");

	}
}
