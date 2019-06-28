package Example;
import java.util.*;
public class NearestEvenNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%2==0){
			System.out.println(n); 
		}
		else{
			System.out.println(n-1);
		}
	}

}
