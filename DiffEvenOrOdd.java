package Guvi;
import java.util.*;
public class AddAndCheckEvenOrAdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int n2=scan.nextInt();
		int a=n-n2;
		if(a%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}

}
