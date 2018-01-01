package siz.Delta.adv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.v1.SungJukV0;

public class ArrayLists {

	public static void main(String[] args) {
		// 배열 : 값이 들어갈 자리를 일일히 지정해줘야함.
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;

		// 컬렉션 프레임워크
		// 동일한 자료형의 여러 객체의 묶음을 손쉽게 다루게 해줌.
		// List : 순차 구조, 순서있는 객체 다룸 중복 허용
		List list = new ArrayList();
		list.add("혜교");
		list.add(94);
		list.add(123.456);
		list.add(true);
		list.add(new SungJukV0());
		// 순차적으로 값이 들어감.
		for (int i = 0; i < 5; ++i)
			System.out.println(list.get(i));
		// ArrayList에 저장된 내용들은 object형
		// 다라서 그것을 get하여 각각의 변수에 저장하려 할때 불필요한 형 변환이 발생- 성능저하 요인

		String name = (String) list.get(0);
		int score = (int) list.get(1);
		double point = (double) list.get(2);
		// boolean point2 = (boolean) list.get(2); // x ???
		boolean tandf = (boolean) list.get(3);
		SungJukV0 sj = (SungJukV0) list.get(4);
		// String sj2 = (String) list.get(4); // x

		// 지네릭스 Generic
		// 컬렉션 프레임워크를 사용할때 타입을 지정하지 않고 객체를 저장하면
		// 그것을 출력시 불필요한 형변환이 발생.
		// JDK5에서는 이것을 막고자 지네릭을 도입
		// 컬렉션을 선언할때 어떤종류의 객체를 저장할지 미리 결정해야 하는데
		// 그것을 < >기호로 정의
		List cage1 = new ArrayList();
		cage1.add(new Tiger());
		cage1.add(new Zibra());
		cage1.add(new Lion());

		Tiger t = (Tiger) cage1.get(0);
		// zibra z= (Tiger)cage1.get(1);
		// lion l= (Tiger)cage1.get(2);

		List<Tiger> cage2 = new ArrayList<Tiger>();
		List<Zibra> cage3 = new ArrayList<Zibra>();
		List<Lion> cage4 = new ArrayList<>(); // ArrayList 뒤에 < >를 비워도 무방

		cage2.add(new Tiger());
		t = cage2.get(0);
		// cage2.add(new Zibra()); 같은 형식만 들어갈수있음.

		// ArrayList의 CRUD
		List<String> names = new ArrayList<String>(); // names array에는 문자열만 들어갈수있음.
		names.add("혜교");
		names.add("수지");
		names.add("지현");

		// 출력방법.
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		// 일반for문 출력
		for (int i = 0; i < names.size(); ++i)
			System.out.println(names.get(i));
		// 향상된 for문 출력 = 가지고있는 요소 모두를 가져옴.
		for (String val : names)
			System.out.println(val);

		System.out.println("===========================================절취선=======================================");

		// 검색 indexOf(값);
		int pos = name.indexOf("혜교");
		System.out.println("혜교의 위치" + pos);

		// 순환자를 이용하여 컬렉션의 모든요소 출력
		// 모든 컬렉션 클래스로 선언된모든 요소들을
		// 하나씩 읽어오기위한 표준화된 방식을 제공한다.
		// hasNext: 컬렉션 요소가 존재하는지 여부 검사
		// next: 요소를 읽어올수있는지 여부검사.
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}

		// 갯수 : size
		System.out.println(names.size());

		// 삭제 : remove
		names.remove(2);
		System.out.println(names.size());

		// 수정 :set
		System.out.println(names.get(1));
		names.set(1, "솜이");
		System.out.println(names.get(1));

		// 모두 제거 :clear
		names.clear();
		System.out.println(names.size());
	}

}

class Tiger {
}

class Zibra {
}

class Lion {
}
