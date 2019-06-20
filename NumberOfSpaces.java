package Example;
import java.util.*;
public class NumberOfSpaces {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int length=s.length()-s.replaceAll(" ", "").length();
		System.out.println(length);
	}

}
