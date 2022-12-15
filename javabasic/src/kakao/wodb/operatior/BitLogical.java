package kakao.wodb.operatior;

public class BitLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 20;
		int n2 = 17;
		System.out.println(n1 & n2); //둘다 1일경우 1
		System.out.println(n1 | n2); //하나라도 1일경우 1
		System.out.println(n1 ^ n2);//다르면 1
		
		boolean n3 = true;
		boolean n4 = false;
		
		System.out.println(n3 && n4);
		System.out.println(n3 || n4);
		System.out.println(n3 ^ n4);
		
		
		
		
	}

}
