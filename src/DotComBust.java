import java.util.ArrayList;

import sun.tools.tree.VarDeclarationStatement;


public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses;
	
	public void setUpGame(){
		DotCom dotCom1 = new DotCom();
		dotCom1.setName("Go2.com");
		
		DotCom dotCom2 = new DotCom();
		dotCom1.setName("Pets.com");
		
		DotCom dotCom3 = new DotCom();
		dotCom1.setName("AskMe.com");
		
		dotComsList.add(dotCom1);
		dotComsList.add(dotCom2);
		dotComsList.add(dotCom3);
		
		for (DotCom dotComTemp : dotComsList){
			String newLocation = helper.placeDotCom();
			dotComTemp.setLocationCells(newLocation);
		}
	}
	
	public void startPlaying(){
		
	}
	
	public boolean checkUserGuess(){
		return true;
	}
	
	public void finishGame(){
		
	}
	
}
