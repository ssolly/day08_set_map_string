package day08_set_map_string;

public class Ex07_String {

	public static void main(String[] args) {
		
		String str = "Java is Easy. and Programming not bad...";
		System.out.println("기본 : " + str);
		String changeStr= new String();
		changeStr = str.toUpperCase();
		System.out.println("대문자 변환 : " + changeStr);
		changeStr = str.toLowerCase();
		System.out.println("소문자 변환 : " + changeStr);
	}
}
