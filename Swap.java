package Example;
import java.util.*;
public class Swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int s;
		s=n1;
		n1=n2;
		n2=s;
		System.out.println(n1+" "+n2);
	}

}
