package Example;
import java.util.*;
public class WithoutStrcmp {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String str=scan.nextLine();
		if(s.equals(str)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
