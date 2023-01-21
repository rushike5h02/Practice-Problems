import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
	
	
	private static void generateUsingRandom() {
	      Random random = new Random();
	      //print a random int within range of 0 to 10.
	      System.out.println(random.nextInt(10));

	      //print a random int
	      System.out.println(random.nextInt());

	      //print a random double
	      System.out.println(random.nextDouble());
	   }

	   private static void generateUsingMathRandom() {
	      //print a random double
	      System.out.println(Math.random());
	   }

	   private static void generateUsingThreadLocalRandom() {
	      //print a random int within range of 0 to 10.
	      System.out.println(ThreadLocalRandom.current().nextInt(10));

	      //print a random int
	      System.out.println(ThreadLocalRandom.current().nextInt());

	      //print a random double
	      System.out.println(ThreadLocalRandom.current().nextDouble());

	   }

	   public static void main(String[] args) {

		      generateUsingRandom();
		      generateUsingMathRandom();
		      generateUsingThreadLocalRandom();
		   }
	   
}
