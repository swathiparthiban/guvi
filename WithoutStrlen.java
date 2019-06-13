package Example;
import java.util.*;
public class WithoutStrlen {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int i=0;
		for(char ch:s.toCharArray()){
			i++;
		}
		System.out.println(i);
	}

}
