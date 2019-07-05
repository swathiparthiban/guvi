package Guvi;
import java.util.*;
public class Power {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<=n;i++){
			if(Math.pow(2,i)==n)
			{
			   flag=true;
			   break;
			}
			}
		if(flag==true)
			System.out.println("yes");
		else
			System.out.println("no");
		}
	}



