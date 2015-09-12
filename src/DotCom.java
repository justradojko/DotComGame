
import java.util.ArrayList;

public class DotCom {
	private String name;
	private ArrayList<String> locationCells;
	
	public String checkYourself(String guess){		
//		int index = locationCells.indexOf(guess); 
//		System.out.println("Index: " + index);
//		if (index >= 0){
//			locationCells.remove(index);			
//			if (locationCells.isEmpty()){
//				return "kill";
//			} else {
//				return "hit";
//			}
//		}
		return "miss";
	}

	public void setLocationCells (ArrayList<String> loc){
		locationCells = loc;
	}
	
	public void setName (String inputName){
		name = inputName;
	}
	
	public String getNameString (){
		return name;
	}
}
