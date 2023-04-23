public class Main {
  public static double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / 2;
    return area;
  }

  public static double calcCircleArea(double radius) {
    double area = (radius * radius) * 3.14;
    return area;
  }

  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 4.0);
    System.out.println("三角形の面積：" + triangleArea + "㎠");
    double circleArea = calcCircleArea(6.0);
    System.out.println("円の面積：" + circleArea + "㎠");
  }
}