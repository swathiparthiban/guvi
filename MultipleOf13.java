package Guvi;
import java.util.*;
public class MultipleOf7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<a;i++){
			 if(i*13==a){
				flag=true;
				break;
			 }
		}
		if(flag==true)
			 System.out.println("yes");
			 else{
				 System.out.println("no");
			 }
		
		
	}

}
