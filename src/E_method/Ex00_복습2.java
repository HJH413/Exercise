package E_method;

import java.util.Scanner;

public class Ex00_복습2 {

	static int jumsu; // 멤버 변수
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		String result = func();
		System.out.println(result);
		// 여기서 합격 여부를 출력하려면?

		method();
	}

	/**
	 * method1
	 * - 점수를 입력받아 합격여부 확인하는 메소드
	 */
	static String func() {
		jumsu = in.nextInt();
		if (jumsu >= 80) return "합격";
		else return "불합격";
	}

	/**
	 * 점수를 넘겨받아 성적을 구하는 메소드
	 */
	static void method() {
	int student[] = new int[4];
	int sum = 0;
	double avg = 0;
		for (int i = 0; i < 4; i++) {

		}



	}

} // end of class



//		int student [][] = new int[4][3];
//
//		for (int i = 0; i < student.length; i++) {
//		stu = in.nextLine();
//		student[stu];
//		for (int j = 0; j < student[i].length; j++) {
//
//		}