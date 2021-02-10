package com.oop.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon npoke = new Pokemon(name, health, type);
		return npoke;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		String returnString = "Pokemon's name: " + pokemon.getName() + " Pokemon's health: " + pokemon.getHealth() + 
		" Pokemon's type: " + pokemon.getType();
		return returnString;
	}
}
