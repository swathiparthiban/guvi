package Example;
import java.util.*;
public class Palindrome {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		String s=String.valueOf(n);
		StringBuffer str=new StringBuffer(s);
		String S=str.reverse().toString();
		if(S.equals(s)){
			System.out.println("yes");
		}
		else{
		System.out.println("no");
	}

	}
}
