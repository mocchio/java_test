public class Matango {
  int hp = 50;
  char suffix;

  public Matango(char suffix) {
    this.suffix = suffix;
    System.out.println("キノコ" + suffix + "が現れた！");
  }

  public void attack(Hero h) {
    System.out.println("キノコ" + this.suffix + "の攻撃！");
    System.out.println(h.name + "に10のダメージ");
    h.hp -= 10;
  }
}