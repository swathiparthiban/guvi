package Example;
import java.util.*;
public class SameOrderDigits {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=String.valueOf(n);
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i)+" ");
		}
		
	}

}
