import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // ①StringBuilderを用いた連結
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 100; i++) {
    //   sb.append(i+1).append(",");
    // }
    // String s = sb.toString();
    // String[] a = s.split(",");
    // System.out.println(Arrays.toString(a));

    // ②文字列操作
    String folder = "c:¥java¥";
    String file = "test.java";
    System.out.println(concatPath(folder, file));
  }
  // ②文字列操作メソッド
  public static String concatPath(String folder, String file) {
    if (!folder.endsWith("¥")) {
      folder += "¥";
    }
    return folder + file;
  }
}