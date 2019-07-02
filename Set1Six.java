package Guvi;
import java.util.*;
public class Set1Six {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int s=0, count=0,b=0,c=n;

		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					s=a[i];
					b=i;
					count++;
				}
			}
			if(count>0){
				if(c>b){
					c=b;
				}
			}
		}
		if(c>=0){
			System.out.println(a[c]);
		}
				else{
					System.out.println("unique");
					
				}
			}
		
	}


