package Example;
import java.util.*;
public class FibonacciOfNnumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a=0,b=1,c,count=0;
	System.out.print(" "+b);
	for(int i=2;i<=n;i++){
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
				
	
	}
}
}
