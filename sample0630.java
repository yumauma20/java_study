public class sample0630 {
  public static void main(String[] args) {
    int x;
    x = 80;
    for(int i=1; i<=x; i++) {
      for(int j=1; j<=x-i; j++) {
        System.out.print(" ");
      }
      for(int m=1; m<=i*2-1; m++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}