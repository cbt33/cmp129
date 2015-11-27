package my_library;

import org.junit.Test;

public class MyLibraryFacTest {
	
	MyLibrary ml = new MyLibrary();
	
	@Test
	public void facTest() {
		for (int i = 0; i < 100; i++) {
			try {
				ml.fac(i);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Failed at fac(" + i + ").");
				break;
			}
		}
	}
	
	@Test
	public void sineTest() {
		for (int i = 0; i < 100; i++) {
			try {
				ml.sine(Math.PI / 2, i);
			} catch (Exception e) {
				System.out.println("Failed at " + i + " terms.");
				break;
				// TODO: handle exception
			}
		}
	}

}
