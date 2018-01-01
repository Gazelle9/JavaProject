package project.v1b;

public class CustomerV0 {
	private int cstrNo;
	private String cstrName;
	private String cstrPerNo;
	private String cstrAdr;
	private String cstrPhon;

	public CustomerV0() {

	}

	public CustomerV0(int cstrNo, String cstrName, String cstrPerNo, String cstrAdr, String cstrPhon) {
		super();
		this.cstrNo = cstrNo;
		this.cstrName = cstrName;
		this.cstrPerNo = cstrPerNo;
		this.cstrAdr = cstrAdr;
		this.cstrPhon = cstrPhon;
	}

	public int getCstrNo() {
		return cstrNo;
	}

	public void setCstrNo(int cstrNo) {
		this.cstrNo = cstrNo;
	}

	public String getCstrName() {
		return cstrName;
	}

	public void setCstrName(String cstrName) {
		this.cstrName = cstrName;
	}

	public String getCstrPerNo() {
		return cstrPerNo;
	}

	public void setCstrPerNo(String cstrPerNo) {
		this.cstrPerNo = cstrPerNo;
	}

	public String getCstrAdr() {
		return cstrAdr;
	}

	public void setCstrAdr(String cstrAdr) {
		this.cstrAdr = cstrAdr;
	}

	public String getCstrPhon() {
		return cstrPhon;
	}

	public void setCstrPhon(String cstrPhon) {
		this.cstrPhon = cstrPhon;
	}

}
