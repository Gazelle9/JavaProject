package project.v3;

import java.util.Scanner;

public class SungJukMain {

	private static SungJukServiceImpl sjsrv = null;
	private final static String EXITERROR = "\n종료작업시 희박하게 오류발생@!\n";
	private final static String SAYGOODBYE = "\n즐거운 하루 되세요! ^^\n";

	public static void main(String[] args) throws Throwable {
		sjsrv = new SungJukServiceImpl();

		while (true) {
			displayMenu();
			selectMenu();
		}
	}

	private static void displayMenu() {
		// 메뉴출력
		StringBuffer menu = new StringBuffer();
		menu.append(" -= 성적 처리 프로그램 v2 =- \n").append("-----------------------\n").append(" 1 : 새로운 성적데이터 추가 \n")
				.append(" 2 : 전체 성적데이터 조회 \n").append(" 3 : 성적데이터 상세 조회 \n").append(" 4 : 성적데이터 수정 \n")
				.append(" 5 : 성적데이터 삭제 \n").append(" 0 : 성적처리프로그램 종료 \n").append("-----------------------\n")
				.append("실행할 작업을 선택하세요 >> ");

		System.out.print(menu.toString());
	}

	private static void selectMenu() throws Throwable {
		// 메뉴를 선택하고 작업 분기
		Scanner sc = new Scanner(System.in);

		// 입력한 문자를 ASCII로 변환해서 정수로 저장
		int smenu = sc.next().charAt(0);

		switch (smenu - 48) {
		case 1:
			newSungJuk();
			break;
		case 2:
			showSungJuk();
			break;
		case 3:
			showOneSungJuk();
			break;
		case 4:
			updateSungJuk();
			break;
		case 5:
			deleteSungJuk();
			break;
		case 0:
			exitSungJuk();
			break;
		}
	}

	private static void newSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n추가할 성적데이터를 입력하세요").append("\n데이터 입력순서는 이름/국어/영어/수학 입니다").append("\n예) 수지 78 65 21")
				.append("\n>> ");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		SungJukVO sj = new SungJukVO(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		sjsrv.addSungJuk(sj);

		sb.setLength(0);
		sb.append("\n성적 데이터 성공적으로 저장!!\n\n");

		System.out.println(sb.toString());
	}

	private static void showSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n -= 전체 데이터 출력 =- \n").append(sjsrv.getSungJuk()).append("\n\n");

		System.out.print(sb.toString());
	}

	private static void showOneSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n검색할 성적번호를 입력하세요").append("\n>> ");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		sb.setLength(0);
		sb.append("\n\n-= 상세 성적 데이터 =- ").append(sjsrv.getSungJuk(no)).append("\n\n\n");

		System.out.print(sb.toString());

	}

	private static void updateSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n수정할 성적번호를 입력하세요!\n>> ");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		sb.setLength(0);
		sb.append("\n수정할 성적데이터를 입력하세요").append("\n데이터 입력순서는 이름/국어/영어/수학 입니다").append("\n예) 혜교 45 98 32")
				.append("\n>> ");

		System.out.print(sb.toString());

		SungJukVO sj = new SungJukVO(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		sjsrv.modifySungJuk(sj, no);

	}

	private static void deleteSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n삭제할 성적번호를 입력하세요\n>> ");
		System.out.print(sb.toString());

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		sjsrv.removeSungJuk(no);

	}

	private static void exitSungJuk() throws Throwable {
		try {
			sjsrv.finalize();
			System.out.println(SAYGOODBYE);

		} catch (Exception e) {
			System.out.println(EXITERROR);
		}
		System.exit(0);

	}

}
