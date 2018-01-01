package siz.Delta.lab;

public class SungJukMain {

	public static void main(String[] args) {
		// 데이터 생성
		SungJukV0 혜교 = new SungJukV0("혜교", 98, 97, 99);

		// 데이터처리
		SungJukService sjsrv = new SungJukService();
		// 데이터수 만큼 인수로 전달하는 것은 비효율적
		// int tot = sjsrv.getTotal(혜교.getKor(), 혜교.getEng(), 혜교.getMat());
		// 메서드 다중정의를 통해 새로운 유형의 getTotal 메서드 작성
		int tot = sjsrv.getTotal(혜교);
		double avrg = sjsrv.getAverage();
		String grd = sjsrv.getGrade();

		혜교.setTot(tot);
		혜교.setAvrg(avrg);
		혜교.setGrd(grd);

		// 결과
		System.out.println(혜교);

	}

}
