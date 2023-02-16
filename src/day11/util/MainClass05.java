package day11.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *  [[ HashMap Class ]]
 *   - Map 인터페이스를 구현한 클래스이다.
 *   - Key 값, Value 값을 쌍으로 저장한다. (사전형태)
 *   - Key 값은 중복 불가.
 * 
 */

public class MainClass05 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		// 데이터 저장하기
		map.put("Hello","안녕하세요");
		map.put("Car","자동차");
		map.put("Tiger","호랑이");
		
		// 데이터 얻어오기
		String value = map.get("Tiger");
		System.out.println("value:" + value);
		
		// Map에 있는 키 값 불러오기
		Set<String> keys = map.keySet();
		
		// Set -> 반복자 객체
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + ":" + map.get(key));
//			System.out.println("value:" + map.get(key));
		}
		/* no:1  name:blue mobile:0101234
		/* no:2  name:red mobile:0101235
		/* no:3  name:green mobile:0101236
		/* no:4  name:orange mobile:0101237
		 * 
		 */

		
		
		List<Map> list = new ArrayList();
		
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		Map<String, String> map3 = new HashMap<>();
		Map<String, String> map4 = new HashMap<>();
		
		map1.put("no","1");
		map1.put("name","blue");
		map1.put("mobile","0101234");
		
		map2.put("no","2");
		map2.put("name","red");
		map2.put("mobile","0101235");
		
		map3.put("no","3");
		map3.put("name","green");
		map3.put("mobile","0101236");
		
		map4.put("no","4");
		map4.put("name","orange");
		map4.put("mobile","0101237");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		
		System.out.println("no / name / mobile");
		for(Map row: list) {
			String no =(String) row.get("no");
			String name =(String) row.get("name");
			String mobile =(String) row.get("mobile");
			
			System.out.println(no + " / " + name + " / " + mobile );
		}
			
	}
}
