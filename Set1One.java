package Guvi;
import java.util.*;
public class Set1One {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		TreeSet<Integer>t=new TreeSet<Integer>();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		int val=0,count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					val=a[i];
					count=1;
					t.add(val);
					break;
				}
				}
				
		
	}
		if(count==0)System.out.println("unique");
		else{
		Iterator it = t.iterator(); 		
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		}
				}
				
			}
		
		
	


