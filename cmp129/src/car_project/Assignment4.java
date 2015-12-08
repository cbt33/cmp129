package car_project;

import org.junit.*;

public class Assignment4 {
  
 @Test(expected = CarException.class)  
  public void setPriceTest() throws CarException {
      Car test = new Car();
      test.setPrice(-4);
  }
 
  @Test(expected = CarException.class)  
  public void setYearTest() throws CarException {
    Car test = new Car();
    test.setYear(-4);
  }
  
  @Test(expected = CarException.class)  
  public void constructorTest() throws CarException {
    Car test = new Car(-4,-4);
    test.setYear(-4);
  }
  
}
