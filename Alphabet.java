package Example;
import java.util.*;
public class Alphabet {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if(ch>='a'&&ch<='z'){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("No");
		}
	}

}
