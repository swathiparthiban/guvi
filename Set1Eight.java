package Guvi;
import java.util.*;
public class Set1Eight {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			
		}
		int val=0,s=0,val1=0,value=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
				 val=a[i];
				 val1=a[j];
				 s=a[k];
				 value=a[i]+a[j];
				 if(value==s){
						System.out.println(val+" "+val1+" "+s);
			}
			}
		}
		
		
		}
	}


	
}
