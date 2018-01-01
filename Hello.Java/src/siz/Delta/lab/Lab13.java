package siz.Delta.lab;

public class Lab13 {
	public static void main(String[] args) {
		Person ps = new Person("이름", "인천 서구", "010-0000-0001");
		// Customer cu= new Customer("이름","인천 서구","010-0000-0001",0001,1000);

		Customer cu = new Customer();

	}
}

// 37
class Person {

	private String name;
	private String adr;
	private String call;

	public Person() {
	}

	public Person(String name, String adr, String call) {
		super();
		this.name = name;
		this.adr = adr;
		this.call = call;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", adr=" + adr + ", call=" + call + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

}

// 37
class Customer {
	private int cusno;
	private String name;
	private String adr;
	private String call;
	private int mile;

	public Customer() {
		this("123-123", "혜교", "서울", 1, 1000);

	}

	public Customer(String name, String adr, String call, int cusno, int mile) {
		super();
		this.cusno = cusno;
		this.name = name;
		this.adr = adr;
		this.call = call;
		this.mile = mile;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", adr=" + adr + ", call=" + call + ", cusno=" + cusno + ", mile=" + mile
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public int getCusno() {
		return cusno;
	}

	public void setCusno(int cusno) {
		this.cusno = cusno;
	}

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}
}

// 38 책**
class Book {
	private String title;
	private int page;
	private String wier;

	public Book() {
		this("자바정석", 500, "남궁성");
	}

	public Book(String title, int page, String wier) {
		super();
		this.title = title;
		this.page = page;
		this.wier = wier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getWier() {
		return wier;
	}

	public void setWier(String wier) {
		this.wier = wier;
	}
}

// 38 잡지
class Magazine {
	private String title;
	private int pp;
	private String wier;
	private String pubdate;

	public Magazine() {
		this("자바정석", 500, "남궁성", "2017-12");
	}

	public Magazine(String title, int pp, String wier, String pubdate) {
		super();
		this.title = title;
		this.pp = pp;
		this.wier = wier;
		this.pubdate = pubdate;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", pp=" + pp + ", wier=" + wier + ", pubdate=" + pubdate + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public String getWier() {
		return wier;
	}

	public void setWier(String wier) {
		this.wier = wier;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

}

// 39 폰
class Phone {
	private String made;
	private int cost;
	private String type;

	public Phone() {
		this("헬지", 500000, "4G");
	}

	public Phone(String made, int cost, String type) {
		super();
		this.made = made;
		this.cost = cost;
		this.type = type;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Phone [made=" + made + ", cost=" + cost + ", type=" + type + "]";
	}
}

// 39 스마트폰

// 멤버변수 설정
class SmartPhone {
	private String made;
	private int cost;
	private String type;
	private String os;
	private int memory;
	private boolean isCamera;
	private boolean isBltos;

	// 생성자
	public SmartPhone() {
		this("헬지", 500000, "5G", "안드로이드", 1024, true, true);
	}

	public SmartPhone(String made, int cost, String type, String os, int memory, boolean isCamera, boolean isBltos) {
		super();
		this.made = made;
		this.cost = cost;
		this.type = type;
		this.os = os;
		this.memory = memory;
		this.isCamera = isCamera;
		this.isBltos = isBltos;

	}

	// to String
	@Override
	public String toString() {
		return "SmartPhone [made=" + made + ", cost=" + cost + ", type=" + type + ", os=" + os + ", memory=" + memory
				+ ", camera=" + isCamera + ", bltos=" + isBltos + "]";
	}

	// get/set
	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isCamera() {
		return isCamera;
	}

	public void setCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public boolean isBltos() {
		return isBltos;
	}

	public void setBltos(boolean isBltos) {
		this.isBltos = isBltos;
	}

}
