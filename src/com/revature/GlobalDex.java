package com.revature;

import java.util.ArrayList;

public class GlobalDex {
	
	
	
public String readDex(ArrayList <Pokemon> Pokedex, String dexID) {
		String entry = null;
		for(Pokemon mon : Pokedex) {
			if ( mon.getDexNumber().equals(dexID))
			{
				entry = "\n" +  mon.getName() + "\nPokemon # " + mon.getDexNumber() + "\n" +  "\nPokemon Type: " + mon.getType() + "\nPokemon Power:" + mon.getPokemonPower() + "\nPokedex Information: \n" + mon.getDexInfo();
				
			}
		}
			return entry;
		
	}

public GlobalDex(ArrayList <Pokemon> Pokedex, String dexID) {
	// TODO Auto-generated constructor stub
}
	}

