package Method;

public class Method07 {
	
	private static int a = 0;

	public static void main(String[] args) {

		// ��� �޼ҵ�, Recursive Method
		// - �޼ҵ尡 �����ο��� �ڱ� �ڽ��� ȣ���ϴ� ������ ������ �޼ҵ�
		// - ������ ������ �޼ҵ�(=�ڱ��ڽ�)�� �ݺ� ȣ���ϱ� ������ �ٷ�Ⱑ ��ƴ�. => �����ʼ�

		// - ���丮 ����(Ʈ�� ����)���� ���� ����Ѵ�.
		// - �������� �˰��򿡼��� ���� ����Ѵ�.

		// m1();
		// m2();

		// ���丮��
		// 4! = 4 x 3 x 2 x 1
		// 4! = 24

		int n = 4;
		int result = factorial(n);

		System.out.printf("%d! = %d\r\n", n, result);

	}// main

	// ��� �޼ҵ�
	private static int factorial(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1); // ��� ȣ��
		}

	}

	// ��� �޼ҵ� : ��͸޼ҵ带 ������ �ִ� �޼ҵ�
	private static void m2() {

		// int a = 0;

		System.out.println("a: " + a);
		a++;

		if (a < 3) {
			m2(); // ���ȣ�� : ���� �޼ҵ� ȣ��
		}

	}// m2

	// ��� �޼ҵ�
	private static void m1() {

		System.out.println(System.currentTimeMillis());

		// �޼ҵ� ȣ��
		// m1();
		// StackOverflowError

	}

}
