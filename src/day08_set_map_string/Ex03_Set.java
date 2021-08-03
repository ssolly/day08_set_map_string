package day08_set_map_string;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : " + set);
		
		/*
		 ArrayList에는 .get()을 사용할 수 있지만 hashSet에서는 불가능하다
		  → set의 값을 하나씩 가져오려면 '반복자'를 사용해야한다.
		*/
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//Object obj = it.next();
			//String str = (String)obj;
			String str = (String)it.next();
			System.out.println(str);
			//System.out.println(it.next());
		}
	}
}
