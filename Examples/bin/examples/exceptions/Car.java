package

public class Car{
  private int year;
  private BigDecimal price;
  
  public Car(int y, double p) {
    try {
      this.setYear(y);
      this.setPrice(p);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
    
    public void setYear(int y) throws YearException {
      if (year < 1970 || year > 2011) {
        throw new InvalidYearException();
        year = 1970;
        }
        year = y;
    }
    
    public void setPrice(double p) throws PriceException {
      if (p < 0 || p > 100000) {
        throw new InvalidPriceException();
        price = new BigDecimal(0, new MathContext(2, RoundingMode.UP));
      }
      price = new BigDecimal(p, new MathContext(2, RoundingMode.UP));
    }
    
    public int getYear() {
      return year;
    }
    
    public double getPrice() {
      return price.doubleValue();
    }
    
    
    
  }
  
  
  
}
