package Example;
import java.util.*;
public class Set53 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		boolean flag=false;
		int n[]=new int[a];
		for(int i=0;i<a;i++){
			n[i]=scan.nextInt();
		}
		for(int i=0;i<a;i++){
			if(b==n[i])
			{
			flag=true;
			break;
			}
		}
		
			if(flag==true){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}

	}


