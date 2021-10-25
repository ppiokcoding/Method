package Method;

public class Method04 {

	public static void main(String[] args) {

		// ****전달하려는 값의 자료형과, 전달받는 매개변수의 자료형은 반드시 동일해야 한다.
		m1("홍길동"); // 실인자
		m1("아무개");
		// m1(10); // 안되는 이유? string name = 10; 안됨 정수값이기 때문

		m2(10);
		m2(-5);
		// m2("하하하"); int num = "하하하";

		// m3(1, 2, "홍길동", 20, 1023, true, 202,....매개변수 최대 255개 )

		// 매개변수 2개 -> 전달할 값 2개
		m3(10, 3);
		System.out.println();

		m3(1234, 15);
		System.out.println();

		m4("홍길동", 20);
		m4("아무개", 15);
		System.out.println();

		// ****매개변수의 개수와 전달하는 값의 개수는 반드시 일치해야 한다!!!!
		// m4("홍길동");
		// m4("홍길동", 20, 10);

		// ** 매개변수의 순서와 전달하는 값의 순서는 반드시 일치해야 한다.
		// m4(20, "홍길동");

		// *** 메소드의 매개변수 이용시 주의점
		// 1. 개수
		// 2. 자료형
		// 3. 순서

	}// main

	public static void m1(String name) { // 가인자
		System.out.println(name + " 안녕~");

	}

	public static void m2(int num) {
		System.out.println(num > 0 ? "양수" : "양수 아님");
	}

	// 매개변수의 갯수는 0개 이상 ~ 255개 > 1개 ~ 3,4개(실제 권장)
	public static void m3(int a, int b) {
		System.out.printf("%,d + %d = %d\n", a, b, a + b);
		System.out.printf("%,d - %d = %d\n", a, b, a - b);
		System.out.printf("%,d * %d = %d\n", a, b, a * b);
		System.out.printf("%,d / %d = %.1f\n", a, b, a / (double) b);
		System.out.printf("%,d %% %d = %d\n", a, b, a % b);

	}

	public static void m4(String name, int age) {

		String result = age >= 19 ? "성인" : "미성년";

		System.out.printf("입력한 %s님은 %s입니다.\n", name, result);
	}

}
