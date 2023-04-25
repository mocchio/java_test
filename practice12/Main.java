public class Main {
  public static void main(String[] args) {
    Y[] elements = new Y[2];
    elements[0] = new A();
    elements[1] = new B();

    for (Y y : elements) {
      y.b();
    }
  }
}