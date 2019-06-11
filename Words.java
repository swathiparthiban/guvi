package Example;
import java.util.*;
public class Words {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for(String str:s.split(" ")){
			StringBuffer sb=new StringBuffer(str);
			System.out.print(sb.reverse()+" ");
		}
	}

}
