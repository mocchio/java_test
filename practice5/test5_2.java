public class Main {
  public static void email(String text, String address, String title) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }

  // オーバーロード
  public static void email(String text, String address) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }

  public static void main(String[] args) {
    email("メール本文", "メールアドレス");
  }
}