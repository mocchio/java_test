import java.io.*;

public class Main {
  public static void main(String[] args) {
    // try-catch文の記述
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException例外をcatchしました");
      System.out.println("--スタックトレース（ここから）--");
      e.printStackTrace();
      System.out.println("--スタックトレース（ここまで）--");
    }
  }
}