package Example;
import java.util.*;
public class Natural {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
