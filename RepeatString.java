package Example;
import java.util.*;
public class RepeatString {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			System.out.println(s);
		}
	}

}
