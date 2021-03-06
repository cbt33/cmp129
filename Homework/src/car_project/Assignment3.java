package car_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment3 {
  
  @SuppressWarnings("static-access")
@Test
  public void defaultConstructorTest() throws CarException {
    Car test = new Car();
    assertEquals(test.getYear(), test.getMinYear());
    assertEquals(test.getPrice(), test.getMinPrice(), .001);
    
  }
  
  @Test
  public void overloadedConstructorTest() throws CarException {
    Car test = new Car(1971, 50000.0);
    assertEquals(test.getYear(), 1971);
    assertEquals(test.getPrice(), 50000.0, .001);
  }
  
  @Test
  public void copyConstructorTest() throws CarException {
    Car test = new Car(1971, 50000);
    Car copy = new Car(test);
    assertEquals(test.getYear(), copy.getYear());
    assertEquals(test.getPrice(), copy.getPrice(), .001);
  }
  
}
