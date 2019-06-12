package Example;
import java.util.*;
public class SumOfFirstK {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int K=scan.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<K;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		}
	}
