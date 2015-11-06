
public class Random_Letter {

	public static void main(String[] args) {
		System.out.println("First function call");
		int randomNumber = generateRandomChar();
		System.out.println("Second function call");
		generateRandomChar();
		
		//display random letter
		char letter = (char)randomNumber;
		System.out.println(letter);
	}
	public static int generateRandomChar(){
		// "A" is 65
		int startingValue =65;
		// "Z" is 90 and we want to cover the range, so we added 
		//1 more to ensure we would cover a through z
		int endingValue = 90-startingValue+1;
		
		/*a + Math.random()*b gives us random number between a and a+b excluding a+b
		 * 
		 */
		int randomNumber;/* Make a new make a new variable and then
		 fill it with a random number that is between our starting value 
		 and end value. then print it out. 
		*/
		randomNumber = (int)(startingValue + Math.random()*endingValue);
		System.out.println(randomNumber); //debugging statement
		System.out.println((char)randomNumber);
		return randomNumber;
	}
}
