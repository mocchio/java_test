public class Account {
  String accountNumber; // 口座番号
  int balance; // 残高

  // 文字列表現メソッド
  public String toString() {
    return "¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
  }
}