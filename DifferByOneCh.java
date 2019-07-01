package Example;
import java.util.*;
public class DifferByOneCh {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		String s="";
		int c=0;
		if((a.length()==b.length())){
			for(int i=0;i<a.length();i++){
				if(b.charAt(i)==a.charAt(i)){
				
					s+=a.charAt(i);
				}
					else{
						c++;
					}
					 
				}
			}
			if(s!="" && c==1){
				System.out.println("yes");
			}
			else{
				System.out.println("no");	
			}
			
		}
	}


