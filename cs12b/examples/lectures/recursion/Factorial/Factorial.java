//-----------------------------------------------------------------------------
// Factorial.java
//-----------------------------------------------------------------------------

public class Factorial {

   public static int fact(int n) {
      if(n>0)   // what if the test was n!=0 ?
         return n*fact(n-1);
      else
         return 1;
   }

   public static void main(String[] args) {
      System.out.println(fact(10));
   }
}F
