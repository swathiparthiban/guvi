package Example;
import java.util.*;
public class Isogram {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
        char[] c=s.toCharArray();
        String res="";
        for(int i=0;i<c.length;i++){
        	for(int j=i+1;j<c.length;j++){
        		if(c[i]==c[j]){
        		   res+=c[i];
        		}
        	}
        }
        if(res==""){
        	System.out.println("yes");
        }
        else{
        	System.out.println("no");
        }
	}

}
