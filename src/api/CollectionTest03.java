package api;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest03 {
	public static void main(String[] args) {
		Map<String, FriendVO> friendMap = new HashMap<String, FriendVO>();
		friendMap.put("김지혁a", new FriendVO("010-1111-0001", 2, 27));	
		friendMap.put("김지혁b", new FriendVO("010-1111-0001", 1, 28));	
		friendMap.put("김지혁c", new FriendVO("010-1111-0001", 2, 31));	
		friendMap.put("김지혁d", new FriendVO("010-1111-0001", 1, 22));	
		friendMap.put("김지혁e", new FriendVO("010-1111-0001", 2, 25));	
		
//		System.out.println(friendMap.get("김지혁c"));
		
		for(String key:friendMap.keySet()) {
			FriendVO friendVO = friendMap.get(key);
			System.out.print("key : " + key +"의 전화번호는 " + friendVO.getPhone());		
			System.out.print(", 나이는 " + friendVO.getAge() + "이며, ");		
			System.out.print(friendVO.getGender() == 1 ? "남자" : "여자");
			System.out.println("입니다.");
		}		
	}
}
