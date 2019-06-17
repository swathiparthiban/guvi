package Example;
import java.util.*;
public class FirstLastSum {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		String s=String.valueOf(n);
		
		int s1=Integer.parseInt(s.substring(0,1));
		char ch=s.charAt(s.length()-1);
		int k=Integer.parseInt(String.valueOf(ch));
		System.out.println(s1+k);
		
		
		

}
}
