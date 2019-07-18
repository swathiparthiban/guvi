package Example;
import java.util.*;
public class PrintKthNo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int res=scan.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			if(a[i]==res){
				System.out.println(a[i]);
			}
		}
	}

}
