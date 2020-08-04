public class report1 {
  public static void main(String[] args) {
    double status = Math.random();
    if (status >= 0.5) {
      System.out.print("○");
    }
    else {
      System.out.print("×");
    }
    System.out.print(status);
  }
}