package Example;
import java.util.*;
public class Large {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				if(a[i]<a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
			}
		for(int i=0;i<N;i++){
			System.out.print(a[i]);
		}
	}

}
