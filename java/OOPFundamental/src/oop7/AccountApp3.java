package oop7;

public class AccountApp3 {

	public static void main(String[] args) {
		Account acc[] = new Account[2];
		Saving sObj = new Saving();
		Current cObj = new Current();
		
		//acc[0] =sObj;
		//acc[1] =sObj;
		
		for(int i=0; i<acc.length; i++){
			double ran = Math.random();// random value between 0 to 1
			if(ran>0.5){
				acc[i] =sObj;
			}
			else{
				acc[i] = cObj;
			}
		}
		for(Account a : acc){
			a.displayAccountInfo();
		}

	}

}
