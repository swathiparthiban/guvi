package Problems;
import java.util.*;
public class RepeatedExceptOne {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int b=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int j=0;
		for(int i=0;i<n;i++){
			for( j=0;j<n;j++){
			if(a[i]==a[j] && i!=j){
            break;
			}
			}
			if(j==n){
			System.out.print(a[i]+" ");
		}
	} 
		}


}


