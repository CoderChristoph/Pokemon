package com.oop.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemon = new ArrayList<Pokemon>();
	
	public ArrayList<Pokemon> addtoList(Pokemon pokemon) {
		Pokemon curPoke = createPokemon(pokemon.getName(), pokemon.getHealth(), pokemon.getType());
		myPokemon.add(curPoke);
		return myPokemon;
	}
	
	public void listPokemon() {
		for (int i = 0; i < myPokemon.size(); i++) {
			String newStr = "";
			Pokemon test = myPokemon.get(i);
			newStr += "Name: " + test.getName() + " Health: " + test.getHealth() + " Type: " + test.getType();
			System.out.println(newStr + '\n');
			newStr = "";
		}
	}
}

