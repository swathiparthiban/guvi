package Example;
import java.util.*;
public class NumberOfRepOfK {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int[n];
		int b=scan.nextInt();
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
		if(a[i]==b){
			count++;
	}

}
		System.out.println(count);
	}
}
