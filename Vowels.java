package Example;
import java.util.*;
public class Vowels {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println("vowels");
			
		}
		else if((ch>='a'&&ch<='z')){
			System.out.println("consonants");
		}
		else{
			System.out.println("invalid");
		}
	}

}
