package day08_set_map_string;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 1. "Have a nice day Have a nice day Have a nice day" 
		     ���ڿ����� a�� ��ġ�� �����Ͽ� ����Ͻÿ�
		   - ��� : [1,5,13,17,21,29,33,37,45]
		 */
		
		String hand = "Have a nice day Have a nice day Have a nice day";
		System.out.print("��� : ");
		for(int i=0; i<hand.length();i++) {
			if(hand.charAt(i) == 'a') {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		/*
		 2. It is a fun java programming ���ڿ����� 'a'�� ������ 'g'������ �� ������ ����Ͻÿ�
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
		System.out.println("�� ���� : " + sum);
		System.out.println("a ���� : " + a_cnt);
		System.out.println("g ���� : " + g_cnt);
		
		
		/*
		 3. String str = new String("tESt sTring  change    first");
		    String changeStr = new String();
		   - ������ ������ �� ���� �ִ��� �� �� ���� ��Ȳ���� ù��° ���ĺ��� �빮�ڷ� �����Ͻÿ�
		   - ���� �� : tESt sTring change  first
		   - ���� �� : Test String Change  First
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
		System.out.println("����");
	}		
}
