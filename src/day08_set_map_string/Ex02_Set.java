package day08_set_map_string;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();	// arraylist�� ������ �ֱ� ������
		arr.add("��");						// index�� ����� �� �ִ�
		arr.add("��");
		arr.add("��");
		
		Iterator it = arr.iterator();		// �ݺ���
		System.out.println(it.hasNext());	// ������ ���� �ִ��� Ȯ��
		System.out.println(it.next());		// ���� ���� �����´�
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println();
		
		//�ݺ���
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
	}
}
