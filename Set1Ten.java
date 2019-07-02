package Guvi;
import java.util.*;
public class Set1Ten {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();int count=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		int a[]=new int[N];
		int M=scan.nextInt();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		int b[]=new int[M];
		
		for(int i=0;i<N;i++){
				a[i]=scan.nextInt();
				al.add(a[i]);
				
		}
		for(int j=0;j<M;j++){
				b[j]=scan.nextInt();
				al2.add(b[j]);
		}
		if(al.retainAll(al2)){
			Iterator itr=al.iterator();
			while(itr.hasNext()){
				itr.next();
				count++;
			}
if(count>0){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
		 
		 
	}
	}
}

