package Example;
import java.util.*;
public class Concatenate {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String str=scan.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.append(str);
		System.out.println(sb);
		
	}

}
