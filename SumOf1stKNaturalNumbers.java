package Example;
import java.util.*;
public class SumOf1stKNaturalNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=0;
		for(int i=0;i<=n;i++){
			a+=i;
		}
		System.out.println(a);
	}

}
