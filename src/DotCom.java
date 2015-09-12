import java.util.ArrayList;


public class DotCom {
	private ArrayList<String> locationCells;
	private String shipName;
	
	public void setName(String name){
		shipName = name;
	}
	
	public String getName(){
		return shipName;
	}	
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
	
	public String checkYourself(String userInput){
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0){
			locationCells.remove(index);
			
			if (locationCells.isEmpty()){
				result = "Kill";
			} else {
				result = "Hit";
			}
		}
		
		return result;
	}
}
