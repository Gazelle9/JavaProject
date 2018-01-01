package project.v1b;

public class CustomerServiceImpl implements CustomerService {

	public static void main(String[] args) {

	}

	@Override
	public String addCustomer(CustomerV0 cs) {
		System.out.println("새로운 고객정보를 등록합니다.");
		return null;
	}

	@Override
	public String getCustomer() {
		return null;
	}

	@Override
	public String getCustomer(String cstrname) {
		System.out.println("새로운 고객정보를 조회합니다.");
		return null;
	}

	@Override
	public void modifyCustomer(CustomerV0 cstrname) {
		System.out.println("등록된 고객정보들을 수정합니다.");

	}

	@Override
	public void removeCustomer(String name) {
		System.out.println("등록된 고객정보들을 제거합니다.");

	}

}
