public class Positive{ 
      public static void main(String args[]) {
   	  int n;
   	  Scanner sc = new Scanner(System.in);
   	  System.out.println("enter the number:");
   	  n = sc.nextInt();
   	  if(n<0) {
   	  System.out.println("the number is negative");
   	  }
   	  else if(n>0) {
   	  System.out.println("the number is positive");
   	  }
   	  else if(n==0) {
   	  System.out.println("the number is zero");
   	  }
   	  else {
   	  System.out.println("the number is:" + n);
   	  }
      }
}
