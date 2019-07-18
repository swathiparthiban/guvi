package Example;
import java.util.*;
public class SumofAllNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int n1=0;
		for(int i=0;i<n;i++){
			n1+=a[i];
		}
		System.out.println(n1);
	}

}
