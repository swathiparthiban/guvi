package Example;
import java.util.*;
public class LexicographicalOrderOfChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(Character.toLowerCase(c[j]) < Character.toLowerCase(c[i])){
                       char temp=c[i];
                       c[i]=c[j];
                       c[j]=temp;
				}
			}
		}
		System.out.println(String.valueOf(c));
		
	}
}
		
	


