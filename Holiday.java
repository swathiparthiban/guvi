package Example;
import java.util.*;
public class Holiday {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		if(s.equals("saturday") || s.equals("sunday")){
			System.out.print("yes");
			
		}
		else{
			System.out.print("no");
		}
	}

}
