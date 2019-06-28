package Example;
import java.util.*;
public class CheckBothAlphaNum {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		if(s.matches(".*[a-zA-Z].*")&& s.matches(".*[0-9].*")){
			System.out.println("yes");
			
		}
		else{
			System.out.println("no");
		}
	}

}
