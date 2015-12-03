package examples.clone;
			
public class DeepCloningTest2 {
			
	class Money {
		public double amount;
		
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

	class House implements Cloneable
	{
			private Money price;
			
			public House(double nPrice)
			{
				this.price = new Money();
				this.price.amount = nPrice;
			}

			public void setPrice(double amount) {
				this.price.amount = amount;
			}
			
			public String toString() {
				return "The price is:" + price.amount;
			}
			
			public Object clone() throws CloneNotSupportedException {
				return new House(price.amount);
			}
	}
					
		public static void main(String args[]) throws CloneNotSupportedException 
		{
			DeepCloningTest2 dc = new DeepCloningTest2();
			House x = dc.new House(4000);
			System.out.println("House x. " + x);
			
			House y;
			y = (House) x.clone();
			System.out.println("House y. " + y);
			
			System.out.println("Now changing the price for x.");
			x.setPrice(2000);
			
			System.out.println("House x. " + x);
			System.out.println("House y. " + y);
			
		}
}
