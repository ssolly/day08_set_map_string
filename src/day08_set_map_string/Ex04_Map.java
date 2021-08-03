package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;

public class Ex04_Map {
	
	/*
	 # Map
	  - HashMap
	   └ 키(key)와 값(value)으로 이루어져있다(key:value)
	   └ 순서는 유지되지 않는다
	   └ 키에 대한 중복은 허용하지 않는다
	  - TreeMap
	  - HashTable ...등등 
	 */
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		//LinkedHashMap map = new LinkedHashMap(); // 순서 유지 가능
		
		map.put("선풍기", "10만원");
		map.put("자동차", "1000만원");
		map.put("에어컨", "100만원");
		
		System.out.println(map);
		
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("자동차"));
		System.out.println(map.get("에어컨"));
		System.out.println(map.get("텀블러"));
		
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map.containsKey("텀블러"));
		
		System.out.println(map.containsValue("1000만원"));
		System.out.println(map.containsValue("20만원"));
	
		System.out.println(map.remove("에어컨"));
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map);
		
		System.out.println(map.keySet());	//key만 출력
		
		//Set s = map.keySet();
		//Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+" : " + map.get(key));
		}
	}
}
