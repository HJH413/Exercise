package a_datatype;

public class Ex01_Valueable {
    public static void main(String[] args) {

        int age;
        double weight;
        String name; // String name = new String();
        char[] name2;

        //casting 자료형 변환하기
        float c = (float)3.6;
        double f = 3.6;
        System.out.println(c);

        int i = (int)3.6;
        System.out.println(i);

    }

}

/*
	1. 변수 - 값을 저장하기 위해서 어디에? 메모리에

	2. 자료형(data type)
		1. 기본형
			논리형 : boolean (true or false)
			문자형 : char (2byte)
			정수형 : byte(1byte), short(2byte), int (4byte = 32bit), long (8byte = 64bit)
			실수형 : float(Java에서 4byte) double(8byte) 자바 개발자는 double를 주로 사용

		2. 참조형
			배열 / 클래스
			new 연산자로 객체 생성

			-------------------------------------------------
			* String 클래스 원래 문법은 String name = new String()
*/

