package a_datatype;

public class Ex03_StringBuffer {
    // call by reference : 함수의 인자로 참조형을 보낼 때
    // 결론 원본의 원데이터를 변경함 (주소를 컨트롤해서)
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Hello");
        StringBuffer b = new StringBuffer("홍길동");
        add(a,b);
        System.out.println("2>"+a); // hello? 정답 hello홍길동 이유 add에서 함수append 사용해서 나온 값을 불러옴?
        System.out.println("2>"+b); // 홍길동 b에는 값 변경을 안함
    }
    static void add (StringBuffer a, StringBuffer b) {
        a.append(b) ; // a에다가 b를더해라
        System.out.println("1>"+a); // Hello홍길동
    }
}

/*

	자바에서 문자열처리 클래스
	- String
	- StringBuffer / StringBuilder 둘이 용도가 살짝 다름

	Buffer가 Builder 보다 메모리가 무거운

*/
