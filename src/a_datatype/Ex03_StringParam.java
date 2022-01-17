package a_datatype;

public class Ex03_StringParam {
    public static void main(String[] args) {
        //static은 객체 생성전에 먼저 실행됨
        String a = "Hello";
        String b = "홍길동";
        add(a, b); //
        System.out.println("2>"+ a); // 내가 생각한 답 : hello홍길동 정답 hello 이유: add메소드가 실행이 안돼서?
        System.out.println("2>"+ b); // 홍길동
    }

    static void add(String a, String b) {   // 함수 만들기 자바나 c언어는 반드시 리턴형 사용 리턴 안쓰면 void add()
        // String 특권 + 연산자
        a += b;
        System.out.println("1>"+ a);
    }

    // static 메소드에서는 static만 참조할 수 있다.
}
// 흐름 메인 함수 찾아서 4 5 6 7 8 -> 11라인 -> 8라린 -> 9라인

//인자가 넘어오면 해당하는 페라미터 선언 변수형은 달라도 괜찮음 편의성을 위해서 변수명 맞추기

//String 클래스는 기존의 메모리가 조금만 수정이 되어도 메모리 힙에다가 따로 저장함
