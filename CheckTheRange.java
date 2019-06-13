package Example;
import java.util.*;
public class CheckTheRange {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=1 && n<=10){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
