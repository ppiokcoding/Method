package Method;

public class Method02 {

public static void main(String[] args) {
		
		int num = 10;
		
		num = 20;
		
		System.out.println(num);
		
		
		//���� �帧
		//- ���α׷� �ڵ��� ���� ����
		//- å �е��� ���������� �Ʒ��� ���پ� ����
		System.out.println("�ϳ�");
		m1(); // = (public static void m1() { }�������� �̵��Ͻÿ� = ��� �̵��Ѵ�.
		System.out.println("��"); 
		m2(); // = 63�������� �̵��Ͻÿ� = ��� �̵��Ѵ�.
		System.out.println("��");

		
		//��Ŭ���� ��
		//- Ctrl + 1
		//- Context Menu > Refactor > Extract Method
		
		
		//�޼ҵ� ȣ�� ������ ������ �޼ҵ� �����ϱ�
		m3();
		
		//������ �ڵ带 ������ �޼ҵ�� �����ϱ�
		m4();  // �ڵ� ���� �� ������ ���콺 ������-> ������-> ����Ʈ�� �޼ҵ�
		
		//���ϴ� �޼ҵ��� ���Ǹ� ã�� ���
		//1. Outline ����â ���
		//2. ȣ�� �������� F3 ������(Ŭ����, ����, �޼ҵ� �� ��� ���𱸹� �̿� ����)
		
		//�ĺ��ڸ� �����ϴ� ���
		//- Ŭ������, �޼ҵ��, ������, ���ϸ�(F2)
		//- �ĺ��ڸ� ������ ������ Ctrl+1 > Rename > ���� > �Ϸ�(����)
		
		System.out.println(num);
		
		
	}//main

	private static void m4() {
		System.out.println("���Ƹ�");
	}

	private static void m3() {
		System.out.println("�����");
		
	}

	public static void m1() {
		System.out.println("�����");
	} //m1 ���� ����. �޼ҵ�� ������ ����Ǹ� �ݵ�� �ڱ⸦ ȣ���ߴ� ������ ��� ���ư���.

	public static void m2() {
		
		System.out.println("������");
	}

}

