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
}