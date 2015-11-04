
public class Random_Letter {

	public static void main(String[] args) {
		
		// "A" is 65
		int startingValue =65;
		// "Z" is 90 and we want to cover the range, so we added 
		//1 more to ensure we would cover a through z
		int endingValue = 90-startingValue+1;
		
		/*a + Math.random()*b gives us random number between a and a+b excluding a+b
		 * 
		 */
		int randomNumber;
		randomNumber = (int)(startingValue + Math.random()*endingValue);
		System.out.println(randomNumber);
		
		char letter = (char)randomNumber;
		System.out.println(letter);
	}

}
