package day08_set_map_string;

public class Ex08_String {
	
	public static void main(String[] args) {
		
		String str = new String("abcdefg");
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		
		str+="�ȳ��ϼ���";
		System.out.println(str);
		
		System.out.println(str.equals("abcdefg�ȳ��ϼ���"));
		
		System.out.println(str.charAt(0) == 'a');
		System.out.println(str.charAt(0) == 'd');
		
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
	}
}
