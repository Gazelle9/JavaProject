package project.v1;

public class SungJukMain {

	public static void main(String[] args) {
		// Main의 역할 : 서비스의 객체를만들어서 CRUD 호출

		// 성적프로그램 관련 객체 생성
		SungJukService sjsrv = new SungJukServiceImpl();

		// 성적 객체 생성
		SungJukV0 sj = new SungJukV0("혜교", 99, 98, 99);

		// 성적추가
		sjsrv.addSungJuk(sj);
		System.out.println(sj);
		// 성적 수정
		sj = new SungJukV0("혜교", 55, 87, 12);
		sjsrv.modifySungJuk(sj);

		// 성적 삭제
		sjsrv.removeSungJuk("혜교");

	}

}
