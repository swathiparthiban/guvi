package Example;
import java.util.*;
public class GreaterString {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String b=scan.nextLine();
		if(a.compareTo(b)>0 || a.equals(b)){
			System.out.print(a);
		}
		else{
			System.out.print(b);
		}
	}

}
