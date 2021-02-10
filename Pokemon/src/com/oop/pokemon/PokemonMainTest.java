package com.oop.pokemon;

public class PokemonMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon pikachu = new Pokemon("Pikachu", 100, "Lightning");
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 100, "Grass");
		Pokemon charmander = new Pokemon("Charmander", 100, "Fire");
		Pokemon squirtle = new Pokemon("Squirtle", 100, "Water");	
		Pokedex newPokedex = new Pokedex();
		
		System.out.println(newPokedex.pokemonInfo(bulbasaur));
		
		newPokedex.addtoList(pikachu);
		newPokedex.addtoList(bulbasaur);
		newPokedex.addtoList(charmander);
		newPokedex.addtoList(squirtle);
		newPokedex.listPokemon();
	}

}
