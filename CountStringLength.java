package Example;
import java.util.*;
public class CountStringLength {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String s1=s.replaceAll("\\s", "");
		System.out.println(s1.length());
		
		
	}
	}
