package

public class Car{
  private int year;
  private BigDecimal price;
  
  public Car(int y, double p) {
    try {
      this.setYear(y);
      this.setPrice(new BigDecimal(p, new MathContext(2, RoundingMode.UP)));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    public void setYear(int y) throws YearException {
      if (year < 1970 || year > 2011) {
        throw new InvalidYearException();
        System.out.println("Year Invalid. Set to lowest value, 1970.");
        year = 1970;
        }
        year = y;
    }
    
    public void setPrice(double p) throws PriceException {
      if (p < 0 || Math.mod(price)) {
        throw new InvalidPriceException();
        System.out.println("Price Invalid. Set to lowest value, 0.");
        price = 0;
        }
      price = p;
    }
    
    public int getYear() {
      return year;
    }
    
    public double getPrice() {
      return price.doubleValue();
    }
    
    
    
  }
  
  
  
}
