public class sample0630 {
  public static void main(String[] args) {
    for(int i=1; i<=5; i++) {
      for(int j=1; j<=5-i; j++) {
        System.out.print(" ");
      }
      for(int m=1; m<=i; m++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}