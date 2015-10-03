import org.junit.*;

public class Assignment4 {
  
	@Test(expected = CarException.class)  
  public static void setPriceTest() {
      Car test = new Car();
      test.setPrice(-4);
  }
  @Test(expected = CarException.class)  
  public static void setYearTest() {
    Car test = new Car();
    test.setYear(-4);
  }
  @Test(expected = CarException.class)  
  public static void constructorTest() {
    Car test = new Car(-4,-4);
    test.setYear(-4);
  }
  
}
