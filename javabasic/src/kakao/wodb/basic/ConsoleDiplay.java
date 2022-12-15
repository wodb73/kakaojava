package kakao.wodb.basic;

public class ConsoleDiplay {

	public static void main(String[] args) {
		// Console에 메시지 출력
		System.out.println("Message");
		//메시지와 데이터를 결합해서 출력
		System.out.println("Data:" + 99);
		Integer i = 120;
		int ar[] = {10, 20, 30};
		System.out.println(i); //실제로는 i를 출력하는것이 아니고 i.toString()의 결과를 출력
		System.out.println(i.toString());
		System.out.println(ar[2]+ "배열");
		System.out.println(i);
		 
		
		
		
		
		
		
		//toString 이 재정의되지 않아서 해시코드가 출력됨
	}

}
