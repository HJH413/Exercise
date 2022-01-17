package a_datatype;

public class Ex03_PrimitiveParam {
    //call by value : 함수의 인자로 기본형 data를 보낼때
    // 값을 따로 저장해서 원본을 값을 변경안함
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        add(a,b);
        System.out.println("2>"+a); // 내가 적은답 30 정답 10
        System.out.println("2>"+b); // 20
    }

    static void add(int a, int b) {  //함수안에서 만들어진 int a int b는 메인메소드로 넘어가면 메모리상에서 사라짐
        a+=b;
        System.out.println("1>"+a); // 30
    }
}


// 기본형은 메모리 stack영역에 잡힘 위에서 add라는 함수를 선언 하면 a,b를 다시만듬 값은 넘어오나

//함수의 인자가 값이 넘어오면 call by value

