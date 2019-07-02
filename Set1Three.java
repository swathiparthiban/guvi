package Guvi;
import java.util.*;
public class Set1Three {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
	
		if(a[i]==i){
			System.out.print(a[i]+" ");
			count=a[i];
		}
		
		}
		if(count==0){
			System.out.print("-1");
		}
		
	}


}
