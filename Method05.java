package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method05 {
	
	public static void main(String[] args) throws IOException{
		
		//[Method]
		
		/*
		 -void m1() : Method Signature, �޼ҵ� ����(Sign)
		 
		  public static void m1() {
		  
		  }
		 
		 
		 �޼ҵ� ��ȯ��
		 - �޼ҵ尡 �ڽ��� �ൿ�� ��ģ �� ȣ���� ������ ���ƿ´� + �׳� ���ƿ��°� �ƴ϶� ���� ������ ���ƿ´� ==> (�޼ҵ�)��ȯ�� 
		 - �ൿ�� ����� ��ȯ�Ѵ� > ȣ���� �޼ҵ��� ����� �̾ ������ �����Ѵ�.
		 
		 */

		//m1();
//		m1(10);		//���		> ���
//		m1(5);		//���		> OK
//		m1(-10);	//����ƴ�	> ����ƴ� 
//		m1(-20);	//����ƴ�	> Fail
		
		System.out.println(m1(10));	
		System.out.println(m1(5));	
		System.out.println(m1(-10));	
		System.out.println(m1(-20));	
		
		String result1 = m1(10) ? "���":"����ƴ�";
		System.out.println(result1);
		
		String result2 = m1(5) ? "OK":"Failed";
		System.out.println(result2);
		
		String result3 = m1(-10) ? "���":"����ƴ�";
		System.out.println(result3);
		
		String result4 = m1(-20) ? "���":"Fail";
		System.out.println(result4);
		
		//*** �޼ҵ� ��ȯ���� ����
		// > �޼ҵ��� ��ó���� ���� ����� �ǵ����༭ �� ���� ����ؼ� ��� ������ ���� �� ���� ���� �� ���
			
		
		//�޼ҵ� : ��Ű�� �ϸ� �״�� �ൿ
		//�޼ҵ� + �Ű����� : ��Ű�� ���� �ϵ� ����� �����͸� ��ȭ. �ְ�
		//�޼ҵ� + ��ȯ�� : ��Ű�� ���� �ϵ� ���� ����� �����ش�. �ޱ�
		//�޼ҵ� + �Ű����� + ��ȯ�� 
		
		int a = 10;
		int b = 20;
		int sum = 0;
		
		sum = m2(a, b);
		
		System.out.println(sum);
		
		System.out.println(m2(5, 3));
		System.out.println(m2(1000, 20000));
		
		
		System.out.println();
		
		
		
		//�䱸����] �̸�, ����, �ּ� -> �Է� -> ȭ�� ��� ���
		
		//**** �ݺ��Ǵ� ������ ������ ������ �޼ҵ�� �����Ѵ�.******
		
		String name = m3("�̸� �Է�");
		String age = m3("���� �Է�");
		String address = m3("�ּ� �Է�");
		
		System.out.println("==================");
		System.out.println("      �Է� ���");
		System.out.println("==================");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ�: " + address);
		
		
	}//main
	
	
	//void = �����ִ� ���� �����ϴ�(��). - null ��� ���
	//boolean : �����ִ� ���� boolean�Դϴ�.
	public static boolean m1(int n) {
		
		//� ����
		//int n = 10;
		
		n = n + 10;
		n *= 2;
		n -= 3;
		
		//String result = n > 0 ? "���": "��� �ƴ�";
		
		//System.out.println(result);
	
		boolean result = n > 0 ? true : false;
		
		// ���Ϲ�, ��ȯ��
		//- �ش� �޼ҵ带 �����ϰ�, ���� �����ּ���.
		//- �Ű������� �ݴ� ����
		return result; 
	
	
	}//m1
	
	
	//������ ���� ���ϴ� �޼ҵ�
	public static int m2(int a, int b) {
		
		return a + b;
	}
	
	public static String m3(String msg) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(msg + ": ");//Lable
		
		String input = reader.readLine();
		
		return input;
	}

}
