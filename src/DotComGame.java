
import java.util.*;

public class DotComGame {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComLists = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComLists.add(one);
		dotComLists.add(two);
		dotComLists.add(three);
		
		System.out.println("Your goal is to sing three dot coms.");
		System.out.println("Pets.com, eToys.com and Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		//PLACE EACH DOTCOM IN A 7X7 GRID
		for (DotCom dotComToSet : dotComLists) {
			ArrayList<String> newLocation  = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}		
	}
	
	private void startPlaying(){
		while (!dotComLists.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuesses++;
		String result = "miss";
		
		for (DotCom dotComToTest : dotComLists) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("Hit")) {
				break;
			}
			if (result.equals("Kill")) {
				dotComLists.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame(){
		System.out.println("All ships are sank. It took you: " + numOfGuesses);
	}
	
	public static void main (String[] args){
		DotComGame game = new DotComGame();
		game.setUpGame();
		game.startPlaying();		
	}
	
	
	
	
	
	
}
