package pokemon;

public class Pokemon{
	private static int count =0;
	private String name;
	private int health;
	private String type;
	
	Pokemon(String name, int health, String type){
		this.name = name;
		this.health = health;
		this.type= type;
		count +=1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	void attackPokemon(Pokemon pokemon) {
		pokemon.health -=10;
	}
	
}
