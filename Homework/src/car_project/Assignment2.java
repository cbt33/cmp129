public class Assignment2 {

  public static carConstructorTest() {}

  public static void carSetYearTest() {
    Car test = new Car();
    //Below lower Limit
    test.setYear(1969);
    //At lower limit
    test.setYear(1970);
    //Valid input
    test.setYear(1971);
    //At upper limit
    test.setYear(2011);
    //Above upper limit
    test.setYear(2012);
    //Negative
    test.setYear(-1);
    //Zero
    test.setYear(0);
  }
  
  public static void carSetPriceTest() {
    Car test = new Car();
    //Below lower Limit
    test.setPrice(-1);
    //At lower limit
    test.setPrice(0);
    //Valid input
    test.setPrice(1);
    //At upper limit
    test.setPrice(100000);
    //Above upper limit
    test.setPrice(100001);
  }

  public static void main(String[] args) {
    carSetYearTest();
    carSetPriceTest();
  }
}
