package pokemon;

public class PokemonTest {
	public static void main(String args[]) {
		
		Pokedex test= new Pokedex();
		Pokemon charm = test.createPokemon("Charmander", 100, "Fire");
		Pokemon bulbasaur = test.createPokemon("Bulbasaur", 95, "Earth");
		Pokemon squirtle = test.createPokemon("Squirtle", 85, "Water");
		Pokemon butterfree = test.createPokemon("Butterfree", 55, "Wind");
		test.listPokemon();
		System.out.println(test.pokemonInfo(bulbasaur));
		charm.attackPokemon(bulbasaur);
		System.out.println(test.pokemonInfo(bulbasaur));
		
		
	}
	
}
