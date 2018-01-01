package project.v1;

public class SungJukServiceImpl implements SungJukService {
	// interface를 상속

	@Override
	public void addSungJuk(SungJukV0 sj) {
		processSungJuk(sj);// 성적처리-총점,평균,학점
		System.out.println("새로운 성적 데이터가 추가되었습니다.");

	}

	@Override
	public String getSungJuk() {
		String out = "저장된 성적 데이터를 출력합니다.";
		return null;
	}

	@Override
	public String getSungJuk(String name) {

		return name;
	}

	@Override
	public void modifySungJuk(SungJukV0 sj) {
		System.out.println("저장된 성적 데이터를 수정합니다.");

	}

	@Override
	public void removeSungJuk(String name) {
		System.out.println("저장된 성적 데이터를 삭제합니다.");

	}

	private void processSungJuk(SungJukV0 sj) { // 성적처리 메서드
		int tot = sj.getKor() + sj.getKor() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
		case 8:
			grd = "우";
		case 7:
			grd = "미";
		case 6:
			grd = "양";
		}
		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrd(grd);

	}

}
