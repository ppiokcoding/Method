package Method;

public class Method01 {
	
	//��� ���� > main �޼ҵ� ����
			//�޼ҵ� ���� > �޼ҵ� ȣ��
		
		
			//main �޼ҵ�
			//- Ư���� �޼ҵ�
			//- �̸��� ����� �޼ҵ�(main)
			//- �ڹٰ� ȣ���ϴ� �޼ҵ�(������ ȣ��x)
			//- ���α׷��� �����ϴ� �ڵ����� ȣ��Ǵ� �޼ҵ�
			//- ���α׷��� ������(Entry Point) ~ ���α׷��� ������(End point)
			
			public static void main(String[] args) {
		
			//[�޼ҵ� �����ϱ�] 
			/* 
			 �޼ҵ�, Method
			 - �޼ҵ�(Method), �Լ�(Function), ���ν���(Procedure), �����ƾ(Sub Routine)
			 - �ڵ��� ����
			 - ���� ������ ���� �ڵ��� ����
			 - ���� ������ ���� �ڵ��� ���� > 1���� �ൿ ���ؼ� ���� ���� *****
			 - �ڵ� ������ ���� *****
			 
			 
			 �޼ҵ� ����
			 1. �޼ҵ� �����ϱ�(�����ϱ�)
			 	- �� 1ȸ
			 	
			 	
			 2. �޼ҵ� ȣ���ϱ�(����ϱ�)
			 	- 1ȸ ~ ���Ѵ�
			 	
			 
			 */
			
			//�䱸����] "�ȳ��ϼ���" x 5�� ���
			//��������] "�ݰ����ϴ�." �����ϱ� 
			
			//1. ���� ��� ��  >  �ϵ� �ڵ�  > ������ ���
			//2. �������� ��� �� > �����ϴ� ���
			
			System.out.println("�ݰ����ϴ�.");
			System.out.println("�ݰ����ϴ�.");
			System.out.println("�ݰ����ϴ�.");
			System.out.println("�ݰ����ϴ�.");
			System.out.println("�ݰ����ϴ�.");
			
			
			//�޼ҵ� ���
			//2. �޼ҵ� ȣ���ϱ�
			// - �޼ҵ��();
			
			
			//�ڵ� ������ ����
			//1. ���� ������ ����. �ѹ��� ��ġ�� ȣ���� ������ ������ ������ ����Ǵϱ�.
			//2. ���꼺�� ����. ó�� ���鶧 ����� ����
			
			hello();
			hello();
			hello();
			hello();
			hello(); //�ڵ� ����
			
			
			//�䱸����] "�ϳ�" ~ "��" ���� ���. ���δ���
			//��������] 10�� �ݺ� 
//			System.out.println("�ϳ�");
//			System.out.println("��");
//			System.out.println("��");
//			System.out.println("��");
//			System.out.println("�ټ�");
//			System.out.println("����");
//			System.out.println("�ϰ�");
//			System.out.println("����");
//			System.out.println("��ȩ");
//			System.out.println("��");
			
			
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			printNumber();
			
			
			//main�� ���� > �ٸ� ���������� �л�(����)
			//				- �޼ҵ�	
			//				- Ŭ����
			//			 > ��ü���� �帧(����) �����ϴ� ����		
					
				}//main
		
		
		//1. �޼ҵ� �����ϱ�
		// - �޼ҵ�� Ŭ������ �ڽ����� �����Ѵ�.
		/*
		 
		public static void hello() {
			���� �ڵ� �ۼ�
		}
		
		���������� ����Ű���� ��ȯ�ڷ��� �޼ҵ��(���� ����Ʈ) {
			���� �ڵ� �ۼ�
		}
		
		*/
		public static void hello() {
			
					
			System.out.println("�ݰ����ϴ�.");
			
		}
		
		//������   > ĳ�� ǥ���
		//�޼ҵ�� > ĳ�� ǥ���
		public static void printNumber() {
			
			System.out.println("�ϳ�");
			System.out.println("��");
			System.out.println("��");
			System.out.println("��");
			System.out.println("�ټ�");
			System.out.println("����");
			System.out.println("�ϰ�");
			System.out.println("����");
			System.out.println("��ȩ");
			System.out.println("��");
			
		}
		


}
