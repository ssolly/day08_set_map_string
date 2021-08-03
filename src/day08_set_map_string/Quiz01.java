package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {

		/*
		 # 메뉴판 프로그램
		  - HashMap을 이용하여 간단한 메뉴판 만들기
		   1.메뉴등록
		   2.메뉴별 가격 보기
		    1.수정 2.삭제 3.나가기
		   3.종료
		    >>>
		 */
		
		Scanner sc = new Scanner(System.in);
		HashMap menuMap = new HashMap();
		
		int choice;
		String menu,price;
		
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격보기");
			System.out.println("3.종료");
			System.out.print(">>> ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("메뉴 입력 : ");
				menu=sc.next();
				if(menuMap.containsKey(menu)) {
					System.out.println("존재하는 메뉴입니다");
					continue;
				} else {
					System.out.print("가격 입력 : ");
					price=sc.next();
					menuMap.put(menu,price);
				}
				break;
			case 2 :
				Iterator it = menuMap.keySet().iterator();
				// iterator는 시점이 중요! 값을 저장한 후에 적어야한다
				while(it.hasNext()) {
					menu = (String)it.next();
					System.out.println(menu + " : " + menuMap.get(menu));
				}
				
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.print(">>> ");
				choice=sc.nextInt();
				switch(choice) {
				case 1 :
					System.out.print("수정할 메뉴 선택 : ");
					menu = sc.next();
					if(menuMap.containsKey(menu)) {
						System.out.print("수정할 가격 입력 : ");
						price = sc.next();
						System.out.println(menuMap.get(menu)+" => "+ price);
						System.out.println(menu + " 가격이 정상적으로 변경되었습니다");
						menuMap.remove(menu);
						menuMap.put(menu, price);
					} else {
						System.out.println(menu+"는 없는 메뉴입니다");
					}
					break;
				case 2 :
					System.out.print("삭제할 메뉴 선택 : ");
					menu = sc.next();
					if(menuMap.containsKey(menu)) {
						menuMap.remove(menu);
						System.out.println(menu+" 메뉴가 삭제되었습니다");
					} else {
						System.out.println(menu+"는 없는 메뉴입니다");
					}
					break;
				case 3 :
					continue;
				default :
					System.out.println("잘못된 선택입니다");
					break;
				}
				break;
				
			case 3 :
				System.out.println("프로그램을 종료합니다");
				System.exit(1);
			default :
				System.out.println("잘못된 선택입니다");
				break;
			}
		}
	}
}
