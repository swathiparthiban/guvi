package Example;
import java.util.*;
public class ValidateStringIsNumeric {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String str="";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(Character.isDigit(ch[i])){ 
				str+=ch[i];
			}
			else if(Character.isAlphabetic(ch[i])){
				str+=ch[i];
			}
			else{
				count++;
			}


			
			}
		System.out.println(count);
		
		
		
        
	}
}

