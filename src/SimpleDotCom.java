
public class SimpleDotCom {
	int[] locationCells;
	int numOfHits;
	
	public String checkYourself(String guess){
		for (int cell:locationCells){
			if (Integer.parseInt(guess) == cell){
				numOfHits++;
				
				if (numOfHits == 3){				
					return "kill";
				} else {
					return "hit";
				}				
			}
		}
		return "miss";
	}
	
	public void setLocationCells (int[] loc){
		locationCells = loc;
	}
}
