package examples.equals;

public class EqualsDemo
{
	public static void main(String[] args)
	{
		House x = new House( 5 , 600000 );
		House y = new House( 5 , 600000 );
		House z = new House( 12 , 850000 );
		Car c = new Car( );

		//Case 1: the equals method should return false, if null is sent as parameter.
		if ( x.equals( null ) )
			System.out.println("House x DOES equal null.");
		else
			System.out.println("House x DOES NOT equal null.");

		//Case 2: the equals method should return false, if the house is compared with a non-house.
		if ( x.equals( c ) )
			System.out.println("House x DOES equal car c.");
		else
			System.out.println("House x DOES NOT equal car c.");

		//Case 3: the equals method should return false, if the house is compared against another house, with different attributes.
		if ( x.equals( y ) )
			System.out.println("House x DOES equal House y.");
		else
			System.out.println("House x DOES NOT equal House y.");

		//Case 4: the equals method should return false, if the house is compared against another house, with the same attributes.
		if ( x.equals( z ) )
			System.out.println("House x DOES equal House z.");
		else
			System.out.println("House x DOES NOT equal House z.");

	}
}