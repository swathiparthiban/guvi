package Guvi;
import java.util.*;
public class Set2Hunter13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String e="";
		Stack str=new Stack();
		for(int i=0;i<s.length();i++){
          str.push(s.charAt(i));	
}
		while(!str.empty()){
			e+=str.pop();
		}
		if(e.equals(s)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
}
}
