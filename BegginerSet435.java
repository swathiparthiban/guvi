package Example;
import java.util.*;
public class ValidateStringIsNumeric {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String str="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(Character.isDigit(ch[i])){
				str+=ch[i];
			}
			
			}
		if(str!=""){
			System.out.print(str.length());
		}
		
		
        
	}
}

