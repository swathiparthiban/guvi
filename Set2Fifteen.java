package Guvi;
import java.util.*;
public class Set2Fifteen {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[]a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=scan.nextInt();
	}
	int store=0;
	String s="";
	for(int i=0;i<n;i++){
		store=0;
		if(i==n-1){
			s+=a[i];
			break;
		}
		for(int j=i+1;j<n;j++){
			if(a[i]<a[j]){
				break;
			}
			else{
				store++;
			}
		}
		if(store==((n-1)-i)){
			s+=a[i]+" ";
		}
	}
	System.out.println(s);
	System.out.println(s.charAt(0));
}
}
