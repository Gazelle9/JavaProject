package project.v3;

public interface SungJukService {
	// 성적 데이터 CRUD 처리 - 저장,조회,수정,삭제

	void addSungJuk(SungJukVO sj);

	String getSungJuk();

	String getSungJuk(int no); // 번호로 조회

	void modifySungJuk(SungJukVO sj, int no); // 번호로 조회후 수정

	void removeSungJuk(int no); // 번호로 삭제

}
