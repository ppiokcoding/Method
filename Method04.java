package Method;

public class Method04 {

	public static void main(String[] args) {

		// ****�����Ϸ��� ���� �ڷ�����, ���޹޴� �Ű������� �ڷ����� �ݵ�� �����ؾ� �Ѵ�.
		m1("ȫ�浿"); // ������
		m1("�ƹ���");
		// m1(10); // �ȵǴ� ����? string name = 10; �ȵ� �������̱� ����

		m2(10);
		m2(-5);
		// m2("������"); int num = "������";

		// m3(1, 2, "ȫ�浿", 20, 1023, true, 202,....�Ű����� �ִ� 255�� )

		// �Ű����� 2�� -> ������ �� 2��
		m3(10, 3);
		System.out.println();

		m3(1234, 15);
		System.out.println();

		m4("ȫ�浿", 20);
		m4("�ƹ���", 15);
		System.out.println();

		// ****�Ű������� ������ �����ϴ� ���� ������ �ݵ�� ��ġ�ؾ� �Ѵ�!!!!
		// m4("ȫ�浿");
		// m4("ȫ�浿", 20, 10);

		// ** �Ű������� ������ �����ϴ� ���� ������ �ݵ�� ��ġ�ؾ� �Ѵ�.
		// m4(20, "ȫ�浿");

		// *** �޼ҵ��� �Ű����� �̿�� ������
		// 1. ����
		// 2. �ڷ���
		// 3. ����

	}// main

	public static void m1(String name) { // ������
		System.out.println(name + " �ȳ�~");

	}

	public static void m2(int num) {
		System.out.println(num > 0 ? "���" : "��� �ƴ�");
	}

	// �Ű������� ������ 0�� �̻� ~ 255�� > 1�� ~ 3,4��(���� ����)
	public static void m3(int a, int b) {
		System.out.printf("%,d + %d = %d\n", a, b, a + b);
		System.out.printf("%,d - %d = %d\n", a, b, a - b);
		System.out.printf("%,d * %d = %d\n", a, b, a * b);
		System.out.printf("%,d / %d = %.1f\n", a, b, a / (double) b);
		System.out.printf("%,d %% %d = %d\n", a, b, a % b);

	}

	public static void m4(String name, int age) {

		String result = age >= 19 ? "����" : "�̼���";

		System.out.printf("�Է��� %s���� %s�Դϴ�.\n", name, result);
	}

}
