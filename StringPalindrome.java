package Example;
import java.util.*;
public class StringPalindrome {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	StringBuffer str=new StringBuffer(s);
	String sb=str.reverse().toString();
	if(sb.equals(s)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
