package siz.Delta;

public class Overrides {

	public static void main(String[] args) {
		// 매서드 @Overrides

	}// main의 끝

}// class의 끝

class SungJuk2 {
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	public int getTotal() {
		int tot = kor + eng + mat;
		return tot;
	}

	public double getAvr() {
		double avr = (double) (kor + eng + mat) / 3.0;
		return avr;

	}

	public int getGrade() {
		char grds = '가';
		switch ((int) getAvr() / 10) {
		case 10:
		case 9:
			grds = '수';
		case 8:
			grds = '우';
		case 7:
			grds = '미';
		case 6:
			grds = '양';
			break;
		}
		return grds;
	}
}

class MidSungJuk2 extends SungJuk2 {
	// override란 super-class의 method를 sub-class에 맞게 적용.
	// 재정의 하려면 하위클래스에서 작성해야함.
	//
	protected int sci;
	protected int art;

	@Override // 매서드 재정의
	public int getTotal() {
		return super.getTotal() + sci + art;
	}

	// 일일히 다 고쳐도 되지만 앞선 매서드를 적용하여 일부만 변경할수있다.
	// ex)) super.매서드() 는 super-class 추가변경.?!
	@Override
	public double getAvr() {
		// double avr = (double) (kor + eng + mat + sci + art) / 5.0;
		double avr = getTotal() / 5;
		return avr;
	}

	@Override
	public int getGrade() {

		int avg = (int) getAvr() / 10;
		char grds = '가';
		switch (avg) {

		case 10:
		case 9:
			grds = '수';
		case 8:
			grds = '우';
		case 7:
			grds = '미';
		case 6:
			grds = '양';
			break;
		}
		return grds;
	}

}
