package project.v1b;

public class BookServiceImpl implements BookService {

	@Override
	public String addBookInfo(BookV0 bk) {
		System.out.println("새로운 책 정보를 입력합니다.");
		return null;
	}

	@Override
	public String getBookInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBookInfo(String bookName) {
		System.out.println("등록된 책 정보를 조회합니다.");
		return null;
	}

	@Override
	public void modifyBookInfo(BookV0 bookName) {
		System.out.println("등록된 책 정보를 수정합니다.");

	}

	@Override
	public void removeBookInfo(String name) {
		System.out.println("등록된 책 정보를 삭제합니다.");

	}

}
