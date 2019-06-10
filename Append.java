package Example;
import java.util.*;
public class Append {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		StringBuilder str=new StringBuilder(S).append(".");
		System.out.println(str);
	}

}
