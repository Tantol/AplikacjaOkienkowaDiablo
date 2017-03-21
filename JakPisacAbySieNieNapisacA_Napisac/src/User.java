
public class User {

	public Champion champ;
	
	public User(){
		champ=null;
	}
	
	////
	//Set
	///
	public void setChampion(Champion champ){this.champ=champ;}
	////
	//Get
	////
	public Champion getChampion(){return this.champ;}
}
