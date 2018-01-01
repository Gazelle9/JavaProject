package project.v1b;

public class CustomerMain {

	public static void main(String[] args) {
		// 고객 프로그램 객체 생성
		CustomerService cstmer = new CustomerServiceImpl();
		// 고객 객체 생성
		CustomerV0 cs = new CustomerV0(1, "박지성", "810101-1000000", "영국 런던", "010-5000-0001");
		// 고객 등록객체 생성
		cstmer.addCustomer(cs);
		System.out.println(cs);

		cs = new CustomerV0(1, "박지성", "810101-1000000", "영국 런던", "010-5000-0001");
		cstmer.modifyCustomer(cs);

		cstmer.removeCustomer("박지성");

	}

}
