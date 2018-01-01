package project.v2;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukVO;

public class SungJukServiceImpl implements SungJukService {

	// 각종 오류 메세지를 상수로 정의해 둠
	private final String WRONGINPUT = "\n잘못입력하셨습니다!!\n\n\n";

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukVO> sjdb = null;

	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}

	@Override
	public void addSungJuk(SungJukVO sj) {
		processSungJuk(sj);
		sjdb.add(sj);
	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";

		for (SungJukVO sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}

		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size()))
			return "\n잘못된 값 입력!!";

		String fmt = "\n\n%d : %s %d %d %d %d %.1f %s";
		SungJukVO sj = sjdb.get(no - 1);

		StringBuffer sb = new StringBuffer();
		sb.append(String.format(fmt, no, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvrg(),
				sj.getGrd()));

		return sb.toString();
	}

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		processSungJuk(sj); // 성적 재계산
		sjdb.set(no - 1, sj);

		System.out.println("\n성적데이터가 수정되었습니다\n\n");
	}

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		sjdb.remove(no - 1);

		System.out.println("\n성적데이터가 삭제되었습니다\n\n");
	}

	private void processSungJuk(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		}

		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrd(grd);
	}

	private boolean checkSungJukNo(int no, int size) {
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}

}
