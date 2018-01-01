package project.v1;

public interface SungJukService {
	// 성적 데이터 CRUD처리 interface - 저장, 조회, 수정, 삭제.

	void addSungJuk(SungJukV0 sj); // 저장(클래스로 만들어서 통채로 넘김.)

	String getSungJuk(); // 조회

	String getSungJuk(String name);

	void modifySungJuk(SungJukV0 sj);// 수정

	void removeSungJuk(String name); // 삭제

}
