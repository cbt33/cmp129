package fraction;

public class simpleTest {

	
	public static int GCD(int num, int den) {
		num = Math.abs(num);
		den = Math.abs(den);
		int gcd = 1;
		for (int i=1; i<=num; i++) {
			if (num % i == 0 && den % i == 0)
				gcd = i;
		}
		return gcd;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(24,32));
	}

}
