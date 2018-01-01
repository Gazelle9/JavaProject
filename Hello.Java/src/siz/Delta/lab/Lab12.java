package siz.Delta.lab;

public class Lab12 {

	public static void main(String[] args) {

		// 고객
		Customer c = new Customer(1, "박지성", "810101-1000001", "영국 런던", "000-5000-0001");
		Customer c1 = new Customer(2, "김연아", "900101-2000001", "한국 서울", "000-6000-0001");
		Customer c2 = new Customer(3, "장미란", "831201-2000001", "한국 강원", "000-7000-0001");
		Customer c3 = new Customer(4, "추신수", "720101-1000001", "미국 뉴욕", "000-8000-0001");

		// 도서
		Book b = new Book(1, "축구의 역사", "굿스포츠", 7000);
		Book b2 = new Book(2, "축구아는여자", "나무수", 13000);
		// 주문
		Oder o = new Oder("2014-07-01", 1, 1, 7000);
		o.cno = 1;
		o.bno = 1;
		o.cost = 7000;
		o.date = "2014-07-01";
		// 하나하나 타이핑할때
		Student s = new Student();
		s.sno = 201350050;
		s.sname = "김태희";
		s.adr = "경기도 고양시";
		s.age = 25;
		s.birday = "1985.3.22";
		s.major = "컴퓨터공학";
		s.profno = 504;
		s.time = "목 2교시";

		Major m = new Major();
		m.major = "컴퓨터공학";
		m.callno = "123-4567-8901";
		m.office = "E동 2층";
		m.profno = 504;
		m.selectdate = "2007년";

		Subjects sb = new Subjects();
		sb.sno = 0205;
		sb.sname = "프로그래밍";
		sb.sabstract = "자바 프로그래밍";
		sb.profno = 301;

		Professor pr = new Professor();
		pr.profno = 301;
		pr.profname = "이순신";
		pr.pmajor = "프로그래밍";

		// 회원 가입
		Member mebr = new Member();
		mebr = new Member("zzz", "123123", "이름", "qwe123", "2017-12-15");

	}

}

class Customer {
	int cno;
	String name;
	String perNo;
	String adr;
	String mphone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cno, String name, String perNo, String adr, String mphone) {
		this.cno = cno;
		this.name = name;
		this.perNo = perNo;
		this.adr = adr;
		this.mphone = mphone;

	}

}

class Book {
	int bno;
	String name;
	String publComp;
	int cost;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bno, String name, String publComp, int cost) {

		this.bno = bno;
		this.name = name;
		this.publComp = publComp;
		this.cost = cost;
	}

}

class Oder {
	String date;
	int cno;
	int bno;
	int cost;

	public Oder() {
		// TODO Auto-generated constructor stub
	}

	public Oder(String date, int cno, int bno, int cost) {

		this.date = date;
		this.cno = cno;
		this.bno = bno;
		this.cost = cost;
	}

}

class Student {
	int sno;
	String sname;
	String adr;
	int age;
	String birday;
	String major;
	int profno;
	String time;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sno, String sname, String adr, int age, String birday, String major, int profno, String time) {

		this.sno = sno;
		this.sname = sname;
		this.adr = adr;
		this.age = age;
		this.birday = birday;
		this.major = major;
		this.profno = profno;
		this.time = time;
	}

}

class Major {
	String major;
	String callno;
	String office;
	int profno;
	String selectdate;

	public Major() {
		// TODO Auto-generated constructor stub
	}

	public Major(String major, String callno, String office, int profno, String selectdate) {
		this.major = major;
		this.callno = callno;
		this.office = office;
		this.profno = profno;
		this.selectdate = selectdate;
	}

}

class Subjects {
	int sno;
	String sname;
	String sabstract;
	int profno;

	public Subjects() {
		// TODO Auto-generated constructor stub
	}

	public Subjects(int sno, String sname, String sabstract, int profno) {
		this.sno = sno;
		this.sname = sname;
		this.sabstract = sabstract;
		this.profno = profno;
	}

}

class Professor {
	int profno;
	String profname;
	String pmajor;

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(int profno, String profname, String pmajor) {
		this.profno = profno;
		this.profname = profname;
		this.pmajor = pmajor;

	}

}

// 회원가입. 생성자
class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;

	// 기본생성자

	public Member() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수있는 생성자
	public Member(String userid, String passwd, String name, String email, String regdate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}

}