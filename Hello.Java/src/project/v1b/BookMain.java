package project.v1b;

public class BookMain {

	public static void main(String[] args) {
		// 책 정보 시스템 객체를 생성
		BookService bookInfo = new BookServiceImpl();
		// 책 정보 객체 생성
		BookV0 bks = new BookV0(1, "축구의 역사", "굿 스포츠", 7000);
		// 책 등록객체 생성
		bookInfo.addBookInfo(bks);
		System.out.println(bks);
		// 책 수정개체 생성
		bks = new BookV0(1, "축구의 역사", "굿 스포츠", 7020);

		bookInfo.modifyBookInfo(bks);
		// 책 삭제개체 생성
		bookInfo.removeBookInfo("축구의 역사");

	}

}
