package Problems;
import java.util.*;
public class StringIsNumeric {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String str="";
		String str1="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if((ch>='0') && (ch>='9')){
				str+=ch;
			}
			if((ch>='a'||ch>='A') && (ch<='z'||ch<='Z')){
				str1+=ch;
			}
		}
		if(str1==""){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
