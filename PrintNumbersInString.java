package Example;
import java.util.*;
public class PrintNumbersInString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String str="";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			
			if(Character.isDigit(c[i])){
				str+=c[i];
			}
		}
		System.out.println(str);
	}
}
