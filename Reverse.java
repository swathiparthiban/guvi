package Example;
import java.util.*;
public class Reverse {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s1=String.valueOf(n);
		StringBuffer s=new StringBuffer(s1);
		System.out.println(s.reverse());
		
	}

}
