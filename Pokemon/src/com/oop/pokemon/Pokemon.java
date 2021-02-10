package com.oop.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int hp) {
		this.health = hp;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		System.out.println(this.name + " attacked " + pokemon.name + " for 10 damage");
	}
}