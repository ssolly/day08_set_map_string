package day08_set_map_string;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();	// arraylist는 순서가 있기 때문에
		arr.add("일");						// index를 사용할 수 있다
		arr.add("이");
		arr.add("삼");
		
		Iterator it = arr.iterator();		// 반복자
		System.out.println(it.hasNext());	// 다음의 값이 있는지 확인
		System.out.println(it.next());		// 다음 값을 꺼내온다
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println();
		
		//반복문
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
	}
}
