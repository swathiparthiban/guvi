package Example;
import java.util.*;
public class CountNoOfWords {
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
    String[] words=s.split("\\s+");
	
		System.out.print(words.length);
	}

}
