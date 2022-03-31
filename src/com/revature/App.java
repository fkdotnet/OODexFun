package com.revature;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		ArrayList <Pokemon> Pokedex = new ArrayList<>();
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter The Pokemon's Global Dex Number");
		String choice = Scan.nextLine();
		Pokemon Bulbasaur = new Pokemon("1", "Bulbasaur", "Grass", "A strange seed was planted on its back at birth.\n The plant sprouts and grows with this Pokémon. ", "Overgrow");
		Pokemon Charmander = new Pokemon("4", "Charmanderr", "Fire", "The fire on the tip of its tail is a measure of its life. If the Pokémon is healthy, its tail burns intensely. ", "Blaze");
		Pokemon Pikachu = new Pokemon("25", "Pikachu", "Electric", "Possesses cheek sacs in which it stores electricity.\nThis clever forest-dweller roasts tough berries with an electric shock before consuming them.", "Static");
		Pokedex.add(Pikachu);
		Pokedex.add(Bulbasaur);
		Pokedex.add(Charmander);
		GlobalDex Global = new GlobalDex(Pokedex, choice);
		Scan.close();
		System.out.println(Global.readDex(Pokedex, choice));
	}}



