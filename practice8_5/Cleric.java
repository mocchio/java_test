public class Cleric {
  String name;
  int hp = 50;
  static final int maxHp = 50;
  int mp = 10;
  static final int maxMp = 10;

  public void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.maxHp;
    System.out.println("HPが最大まで回復した！");
  }

  public void pray(int sec) {
    System.out.println(this.name + "は、" + sec + "秒天に祈った！");
    int random_sec = new java.util.Random().nextInt(3);
    int recovery = sec + random_sec;
    int recovery_actual = Math.min(this.maxMp - this.mp, recovery);
    this.mp += recovery_actual;
    System.out.println("MPが" + recovery_actual + "回復した！");
  }
}