package Method;

public class Method03 {
	
	public static void main(String[] args) {
		
		/*
		  
		 public static void m1() { }
		 
		 1. m1
		 - �޼ҵ��
		 
		 2. ()
		 - ���� ����Ʈ
		 
		 3. void
		 - ��ȯ �ڷ���
		 
		 
		 �޼ҵ��� ���� ����Ʈ
		 = �Ķ����(Parameter)
		 = ����(Arguments)
		 = �Ű�����
		 = ������(Pseudo Arguments)
		 - (�ұ�����)������ ����
		 
		 */

		//�䱸����] 'ȫ�浿'���� �λ縦 �ϴ� �޼ҵ带 ����ÿ�.
		
		hello();
		
		//��������] '�ƹ���'���� �λ縦 �ϴ� �޼ҵ带 ����ÿ�.
		
		hello2();
		System.out.println();
		
		//��������] �츮 ���ǽ� ��� ������� ���� �λ縦 �ϴ� �޼ҵ带 ����ÿ�.
		//  	 x 30�� �żҵ� ����
		// 		 x 1�� �޼ҵ� + �Ű����� ���
		
		//��������] �������� ��� ������� ���� �λ縦 �ϴ� �޼ҵ带 ����ÿ�.
		//		 x 70�� �޼ҵ� ����
		//		 x 1�� �޼ҵ� + �Ű�����
		
		//�����޽��� - The method hi(String) in the type Ex16_Method is not applicable for the arguments ()
		//hi();
		
		
		//�޼ҵ� 1��!!!! > ���� ����� ������� ��� ��
		
		hi("ȫ�浿");
		System.out.println();
		
		hi("�ƹ���");
		System.out.println();
		
		hi("test");
		System.out.println();
		
		hi("���̵�");
		System.out.println();
		
		
	}//main
	
	public static void hello() {
		
		String name = "ȫ�浿";
		
		System.out.println("�ڹ� ������ ���Ű� ȯ���մϴ�.");
		System.out.println( name + "�� �ȳ��ϼ���.");
		System.out.println("������ �����ϼ���.");
		
	}
	
	public static void hello2() {
		
		String name = "�ƹ���";
		
		System.out.println("�ڹ� ������ ���Ű� ȯ���մϴ�.");
		System.out.println( name + "�� �ȳ��ϼ���.");
		System.out.println("������ �����ϼ���.");
		
	}
		
	//String name
	// = ����
	// = �Ķ����
	// = �Ű�����
	
	//���� �˻� ��� - ������Ʈ ���� ��� ������ ������� �˻��ϴ� ���
	//���� �˻� ��� > Ȯ�� ���α׷�(Plugin) ��ġ > "Quick Search" > "Ctrl + Shift + L"
	
	//������ �ʱ�ȭ���� ���� ����(null)�� ����� �Ұ����ϴ�.
	
	//- �޼ҵ� ����ÿ��� ���� ���������� ������
	//- ȣ���Ҷ� ���� ���������ν� �ش� �޼ҵ尡 �� ���� ������ �ൿ�� �� �� �ֵ��� ���ִ� ���
	
	public static void hi(String name) {
		
		
		System.out.println("�ڹ� ������ ���Ű� ȯ���մϴ�.");
		System.out.println( name + "�� �ȳ��ϼ���.");
		System.out.println("������ �����ϼ���.");
	
	}
		
		
		
		
	}//main


