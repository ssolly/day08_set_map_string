package day08_set_map_string;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println("set : " + set);
		
		/*
		 ArrayList���� .get()�� ����� �� ������ hashSet������ �Ұ����ϴ�
		  �� set�� ���� �ϳ��� ���������� '�ݺ���'�� ����ؾ��Ѵ�.
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
