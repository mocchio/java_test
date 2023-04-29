import java.util.*;

public class Main {
  public static void main(String[] args) {
    // // ①Listの練習
    // // Heroクラスのインスタンス生成
    // Hero h1 = new Hero("斉藤");
    // Hero h2 = new Hero("鈴木");
    // // ArrayListの宣言と要素の追加
    // List<Hero> heroes = new ArrayList<Hero>();
    // heroes.add(h1);
    // heroes.add(h2);
    // // 1人ずつ名前を取り出す
    // for (Hero h : heroes) {
    //   System.out.println(h.getName());
    // }

    // ②Mapの練習
    // Heroクラスのインスタンス生成
    Hero h1 = new Hero("斉藤");
    Hero h2 = new Hero("鈴木");
    // HashMapの宣言と要素の追加
    Map<Hero, Integer> breakers = new HashMap<Hero, Integer>();
    breakers.put(h1, 3);
    breakers.put(h2, 7);
    // 要素を1つずつ取り出す
    for (Hero key : breakers.keySet()) {
      int value = breakers.get(key);
      System.out.println(key.getName() + "が倒した敵＝" + value);
    }
  }
}