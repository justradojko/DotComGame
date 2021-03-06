import java.io.*;
import java.util.*;

public class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;
	
	// GRABS USER INPUT FROM COMMAND LINE
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.print(prompt + " ");
		try{
			BufferedReader is = new BufferedReader( new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e){
			System.out.println("IOException: " + e);
		}
		return inputLine.toLowerCase();
	}
	
	// PLACE DOTCOM SHIP ON A GRID 7X7 
	public ArrayList<String> placeDotCom(int comSize){
		ArrayList<String> alphaCells= new ArrayList<String>();		
		String[] aplhacoords = new String[comSize];
		String temp = null;
		int[] coords = new int[comSize];
		int attempts = 0;
		boolean success = false;
		int location = 0;
		
		comCount++;
		int incr = 1;
		if ((comCount % 2) == 1) {
			incr = gridLength;
		}
		
		while (!success && attempts++ < 200) {
			location = (int) (Math.random() * gridSize);
			
			int x = 0;
			success = true;
			
			while (success && x < comSize) {
				if (grid[location] == 0) {
					coords[x++] = location;
					location += incr;
					
					if (location >= gridSize) {
						success = false;						
					}
					if (x>0 && (location % gridLength == 0)) {
						success = false;						
					}
				} else {
					success = false;
				}
			}
		}
		
		int x = 0;
		int row = 0;
		int column = 0;
		
		while ( x < comSize ) {
			grid[coords[x]] = 1;
			row = (int)(coords[x]/gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));
			
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
		}
		
		return alphaCells;
	}
	
	public void printDotComPosition(ArrayList<String> position) {
		for (int i = 0; i < position.size(); i++) {
			System.out.println(position.get(i));			
		}
	}
}
