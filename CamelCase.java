package Example;
import java.util.*;
public class CamelCase {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for(String str:s.split(" ")){
			String t=str.substring(0,1);
			System.out.print(t.toUpperCase()+str.substring(1).toLowercase()+" ");
		}
	}

}
