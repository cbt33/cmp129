package car_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment2 {


	@Test (expected = CarException.class)
	public void carSetYearBelowRangeTest() throws CarException {
	    Car test = new Car();
	    //Below lower Limit
	    test.setYear(1969);
	}
	
    @Test
    public void carSetYearAtLowLimitTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setYear(1970);
	    assertEquals(test.getYear(), 1970);
    }
    
    @Test
    public void carSetYearAtValidInputTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setYear(1971);
	    assertEquals(test.getYear(), 1971);
    }
    
    @Test
    public void carSetYearAtHighLimitTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setYear(2011);
	    assertEquals(test.getYear(), 2011);
    }
    
    @Test (expected = CarException.class)
    public void carSetYearAboveRangeTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setYear(2012);
    }
    
    @Test (expected = CarException.class)
	public void carSetPriceBelowRangeTest() throws CarException {
	    Car test = new Car();
	    //Below lower Limit
	    test.setYear(-1);
	}
	
    @Test
    public void carSetPriceAtLowLimitTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setPrice(0);
	    assertEquals(test.getPrice(), 0, .001);
    }
    
    @Test
    public void carSetPriceAtValidInputTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setPrice(1);
	    assertEquals(test.getPrice(), 1, .001);
    }
    
    @Test
    public void carSetPriceAtHighLimitTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setPrice(100000);
	    assertEquals(test.getPrice(), 100000, .001);
    }
    
    @Test (expected = CarException.class)
    public void carSetPriceAboveRangeTest() throws CarException {
    //At lower limit
        Car test = new Car();
	    test.setPrice(100001);
    }

}
