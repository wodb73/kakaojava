package kakao.wodb.controlstater;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 0;
		int i = 0;
		while (i<=10) {
			//반복할 내용
			tot = tot +i;
			i = i +1;
		}
		int to = 0;
		int u = 0;
		do{
			//반복할 내용 //do while문은 한번은 무조건 수
			to = to +u;
			u = u +1;
		}while(u<=10);
		System.out.println("합계:" + tot);
		System.out.println("합계:" + to);
		
	    
		

			

	}

}
