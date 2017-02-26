
public class BaseStats {
	//////
	///This is strict class about base stats of any champ.
	//////
	public String additionalInfo;
	public double strength, dexterity, vitality, energy;
	public double life, mana;
	public double lifePerLevel, manaPerLevel;
	public double lifePerPointIntoVitality;
	public double manaPerPointIntoEnergy;
	//////
	///Constructor without arguments
	//////
	public BaseStats(){
		this.additionalInfo="";
		this.strength=0;
		this.dexterity=0;
		this.vitality=0;
		this.energy=0;
		this.life=0;
		this.mana=0;
		this.lifePerLevel=0;
		this.manaPerLevel=0;
		this.lifePerPointIntoVitality=0;
		this.manaPerPointIntoEnergy=0;}
	//////
	///Constructor with arguments
	//////
	public BaseStats(String info, double str, double dex, double vit, double ener, double lif, double man, double lpl, double mpl, double lppiv, double mppie){
		this.additionalInfo=info;
		this.strength=str;
		this.dexterity=dex;
		this.vitality=vit;
		this.energy=ener;
		this.life=lif;
		this.mana=man;
		this.lifePerLevel=lpl;
		this.manaPerLevel=mpl;
		this.lifePerPointIntoVitality=lppiv;
		this.manaPerPointIntoEnergy=mppie;}
	//////
	///Set
	//////
	public void setAdditionalInfo(String setInfo){this.additionalInfo=setInfo;}
	public void setStrength(double setStr){this.strength=setStr;}
	public void setDexterity(double setDex){this.dexterity=setDex;}
	public void setVitality(double setVit){this.vitality=setVit;}
	public void setEnergy(double setEner){this.energy=setEner;}
	public void setLife(double setLif){this.life=setLif;}
	public void setMana(double setMan){this.mana=setMan;}
	public void setLifePerLevel(double setLpl){this.life=setLpl;}
	public void setManaPerLevel(double setMpl){this.manaPerLevel=setMpl;}
	public void setLifePerPointIntoVitality(double setLppiv){this.lifePerPointIntoVitality=setLppiv;}
	public void setManaPerPointIntoEnergy(double setMppie){this.manaPerPointIntoEnergy=setMppie;}
	//////
	///Get
	//////
	public String getAdditionalInfo(){return additionalInfo;}
	public double getStrength(){return strength;}
	public double getDexterity(){return dexterity;}
	public double getVitality(){return vitality;}
	public double getEnergy(){return energy;}
	public double getLife(){return life;}
	public double getMana(){return mana;}
	public double getLifePerLevel(){return life;}
	public double getManaPerLevel(){return manaPerLevel;}
	public double getLifePerPointIntoVitality(){return lifePerPointIntoVitality;}
	public double getManaPerPointIntoEnergy(){return manaPerPointIntoEnergy;}

}
