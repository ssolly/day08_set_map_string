package day08_set_map_string;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 1. "Have a nice day Have a nice day Have a nice day" 
		     문자열에서 a의 위치를 저장하여 출력하시오
		   - 결과 : [1,5,13,17,21,29,33,37,45]
		 */
		
		String hand = "Have a nice day Have a nice day Have a nice day";
		System.out.print("결과 : ");
		for(int i=0; i<hand.length();i++) {
			if(hand.charAt(i) == 'a') {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		/*
		 2. It is a fun java programming 문자열에서 'a'의 개수와 'g'개수와 총 개수를 출력하시오
		 */
		String iiafjp = "It is a fun java programming";
		int a_cnt = 0, g_cnt=0, sum=0;
		for(int i=0; i<iiafjp.length();i++) {
			if(iiafjp.charAt(i)=='a') {
				a_cnt++;
			} else if (iiafjp.charAt(i)=='g') {
				g_cnt++;
			}
		}
		sum = iiafjp.length();
		System.out.println("총 개수 : " + sum);
		System.out.println("a 개수 : " + a_cnt);
		System.out.println("g 개수 : " + g_cnt);
		
		
		/*
		 3. String str = new String("tESt sTring  change    first");
		    String changeStr = new String();
		   - 현재의 공백은 몇 개가 있는지 알 수 없는 상황에서 첫번째 알파벳만 대문자로 변경하시오
		   - 변경 전 : tESt sTring change  first
		   - 변경 후 : Test String Change  First
		 */
		
		String str02 = new String("tESt  sTring  change   first");
		String changeStr = new String();
		int k=0;

		str02 = str02.toLowerCase();
		if(str02.charAt(0) >='a' && str02.charAt(0) <='z') {
			changeStr+=(char)(str02.charAt(k)-32);
			k++;
		}
		while(k<str02.length()) {
			if(str02.charAt(k) != ' ') {
				changeStr+=str02.charAt(k);
				k++;
				continue;
			}
			while(str02.charAt(k) == ' ') {
				changeStr+=str02.charAt(k);
				k++;
			}
			if(str02.charAt(k) >= 'a' &&str02.charAt(k) <='z')
				changeStr+=(char)(str02.charAt(k)-32);
			k++;
		}
		System.out.println(str02);
		System.out.println(changeStr);
		System.out.println("종료");
	}		
}
