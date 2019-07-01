package Example;
import java.util.*;
public class SwapEvenOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char [] c=s.toCharArray();
		char temp;
		for(int i=0;i<c.length;i+=2){
			temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
	}
}
