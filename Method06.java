package Method;

public class Method06 {
	
public static void main(String[] args) {
		
		//[Method]
		
		//�޼ҵ� ���
		// -> swap ���� > 2���� ���� ���� ��ȯ�ϴ� �۾�
		
		int a = 10;
		int b = 20;
		
		swap(a, b); //a -> b, b -> a
		
		String s1 = "ȫ�浿";
		String s2 = "�ƹ���";
		
		swap(s1, s2);
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		swap(b1, b2);
		
		//��Ű�� �� �� �� ���߱�
		//�鿩����(indent)
		//- ��(<-,->)
		//- �����̽�
		
		//���� ������
		//-Ctrl + Shift + F(format)
				
		
	}
	
	public static void swap(boolean s1, boolean s2) {

		System.out.printf("s1: %b, s2: %b\n", s1, s2);

		boolean s3; // ����

		s3 = s1;
		s1 = s2;
		s2 = s3;

		System.out.printf("s1: %b, s2: %b\n", s1, s2);
	}
	
	public static void swap(String s1, String s2) {
		
		//printf���� ���๮�� -> %n ���� -> �ü���� �´� ���๮�ڷ� ����
		// - \r\n : window
		// - \r : macos
		// - \n : linux
		System.out.printf("s1: %s, s2: %s/n", s1, s2);
		
		String s3; //����
		
		s3 = s1;
		s1 = s2;
		s2 = s3;
		
		System.out.printf("s1: %s, s2: %s\n", s1, s2);
	
	}
	
	public static void swap(int a, int b) {

		System.out.printf("a: %d, b: %d\n", a, b);

		// swap �۾�
		int temp; // ����

		temp = a;
		a = b;
		b = temp;

		System.out.printf("a: %d, b: %d\n", a, b);
	}

}
