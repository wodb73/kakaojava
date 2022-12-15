package kakao.wodb.operatior;

public class Unary {

	public static void main(String[] args) {
			int n1 = 20;
			int n2 = -20;
			//정수 데이터가 2진수로 저장된 구조를 출력
			System.out.println("n1:" + Integer.toBinaryString(n1));
			System.out.println("n2:" + Integer.toBinaryString(n2));
			
			//1의 보수 구하기 + 21
			System.out.println("~n2:" + Integer.toBinaryString(~n2) + " = 정수값 " + ~n2);
			
			System.out.println("~n1:" + Integer.toBinaryString(~n1) + " = 정수값 " + ~n1);
			
		boolean a = true;
		
		System.out.println(!a);
		
		int n = 30;
		System.out.println(n++);
		System.out.println(++n);
		System.out.printf("%d %d %d",n++,n++, ++n);
		
		
		
		

	}

}
