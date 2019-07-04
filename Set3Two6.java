package Guvi;
import java.util.*;
public class Set3Two6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] a=new int[n];
		String s="";
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			s+=String.valueOf(a[i]);
		}
		 StringBuffer sb=new StringBuffer(s);
		 sb.reverse();
		 String res=String.valueOf(sb);
		  for(int i=0;i<res.length();i++)
		 {
			System.out.print(res.charAt(i));
			if(i!=res.length()-1)
				System.out.print("->");
		 }

		
			
		}
		
	}


