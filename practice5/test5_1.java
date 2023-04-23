public class Main {
  public static void main(String[] args) {
    introduceOneself();
  }

  public static void introduceOneself() {
    String name = "井上";
    int age = 24;
    double height = 182.1;
    char zodiac = '卯';
    System.out.println("名前は" + name + "です");
    System.out.println(zodiac + "年の" + age + "歳です");
    System.out.println("身長は" + height + "cmです");
  }
}