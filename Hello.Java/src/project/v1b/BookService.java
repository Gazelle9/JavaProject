package project.v1b;

public interface BookService {
	String addBookInfo(BookV0 bk); // 서적등록

	String getBookInfo();

	String getBookInfo(String bookName);// 서적확인

	void modifyBookInfo(BookV0 bookName);// 수정

	void removeBookInfo(String name); // 삭제
}
