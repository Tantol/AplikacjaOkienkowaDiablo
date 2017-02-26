
public class Champion {
	public BaseStats baseStats;
	public String name;
	
	public Champion(){
		this.baseStats = new BaseStats();
		this.name="";
	}
	public Champion(String nam){
		this.baseStats= new BaseStats();
		this.name=nam;
	}
	
	public void setName(String setNam){this.name=setNam;}
	
	public String getName(){return name;}

}
