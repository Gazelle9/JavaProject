package siz.Delta;

public class Strings {
	public static void main(String[] args) {
		// Strign클래스 주요 메서드
		String s = "Hello";
		String n = "12346789";
		String animal = "dog,cat,duck,cow";
		String at = "java.lang.object";
		String blank = "                a    b         ";
		// charAt(); 지정 위치의 문자를 알려준다.
		char c1 = s.charAt(1);
		char c2 = n.charAt(4);
		System.out.println(c1);
		System.out.println(c2);

		// boolean contains(); 지정된 문자열이 있는지 검사한다.
		boolean s1 = s.contains("lo");
		boolean s2 = n.contains("9958");
		System.out.println(s1); // 문자열 있을때 true
		System.out.println(s2); // 문자열 있을때 false

		// boolean equals(); 문자열을 비교(대소문자 구분)
		boolean e1 = s.equals("Hello");// 문자열 있을때
		boolean e2 = n.equals("a");// 문자열 없을때
		System.out.println(e1);
		System.out.println(e2);

		// boolean equalsIgnoreCase(); 문자열을 비교(대소문자 구분 없이)
		boolean e3 = s.equalsIgnoreCase("hello");
		boolean e4 = s.equalsIgnoreCase("HELLO");
		System.out.println(e3);
		System.out.println(e4);

		// int indexof(); 주어진 문자열이 존재하는지 확인 (찿지못하면 -1)
		int idx1 = s.indexOf('e', 0); // ('찿는문자열',확인 시작 위치)
		int idx2 = s.indexOf('k');
		System.out.println(idx1);
		System.out.println(idx2);

		// int length(); 문자열의 길이
		int lgt1 = s.length();
		System.out.println(lgt1);

		// String replace(char old,char new); 문자열을 새로운 문자로 교체
		String rp1 = s.replace("H", "Say H");
		System.out.println(s);
		System.out.println(rp1);// 바꾼문자는 rp1에 저장

		// String[] split(); 문자열을 지정된 분리자로 나누어 배열에 담아 반환.
		// **중요 ASCII형식이나 Binary형식의 파일을 분리하고, 문자열을 변경할시 사용될수 있을듯.
		String[] spl = animal.split(",");
		for (int i = 0; i < 3; i++) {
			System.out.println(spl[i]);
		}

		// String substring(); 시작위치에서 끝 위치에 포함된 문자열을 얻는다.
		String subs = at.substring(10); // 10번째 문자열 ~끝
		String subs2 = at.substring(3, 9);// 3번째 문자열 ~ 9번째 문자열
		System.out.println(subs);
		System.out.println(subs2);

		// String trim(); 문자열의 왼쪽끝, 오른쪽 끝의 공백을 없앤 결과를 반환
		String trim1 = blank.trim();
		System.out.println(trim1);

		// Static String valueOf(); 지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우 toString()의 호출결과
		String b = String.valueOf(true);
		String c = String.valueOf("a");
		String i = String.valueOf(44);
		String l = String.valueOf(100l);
		String f = String.valueOf(25f);
		String d = String.valueOf(25);

		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);

		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(dd);

		// *[StringBuffer] 선언*
		StringBuffer sb = new StringBuffer();
		// StringBuffer 문자열 개수 설정 (3개의 문자열을담을수있음)

		// StringBuffer-append(); 문자열 추가
		StringBuffer sb2 = sb.append("가나다\n");
		StringBuffer sb3 = sb.append(123);
		System.out.println(sb2);
		System.out.println(sb3);
		StringBuffer sb4 = sb.append(1233);
		// StringBuffer사이즈
		int buffersize = sb.capacity();
		System.out.println(buffersize);
		// StringBuffer길이
		int bufferlength = sb.length();
		System.out.println(bufferlength);

		StringBuffer sbf1 = new StringBuffer("abc");
		StringBuffer sbf2 = new StringBuffer("abc");

		System.out.println("sbf1==sbf2 : " + (sbf1 == sbf2));
		System.out.println("sbf1.equals(sbf2) : " + sbf1.equals(sbf2));
		String sq = sbf1.toString(); // String sq = new String(sbf1)과 동일
		// string 과 stingbuffer비교
		String stl = "abc";
		// System.out.println("sbf1==stl : " + (sbf1 == stl)); 비교 불가 ㅜ
		System.out.println("sbf1.equals(stl : " + sbf2.equals(stl)); // 모두 같은 abc지만 문자열이 동일하지 않음

	}
}
