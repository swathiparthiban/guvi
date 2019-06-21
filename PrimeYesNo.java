package Example;
import java.util.*;
public class PrimeYesNo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int count=0;
	int n=scan.nextInt();
	for(int i=2;i<n;i++){
		if(n%i==0){
			count++;
			break;
		}
	}
		if(count==0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	
}
