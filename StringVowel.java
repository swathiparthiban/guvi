package Example;
import java.util.*;
public class StringVowel {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	int count=0;
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++){
	if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
		System.out.println("yes");
		count=0;
		break;
	}
	else{
		count++;
		
	}
	}
	if(count>0){
		System.out.println("no");
	}
}
}
