package kakao.wodb.operatior;

public class TypeCastion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d =37.4;
		//실수를 정수에 직접 대입하면 에러가 발생
		//실수가 정수보다 크기 때문입니다.
		//강제  형 변환을 이용하면 대입이 가능
		int n = (int) d;
		//실수를 정수로 강제 형 변환하면 소수가 버려짐
		System.out.println("n:" + n);
		
		short s1 = 200;
		short s2 = 300;
		//산술 연산은 int로 변환되서 수행되므로 결과가 최소 int
		short result = (short)(s1 + s2);
		System.out.println(result);
		
		double score1 = 91;
		double score2 = 90;
		
		double avg = (score1 + score2) / 2;
		System.out.println(avg);
		
		double a = 3.3;
		double b = 4.5;
		
		 double t = (a*b);
		System.out.println(t);

		
	}

}
