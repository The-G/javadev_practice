package api;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 배열을 class화 한다. 수정하지 않는데 유리하다!! 
											   // java7 부터 <>, 들어오는 data type 지정!! 가능하다!!
		list.add("조지클루니");printStr(list);
		list.add("브래드 피트");printStr(list);
		list.add("조니 뎁");printStr(list);
		list.add("에드워드 에르릭");printStr(list);
		list.add("에드워드 알봉스");printStr(list);
//		list.add(4); // 안 됨.
	}

	private static void printStr(List<String> list) {
		for (String name : list) { // String type으로 동일해야지!!
			System.out.print(name + "\t");
		}
		System.out.println();
	}

	
//	private static void printStr(List list) {
//		for (int i = 0; i < list.size(); i++) { //collection framework는 size를 쓴다 length가 아닌!!
//			System.out.print(list.get(i) + "\t");
//		}
//		System.out.println();
//	}


}
