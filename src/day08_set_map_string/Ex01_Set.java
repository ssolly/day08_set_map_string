package day08_set_map_string;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01_Set {

	/*
	 # Set
	  - HastSet
	   └ 순서 유지가 안된다
	   └ 데이터의 중복을 허용하지 않는다.
	  - TreeSet ... 등등
	 */
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥");	//데이터의 중복을 허용하지 않는다
		System.out.println("hs : " + hs);
		
		hs.remove("김밥");
		System.out.println("hs : " + hs);
		
		ArrayList arr = new ArrayList();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("김밥");
		System.out.println("arr : " + arr);
	}
}
