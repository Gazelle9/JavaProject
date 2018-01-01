package project.v1b;

public class BookV0 {

	private int bookNo;
	private String bookName;
	private String publier;
	private int cost;

	public BookV0() {
		// TODO Auto-generated constructor stub
	}

	public BookV0(int bookNo, String bookName, String publier, int cost) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.publier = publier;
		this.cost = cost;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublier() {
		return publier;
	}

	public void setPublier(String publier) {
		this.publier = publier;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BookV0 [bookNo=" + bookNo + ", bookName=" + bookName + ", publier=" + publier + ", cost=" + cost + "]";
	}

}
