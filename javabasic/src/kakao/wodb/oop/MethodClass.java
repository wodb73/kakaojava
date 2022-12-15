package kakao.wodb.oop;

public class MethodClass {
	//static: 인스턴스를 생성할 필요가 없음
	//매개변수가 없음
	//MethodClass.noArgsMethod()로 호출
	public static void noArgsMethod() {
		for(int i=0; i<5; i++) {
			System.out.println("method");
		}
	}

//매개변수가 정수 1개인 메서드
//MethodClass.oneArgsMethod(3);
public static void oneArgsMethod(int n) {
	for(int i=0; i<n; i++) {
		System.out.println("method1");
	}
}
public static void twoArgsMethod(
		int n, String msg) {
	for(int i=0; i<n; i++) {
		System.out.println("message");
		
	}	
}
	//리턴이 없는 메서드는 연속해서 호출하는 것이 불가능
	//2개의 정수를 받아서 더해주는 메서드
	//static이 없으니 인스턴스.addWithInteger(정수1,정수2) 이렇게 호출해야 함
	public int addWithInteger(int first, int second) {
		//2개의매개변수를 더한 결과를 리턴
		return (first+second);
	}
	//메서드 오버로딩
	public void display() {
		
	}
	//매개변수의 개수가 달라서 오버로딩
	public void display(int a) {
		
	}
	//매개변수의 개수는 같지만 자료형이 달라서 오버로딩
	public void display(double a) {
	
	}
	//매개변수가 기본형 1개
	//내부에서 매개변수의 값을 수정해도 넘겨준 데이터는 변경되지 않음
	public static void callByValue(int n) {
		n = n+1;
		System.out.println("n:"+n);
		}
	//매개변수가 참조형인 경우
	public static void callByReference(int [] ar) {
		ar[0] = ar[0] +1;
		System.out.println("ar:" + ar[0]);
	}
	public int score = 100;
	
    public void thisMethod() {
    	int score =200;
    	//scope의 법칙 적용- 가까이에서 만든 것을 사용
    	System.out.println("score:" + score); //200
    	//인스턴스가 가진 score 호출
    	//this가 붙으면 메서드 안에서는 찾지 않음
    	System.out.println("this.score:" + this.score); 
    }
	public static int noRecursionFibonacci(int n) {
		int n_1 = 1; //현재 구하고자 하는 피보나 값의 바로 앞
		int n_2 = 1; //현재 구하고자 하는 피보나 값의 두번째 앞
		//기본값 설정
		int fibo = 1;
		//규칙이 3번째 부터 적용
		int i = 3;
		while (i<= n) {
			fibo = n_1 + n_2;
			
			//n_1과 n_2를 이동
			n_2 = n_1;
			n_1 = fibo;
			
			i=i+1;
		}
		return fibo;
	}
	
	//재귀를 이용한 피보나치 수열
	public static int recursionFibonacci(int n) {
		if(n ==1 || n == 2) {
			return 1;
		}
		return recursionFibonacci(n-1) +
				recursionFibonacci(n - 2);
	}
	
	//매개변수의 개수를 가변으로 설정
	public static void display(String ... args) {
		for(String temp: args) {
			System.out.println(temp);
		}
	}

}