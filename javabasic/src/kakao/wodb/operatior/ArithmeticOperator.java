package kakao.wodb.operatior;

public class ArithmeticOperator {

	public static void main(String[] args) {
			short s1 = 20;
			short s2 = 30;
			//short 사이의 덧셈이고 결과도 50이라서 short 저장가능하지만
			//이 문장은 에러
			//자바의 산술연산의 최소 단위는 int
			//자바는 s1과 s2로 int로 변환해서 연산을 수행하므로
			//결과는 int가 되서 short 에 저장할 수 없습니다.
			//이 경우는 결과를 int에 저장하던가 강제 형 변환을 통해서
			//short에 저장해야 합니
			//short = s1 + s2;
			// 해결 방법
			int result = s1 + s2;
			System.out.println(result++);
			System.out.printf("%d\n%d\n", ++result, result++);
			
			//나누기 연산에서의 나누는 수 확인
			//0으로 나누는 것이 에러가 아닐수 있음
			System.out.println(5/0.0); //결과 = infinity
			//연산이 안되는경우 infinity나 naN이 될 수 있음
			//
		     int a = 20;
		     int b = 17;
		     System.out.println(a&b);
		    	
	}

}
