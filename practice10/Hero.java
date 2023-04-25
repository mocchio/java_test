public class Hero {
  String name;
  int hp;

  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
    System.out.println("勇者" + this.name + "が誕生した！");
  }
}