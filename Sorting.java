package Example;
import java.util.*;
public class MaximumElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}

}
