package project.v1b;

public interface CustomerService {
	String addCustomer(CustomerV0 cs);// 고객등록

	String getCustomer();

	String getCustomer(String cstrname);// 고객확인

	void modifyCustomer(CustomerV0 cstrname);// 수정

	void removeCustomer(String name); // 삭제
}
