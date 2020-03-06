package lab4.exercise22;

public class Current extends Account {
	private double overDraftLimit = -1000;
	
	boolean withDraw(){
		if(overDraftLimit == 10){
			return true;
		}
		else{
			return false;
		}
	}
}
