public class Main {
  public static void main(String[] args) {
    Account a = new Account();
    a.accountNumber = "4649";
    a.balance = 1592;
    //System.out.println(a.toString());
    Account o = new Account();
    o.accountNumber = " 4649";
    o.balance = 1592;
    System.out.println(a.equals(o));
  }
}