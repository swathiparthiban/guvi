package Example;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		String s=String.valueOf(n);
		System.out.println(Integer.parseInt(s,2));
	}

}
