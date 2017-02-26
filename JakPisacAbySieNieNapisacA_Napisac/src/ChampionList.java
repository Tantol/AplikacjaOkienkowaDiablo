
public class ChampionList {
	public Champion Amazon = new Champion("Amazon");
	public Champion Assasin = new Champion("Assasin");
	public Champion Barbarian = new Champion("Barbarian");
	public Champion Druid = new Champion("Druid");
	public Champion Necromancer = new Champion("Necromancer");
	public Champion Paladin = new Champion("Paladin");
	public Champion Sorceress = new Champion("Sorceress");
	
	public ChampionList(){
		Amazon.baseStats.setAdditionalInfo("Moves 10% faster than other classes");
		Amazon.baseStats.setStrength(25);
		Amazon.baseStats.setDexterity(25);
		Amazon.baseStats.setVitality(20);
		Amazon.baseStats.setEnergy(15);
		Amazon.baseStats.setLife(70);
		Amazon.baseStats.setMana(15);
		Amazon.baseStats.setLifePerLevel(25);
		Amazon.baseStats.setManaPerLevel(15);
		Amazon.baseStats.setLifePerPointIntoVitality(2);
		Amazon.baseStats.setManaPerPointIntoEnergy(4.5);
	}
}
