public class PoisonMatango extends Matango {
  int poisonCount = 5;

  public PoisonMatango(char suffix) {
    super(suffix);
  }

  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonCount > 0) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      int damagePoint = h.hp / 5;
      h.hp -= damagePoint;
      System.out.println(h.name + "に" + damagePoint + "のダメージ！");
      this.poisonCount -= 1;
    }
  }
}