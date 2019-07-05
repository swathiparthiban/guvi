package Guvi;
import java.util.*;
public class Betweennumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		if((N<a || N>a) && (N<b || N>b)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
