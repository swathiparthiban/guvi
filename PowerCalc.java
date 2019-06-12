package Example;
import java.util.*;
public class PowerCalc {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int k=scan.nextInt();
		int s=1;
		for(int i=1;i<=k;i++){
			s=s*N;
		}
		System.out.println(s);
	}

}
