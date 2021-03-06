package examples.equals;

public class House
{
	private int rooms;
	private double price;


	public boolean equals( Object m )
	{
		if ( m == null )
			return false;

		if ( m.getClass( ) != House.class )
		    return false;

		House p = (House) m;

		if ( rooms == p.rooms && price == p.price)
			return true;
		else
			return false;
	}


	public House( int r , double p )
	{
		rooms = r;
		price = p;
	}

	public String toString( )
	{
		return "A house with price " + price + ", and " + rooms + " rooms.";
	}

}