package pokemon;
import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {
	
	ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon> ();
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name,health,type);
		myPokemons.add(pokemon);
		return pokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		
		return String.format("Pokemon %s.\nHealth: %d\nType:%s", pokemon.getName(), pokemon.getHealth(),
				pokemon.getType());
		
	}
	
	
}
