package Problems;
import java.util.*;
public class GreatestNoDivideboth {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();

        if(a>b){
        	System.out.println(a=a-b);
        }
        else{
        	System.out.println(b=b-a);
        }
}
}
