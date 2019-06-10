package Example;
import java.util.*;
public class Largest {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		if((n>n1)&&(n>n2)){
			System.out.println(n);
		}
		else if((n1>n)&&(n1>n2)){
			System.out.println(n1);
		}
		else{
			System.out.println(n2);
		}
		
		
	}

}
