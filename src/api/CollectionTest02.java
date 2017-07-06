package api;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest02 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>(); // UpCasting
		map.put("김지이혁", "010-1234-4241");
		map.put("박지혁", "010-1234-4342");
		map.put("가지혁", "010-1234-4543");
		map.put("이지이혁", "010-1234-7244");
		map.put("효지이혁", "010-1239-4245");
		map.put("지이혁", "010-1234-4046");
		
//		System.out.println(map.get("가지혁"));
		for (String key:map.keySet()) {
			System.out.println(key);  // 순차적이지 않네!!!			
		}
	}
}
