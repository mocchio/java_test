import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Heroクラスのインスタンス生成
    Hero h1 = new Hero("斉藤");
    Hero h2 = new Hero("鈴木");
    // ArrayListの宣言
    List<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    // 1人ずつ名前を取り出す
    for (Hero h : heroes) {
      System.out.println(h.getName());
    }
  }
}