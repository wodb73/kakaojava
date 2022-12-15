package kakao.wodb.datatype;

public class PrimitiveType {

	public static void main(String[] args) {
		// 정수 저장하고 출력
		int x = 100;
		System.out.println("x:" + x);
		
		//동일한 공간에서 동일한 이름의 변수를 2번 생성하면 에러
		//int x = y;
		int y = 100;
		System.out.println("y:" + y);
		System.out.println("x:" + System.identityHashCode(x));
		System.out.println("y:" + System.identityHashCode(y));

		//정수는 자신의 자료형보다 큰 범 데이터를 참조할수 없음
		//int x =20000000000 ;
		
		//21억보다 크거나 -21억보다 작은 정수는 long을 생성
		//천단위 구분 기호는 _ 
		long I =200_000_000_000L;
		System.out.println(I);
		
		//16진수 저장 - 참조 나 색상을 나타낼ㄷ 때 많이 이용
		x = 0X789;
		System.out.println("x:" + x);
		//8진수 저장 - 권한 설정할 때 입니다.
		//rwx로 권한을 표현하는 경우가 많음
		x= 0777;
		System.out.println("x" + x);
		


		
		float f =0.1234567890123456789f;
		System.out.println("f:"+f);
		
		char ch = 'A';
		System.out.println("ch:"+ ch);
		System.out.println(ch+1);
		
		ch = '\uAC00';
		System.out.println("ch:"+ ch);
		
		char a = 'b';
		System.out.println(a);
		
		
		
	}

}
