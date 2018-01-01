package siz.Delta.lab;

public class Lab15 {

}

// 7-1 *실행안됨.
class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

class CaptionTv extends Tv {
	boolean caption;

	void displayCaption(String txt) {
		if (caption) {
			System.out.println(txt);

		}

	}
}

class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello,World");
		ctv.caption = true;
		ctv.displayCaption("Hello,world");

	}

}

//// 7-3
// class DeckTest {
// public static void main(String args[]) {
// Deck d=new Deck();
// Card c= d.pick(0);
// System.out.println(c);
// d.shffle();
// c=d.pick(0);
// System.out.println(c);
// }
// }
//
// class Deck {
// final int CARD_NUM = 52;
// Card cardArr[] = new Card[CARD_NUM];
//
// Deck() {
// int i = 0;
// for (int k = Card.KIND_MAX; k > 0; k--)
// for (int n = 0; n < Card. NUM_MAX; n++)
// cardArr[i++] = new Card(k, n + 1);
// }
//
// Card pick(int index) {
// return cardArr[index];
// }
//
// Card pick() {
// int index = (int) (Math.random() * CARD_NUM);
// return pick(index);
// }
//
// void shffle() {
// for (int i = 0; i < cardArr.length; i++) {
// int r = (int) (Math.random() * CARD_NUM);
// Card temp = cardArr[1];
// cardArr[i] = cardArr[r];
// cardArr[r] = temp;
// }
// }
// }// deck 클래스끝
//
// class Card {
// static final int KIND_MAX = 4;
// final int NUM_MAX = 13;
// final int SPADE = 4;
// final int DIAMOND = 3;
// final int HEART = 2;
//
// final int CLOVER = 1;
// int kind;
// int number;
//
// card(){
// this(SPADE,1);
// }
//
// Card(int kind,int number){
// this.kind=kind;
// this.number=number;
//
// }
// public string toString() {
// String[] kind= {"","CLOVER","HARRT","DIAMONE","SPADE"};
// String numbers="0123456789XJQK";
// return "kind : "+kinds[this.kind]
// +", number : "+numbers.charAt(this.number);
// }
// }

// 6-22
