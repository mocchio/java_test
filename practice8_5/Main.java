public class Main {
  public static void main(String[] args) {
    Cleric c = new Cleric();
    c.name = "アクア";
    c.hp = 1;
    c.mp = 1;
    System.out.println("聖職者" + c.name + "が誕生した！");
    System.out.println("何秒天に祈る？");
    
    int pray_sec = new java.util.Scanner(System.in).nextInt();
    c.pray(pray_sec);
  }
}