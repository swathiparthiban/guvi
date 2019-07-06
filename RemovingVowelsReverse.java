package Example;
import java.util.*;
public class RemovingVowelsReverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char[] ch=s.toCharArray();
		char a=0;
		String str="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ){
			 a=ch[i];
			}
			else if(ch[i]!=a){
			str=str+ch[i];
		}
		}
        char[] c=str.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);

		}
	}
}



