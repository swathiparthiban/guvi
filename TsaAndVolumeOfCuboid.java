package Example;
import java.util.*;
public class TsaAndVolumeOfCuboid {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int b=scan.nextInt();
		int h=scan.nextInt();
		int Tsa=2*(l*b+h*b+l*h);
		int v=l*b*h;
		System.out.println(Tsa+" "+v);
	}

}
