package siz.Delta.lab;

public class Lab14 {

	public static void main(String[] args) {
		// 6-1,6-2,6-3,6-4,6-5,6-8,6-9

	}

}

// 6-1,2
class SutadaCard {
	private int num;
	private boolean isKwang;

	public SutadaCard() {
		this(1, true);

	}

	public SutadaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	String ifo() {
		return num + (isKwang ? "k" : "");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isKwang() {
		return isKwang;
	}

	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return "SutadaCard [num=" + num + ", isKwang=" + isKwang + "]";
	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {

	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

	int tot;
	float avr;

	// getTotal
	public int getTot(int kor, int eng, int math) {
		int tot = kor + eng + math;
		return tot;
	}

	// getAvr
	public int getAvr() {
		avr = (float) (tot / 3.0);
		return (int) avr;

	}
}
