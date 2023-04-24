public class Cleric {
  String name;
  int HP = 50;
  final int maxHp = 50;
  int MP = 10;
  final int maxMp = 10;

  public void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.Mp -= 5;
    this.Hp = this.maxHp;
    System.out.println("HPが最大まで回復した！");
  }

  public void pray(int sec) {
    System.out.println(this.name + "は、" + sec + "秒天に祈った！");
    int random_sec = new java.util.Random().nextInt(3);
    int recovery = sec + random_sec;
    int recovery_actual = Math.min(this.maxMp - this.MP, recovery);
    this.MP += recovery_actual;
    System.out.println("MPが" + recovery_actual + "回復した！");
    return recovery_actual
  }
}