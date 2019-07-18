package Guvi;
import java.util.*;
public class CountNosInTheRange {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int n1=scan.nextInt();
		int count=0;
		for(int i=n+1;i<n1;i++){
			count++;
		}
		System.out.println(count);
	}

}
