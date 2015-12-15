package examples.clone;
			
public class DeepCloningTest1 {
			
	class Money {
		public double amount;
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
				return super.clone();
			}
	}
					
		public static void main(String args[]) throws CloneNotSupportedException 
		{
			DeepCloningTest1 dc = new DeepCloningTest1();
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
