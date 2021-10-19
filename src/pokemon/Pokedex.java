package pokemon;


public class Pokedex extends AbstractPokemon {
	
	public void listPokemon() {
		for(Pokemon pokemon: myPokemons) {
			System.out.format("Pokemon %s\n", pokemon.getName());
		}
	}

}
