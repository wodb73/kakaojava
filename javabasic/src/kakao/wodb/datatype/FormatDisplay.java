package kakao.wodb.datatype;

public class FormatDisplay {

	public static void main(String[] args) {
		int n = 37;
		double d = 23.768952;
			
		String name1 = "mimi";
		String name2 = "wodb";
		System.out.printf("n:%d\n", n);
		//10자리를 확보해서 출력
		System.out.printf("n:%10d\n", n);
		//10자리 확보후 앞에 남는자리에 0을 추가
		System.out.printf("n:%010d\n", n);
		
		//소수 6째 자리까지 출력
		System.out.printf("d:%f\n", d);
		//소수 3째 자리까지 출력- 반올림
		System.out.printf("d:%.3f\n", d);
		
		//%s는 문자열을 출력하는 것이 아니고
		//원래 %s는 시작위치부터 바이트 단위로 데이터를 가져와서
		//문자로 변환한 후 출력하는 것으로
		//null을 만날때 까지 출력
		System.out.printf("name1:%8s\n",name1);
		System.out.printf("name2:%10s\n", name2);
		
		int a = 19;
		System.out.println(~a);
		int c = -20;
		System.out.println(~c);
		
		
				
		
		
		
	}

}
