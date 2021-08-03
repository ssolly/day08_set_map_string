package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;

public class Ex04_Map {
	
	/*
	 # Map
	  - HashMap
	   �� Ű(key)�� ��(value)���� �̷�����ִ�(key:value)
	   �� ������ �������� �ʴ´�
	   �� Ű�� ���� �ߺ��� ������� �ʴ´�
	  - TreeMap
	  - HashTable ...��� 
	 */
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		//LinkedHashMap map = new LinkedHashMap(); // ���� ���� ����
		
		map.put("��ǳ��", "10����");
		map.put("�ڵ���", "1000����");
		map.put("������", "100����");
		
		System.out.println(map);
		
		System.out.println(map.get("��ǳ��"));
		System.out.println(map.get("�ڵ���"));
		System.out.println(map.get("������"));
		System.out.println(map.get("�Һ�"));
		
		System.out.println(map.containsKey("������"));
		System.out.println(map.containsKey("�Һ�"));
		
		System.out.println(map.containsValue("1000����"));
		System.out.println(map.containsValue("20����"));
	
		System.out.println(map.remove("������"));
		System.out.println(map.containsKey("������"));
		System.out.println(map);
		
		System.out.println(map.keySet());	//key�� ���
		
		//Set s = map.keySet();
		//Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+" : " + map.get(key));
		}
	}
}
