package day08_set_map_string;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01_Set {

	/*
	 # Set
	  - HastSet
	   �� ���� ������ �ȵȴ�
	   �� �������� �ߺ��� ������� �ʴ´�.
	  - TreeSet ... ���
	 */
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("���");
		hs.add("���");
		hs.add("����");
		hs.add("���");	//�������� �ߺ��� ������� �ʴ´�
		System.out.println("hs : " + hs);
		
		hs.remove("���");
		System.out.println("hs : " + hs);
		
		ArrayList arr = new ArrayList();
		arr.add("���");
		arr.add("���");
		arr.add("����");
		arr.add("���");
		System.out.println("arr : " + arr);
	}
}
