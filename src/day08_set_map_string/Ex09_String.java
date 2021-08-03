package day08_set_map_string;

public class Ex09_String {

	public static void main(String[] args) {
		
		String str = "    Have a nice day    ";
		String result = str.trim();		//양쪽의 공백을 제거
		System.out.println("1."+str);
		System.out.println("2."+result);	
		
		String inputId = "abc  ";
		String saveId = "abc";
		System.out.println(inputId);
		System.out.println(saveId);
		System.out.println(inputId.length());
		System.out.println(saveId.length());
		inputId=inputId.trim();
		System.out.println(inputId.equals(saveId));
		
		String[] split = result.split(" ");	//구분자 역할
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		String addr = "101/서울시/종로구/종로3가 100번지/4층";
		String[] ad = addr.split("/");
		for (int i=0; i<ad.length;i++) {
			System.out.println(ad[i]);
		}
		
		String replace = result.replace(" ", "__");
		System.out.println(replace);
	}
}
