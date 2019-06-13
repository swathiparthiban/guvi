package Example;
import java.util.*;
public class Average {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int sum=0,avg=0;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			 sum=sum+a[i];
		}
		System.out.println(avg=sum/n);
	}

}
