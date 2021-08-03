package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {

		/*
		 # �޴��� ���α׷�
		  - HashMap�� �̿��Ͽ� ������ �޴��� �����
		   1.�޴����
		   2.�޴��� ���� ����
		    1.���� 2.���� 3.������
		   3.����
		    >>>
		 */
		
		Scanner sc = new Scanner(System.in);
		HashMap menuMap = new HashMap();
		
		int choice;
		String menu,price;
		
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���ݺ���");
			System.out.println("3.����");
			System.out.print(">>> ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("�޴� �Է� : ");
				menu=sc.next();
				if(menuMap.containsKey(menu)) {
					System.out.println("�����ϴ� �޴��Դϴ�");
					continue;
				} else {
					System.out.print("���� �Է� : ");
					price=sc.next();
					menuMap.put(menu,price);
				}
				break;
			case 2 :
				Iterator it = menuMap.keySet().iterator();
				// iterator�� ������ �߿�! ���� ������ �Ŀ� ������Ѵ�
				while(it.hasNext()) {
					menu = (String)it.next();
					System.out.println(menu + " : " + menuMap.get(menu));
				}
				
				System.out.println("1.���� 2.���� 3.������");
				System.out.print(">>> ");
				choice=sc.nextInt();
				switch(choice) {
				case 1 :
					System.out.print("������ �޴� ���� : ");
					menu = sc.next();
					if(menuMap.containsKey(menu)) {
						System.out.print("������ ���� �Է� : ");
						price = sc.next();
						System.out.println(menuMap.get(menu)+" => "+ price);
						System.out.println(menu + " ������ ���������� ����Ǿ����ϴ�");
						menuMap.remove(menu);
						menuMap.put(menu, price);
					} else {
						System.out.println(menu+"�� ���� �޴��Դϴ�");
					}
					break;
				case 2 :
					System.out.print("������ �޴� ���� : ");
					menu = sc.next();
					if(menuMap.containsKey(menu)) {
						menuMap.remove(menu);
						System.out.println(menu+" �޴��� �����Ǿ����ϴ�");
					} else {
						System.out.println(menu+"�� ���� �޴��Դϴ�");
					}
					break;
				case 3 :
					continue;
				default :
					System.out.println("�߸��� �����Դϴ�");
					break;
				}
				break;
				
			case 3 :
				System.out.println("���α׷��� �����մϴ�");
				System.exit(1);
			default :
				System.out.println("�߸��� �����Դϴ�");
				break;
			}
		}
	}
}
