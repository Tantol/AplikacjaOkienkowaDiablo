
public class User {

	public String champion;
	
	public User(){
		this.champion = "Not Chosen";
	}
	
	////
	//Set
	///
	public void setChampion(String name){this.champion=name;}
	////
	//Get
	////
	public String getChampion(){return this.champion;}
}
