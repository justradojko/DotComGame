
import java.util.ArrayList;

public class DotComGame {
	public static void main(String[] args){
		int numberOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom dot = new SimpleDotCom();
		
		int randomNum = (int) (Math.random() * 5);
		
		ArrayList<String> locations = new ArrayList<String>();
		
		locations.add(Integer.toString(randomNum));
		locations.add(Integer.toString(randomNum+1));
		locations.add(Integer.toString(randomNum+2));
		
		dot.setLocationCells(locations);
		
		boolean gameActive = true;
		
		while ( gameActive == true){
			String guess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(guess);
			
			numberOfGuesses++;
			System.out.println(result);
			if (result.equals("kill")){
				gameActive = false;
				System.out.println("You took " + numberOfGuesses + " guesses");
			}
		}		
	}
}
