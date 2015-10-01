public class Assignment3 {
  
  public static void defaultConstructorTest() {
    Car test = new Car();
    System.out.println(test);
  }
  
  public static void overloadedConstructorTest() {
    Car test = new Car(1971, 50000);
    System.out.println(test);
  }
  
  public static void copyConstructorTest() {
    Car test = new Car(1971, 50000);
    Car copy = new Car(test);
    System.out.println(test);
  }
  public static void main(String[] args) {
    defaultConstructorTest();
    overloadedConstructorTest();
    copyConstructorTest();
  }
}
