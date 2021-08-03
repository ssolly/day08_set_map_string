package day08_set_map_string;

public class Quiz03 {

	public static void main(String[] args) {
		
		/* 
		 1. String str="김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		    위와 같은 내용을 replace를 이용해서 아래와 같이 저장 후 출력 하시오
		    ----변경 전 str-----
		    김개똥 -2017년
		    홍길동구리 -2015년
		    선우선녀 -2018년
		    ----변경 후 str----
		    김개똥 : 1999년
		    홍길동구리 : 1999년
		    선우선녀 : 1999년
		 */
		
//		1차 SY풀이
//		String str="김개똥 - 2017년\n홍길동구리 - 2015년\n선우선녀 - 2018년";
//		String replace = str.replace("2017", "1999");
//		replace = replace.replace("2015", "1999");
//		replace = replace.replace("2018", "1999");
//		replace = replace.replace("-", ":");
//		
//		System.out.println("---- 변경 전 str ----");
//		System.out.println(str);
//		System.out.println("---- 변경 후 str ----");
//		System.out.println(replace);
		
		String str="김개똥 - 2017년\n홍길동구리 - 2015년\n선우선녀 - 2018년";
		System.out.println("---- 변경 전 str ----\n"+str);
		str = str.replace("-", ":");				// '-' → ':' 변경
		String[] arrstr = str.split("\n");			// \n을 기준으로 나눈다
		str = "";									// str 초기화
		for(int i=0; i<arrstr.length;i++) {			// \n기준으로 나눈 것 배열
			String[] reStr = arrstr[i].split(":");	// \n나눈 것들에서 :를기 준으로 또 나눈다
			reStr[1] = reStr[1].replace(reStr[1], "1999년");
			// reStr[1] = "1999년";
			str += (reStr[0]+":"+reStr[1]+"\n");
		}
		System.out.println("---- 변경 후 str ----\n" + str);
	}
}


