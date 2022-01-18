package E_method;

// [추가] 스택(자료의 구조)에 대한 개념 설명
// 나중에 들어간걸 먼저 꺼내는 것
public class Ex00_복습 {
	public static void main(String[] args) {    // A C E F D B
			System.out.println("A");
			test();
			System.out.println("B");
	}
	static void test() {
			System.out.println("C");
			sample();
			imsi();
			System.out.println("D");			
	}	
	static void sample() {
		System.out.println("E");	
	}
	static void imsi() {
		System.out.println("F");	
	}
}

/*
main A -> test -> C -> sample -> E -> test -> imsi -> F -> test -> D -> main -> B
 */