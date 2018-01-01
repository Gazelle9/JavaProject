package siz.Delta.adv;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import project.v2.SungJukVO;

public class HashMaps {

	@SuppressWarnings({ "rawtypes", "unlikely-arg-type", "unused", "deprecation" })

	public static void main(String[] args) {
		// 해시맵 - 데이터 저장은 느리지만, 많은양의 데이터 검색시 유리.
		// 키와 값으로 데이터를 저장- 키는 중복x, 값은 중복 허용.

		HashMap<Integer, String> hmap1 = new HashMap<>();
		// K(키)는 숫자형, V(값)은 문자형인 HashMap 객체 생성.
		HashMap<String, SungJukVO> hmap2 = new HashMap<>();
		// K(키)는 문자형, V(값)은 SungJukVO인 HashMap 객체 생성.

		// HashMap에 각 요소 추가
		hmap1.put(11, "혜교");
		hmap1.put(7, "날두");
		hmap1.put(31, "수지");
		hmap1.put(41, "지현");
		hmap1.put(21, "중기");

		// 특정키로 검색하기
		System.out.println("K(키) = 7 : " + hmap1.get(7));
		System.out.println("K(키) = 31 :" + hmap1.get(31));

		// 특정 키 삭제.
		System.out.println("K(키) = 31 :" + hmap1.get(31));
		hmap1.remove(31);
		System.out.println("K(키) = 31 :" + hmap1.get(31));

		// 모든 내용 출력
		Iterator<Integer> it = hmap1.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "/" + hmap1.get(key));
		}

		SungJukVO sj0 = new SungJukVO("혜교", 98, 78, 56);
		SungJukVO sj1 = new SungJukVO("날두", 99, 100, 80);
		SungJukVO sj2 = new SungJukVO("수지", 80, 68, 76);
		SungJukVO sj3 = new SungJukVO("지현", 88, 98, 36);

		//
		hmap2.put("혜교", sj0);
		hmap2.put("날두", sj1);
		hmap2.put("수지", sj2);
		hmap2.put("지현", sj3);
		// K(키)는 문자형, V(값)은 sj__인 요소 추가.

		System.out.println(hmap2.get("혜교"));
		System.out.println(hmap2.get("날두"));
		System.out.println(hmap2.get("지현"));

		Iterator<String> it2 = hmap2.keySet().iterator();
		while (it2.hasNext()) {
			String key = it2.next();
			System.out.println(key + "/" + hmap1.get(key));

		}

		// 간단한 검색
		Integer key1 = 7;
		String key2 = "지현";
		if (hmap1.containsKey(key1))
			System.out.println(key1 + "/" + hmap1.get(key1));
		else
			System.out.println("데이터가 없음.");

		if (hmap2.containsKey(key2))
			System.out.println(key2 + "/" + hmap1.get(key2));
		else
			System.out.println("데이터가 없음.");

		// 애너테이션
		Iterator it3 = hmap2.keySet().iterator();

		Date today = new Date();
		today.getYear();
		today.getMonth();
		today.getMonth();
		today.getHours();
		today.getMinutes();

	}

}
