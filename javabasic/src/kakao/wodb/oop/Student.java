package kakao.wodb.oop;

public class Student {
	public static String schooLName; 
	
	//static 초기화
	static {
		System.out.println("로고 출력");
		//static 변수 사용 가
		schooLName = "만재국민학교";
		//인스턴스 속성 사용 불가
		//num = 1;
		
	}
	public final int x;
	public Student(){
		x= 10;
	}
	
	
	protected int num;
	public String name;
	public int kor;
	public int eng;
	public int mat;
}


