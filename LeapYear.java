package Example;
import java.util.*;
public class LeapYear {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		if(n%4==0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");

		}
	}

}
