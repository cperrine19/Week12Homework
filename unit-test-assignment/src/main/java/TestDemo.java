import java.util.Random;

public class TestDemo {
	private Random random = new Random();
	
	 public int addPositive(int a, int b) {
		    if (a < 0 || b < 0) {
		      throw new IllegalArgumentException("Both parameters must be positive!");
		    }

		    return a + b;
		  }
	 public int randomNumberSquared() { //This method obtains a random int between 1 and 10 and then returns the square of the number.
		 int a = generateRandomInt();
		 return (a*a);
	 }
	
	int generateRandomInt() {
		return random.nextInt(10) + 1;
	}

	
}
