package day08_set_map_string;

public class Quiz03 {

	public static void main(String[] args) {
		
		/* 
		 1. String str="�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
		    ���� ���� ������ replace�� �̿��ؼ� �Ʒ��� ���� ���� �� ��� �Ͻÿ�
		    ----���� �� str-----
		    �谳�� -2017��
		    ȫ�浿���� -2015��
		    ���켱�� -2018��
		    ----���� �� str----
		    �谳�� : 1999��
		    ȫ�浿���� : 1999��
		    ���켱�� : 1999��
		 */
		
//		1�� SYǮ��
//		String str="�谳�� - 2017��\nȫ�浿���� - 2015��\n���켱�� - 2018��";
//		String replace = str.replace("2017", "1999");
//		replace = replace.replace("2015", "1999");
//		replace = replace.replace("2018", "1999");
//		replace = replace.replace("-", ":");
//		
//		System.out.println("---- ���� �� str ----");
//		System.out.println(str);
//		System.out.println("---- ���� �� str ----");
//		System.out.println(replace);
		
		String str="�谳�� - 2017��\nȫ�浿���� - 2015��\n���켱�� - 2018��";
		System.out.println("---- ���� �� str ----\n"+str);
		str = str.replace("-", ":");				// '-' �� ':' ����
		String[] arrstr = str.split("\n");			// \n�� �������� ������
		str = "";									// str �ʱ�ȭ
		for(int i=0; i<arrstr.length;i++) {			// \n�������� ���� �� �迭
			String[] reStr = arrstr[i].split(":");	// \n���� �͵鿡�� :���� ������ �� ������
			reStr[1] = reStr[1].replace(reStr[1], "1999��");
			// reStr[1] = "1999��";
			str += (reStr[0]+":"+reStr[1]+"\n");
		}
		System.out.println("---- ���� �� str ----\n" + str);
	}
}


