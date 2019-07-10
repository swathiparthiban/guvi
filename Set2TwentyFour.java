package Guvi;
import java.util.*;
public class Set2TwentyFour {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int count=0;
		int store=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==k){
					store+=a[i]+a[j];
					break;
				}
				else{
					count++;
				}
				if(store==k){
					System.out.println("yes");
				}
				
				
				
				
			}
		}
		if(store==0){
			System.out.println("no");
		}
		
		
	} 


}
