package Method;

public class Method07 {
	
	private static int a = 0;

	public static void main(String[] args) {

		// 재귀 메소드, Recursive Method
		// - 메소드가 구현부에서 자기 자신을 호출하는 구문을 가지는 메소드
		// - 동일한 형태의 메소드(=자기자신)를 반복 호출하기 때문에 다루기가 어렵다. => 연습필수

		// - 디렉토리 구조(트리 구조)에서 많이 사용한다.
		// - 여러가지 알고리즘에서도 많이 사용한다.

		// m1();
		// m2();

		// 팩토리얼
		// 4! = 4 x 3 x 2 x 1
		// 4! = 24

		int n = 4;
		int result = factorial(n);

		System.out.printf("%d! = %d\r\n", n, result);

	}// main

	// 재귀 메소드
	private static int factorial(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1); // 재귀 호출
		}

	}

	// 재귀 메소드 : 재귀메소드를 가지고 있는 메소드
	private static void m2() {

		// int a = 0;

		System.out.println("a: " + a);
		a++;

		if (a < 3) {
			m2(); // 재귀호출 : 본인 메소드 호출
		}

	}// m2

	// 재귀 메소드
	private static void m1() {

		System.out.println(System.currentTimeMillis());

		// 메소드 호출
		// m1();
		// StackOverflowError

	}

}
