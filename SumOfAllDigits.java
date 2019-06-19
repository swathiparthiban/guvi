package Example;
import java.util.*;
public class SumOfAllDigits {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum,r=0;
		for(sum=0;n!=0;n/=10){
			r=n%10;
			sum=sum+r;
		}
		System.out.println(sum);
	}

}
