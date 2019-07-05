package Guvi;
import java.util.*;
public class MinimunAmong10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		TreeSet<Integer> l=new TreeSet<Integer>();
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			l.add(a[i]);
		}
		Arrays.sort(a);
		System.out.println(l.pollFirst());

}
}
