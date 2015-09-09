
import java.util.ArrayList;

public class SimpleDotCom {
	private ArrayList<String> locationCells = new ArrayList<String>();
	
	public String checkYourself(String guess){		
		int index = locationCells.indexOf(guess); 
		System.out.println("Index: " + index);
		if (index >= 0){
			locationCells.remove(index);			
			if (locationCells.isEmpty()){
				return "kill";
			} else {
				return "hit";				
			}
		}
		return "miss";
	}
	
	public void setLocationCells (ArrayList<String> loc){
		locationCells = loc;
	}
}
