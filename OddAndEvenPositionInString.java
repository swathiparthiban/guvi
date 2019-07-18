package Example;
import java.util.*;
public class OddAndEvenPositionInString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char[] c=s.toCharArray();
		String str="";
		String res="";
		int i;
		for( i=0;i<c.length;i++){
			if(i%2!=0){
				str+=c[i];
			}
			else{
				res+=c[i];
			}
		}
		System.out.println(res+" "+str);
	}

}

