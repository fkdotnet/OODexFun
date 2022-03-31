package com.revature;

public class Pokemon {
String DexNumber;
String name;
String type;
public Pokemon(String dexNumber, String name, String type, String dexInfo, String pokemonPower) {
	super();
	DexNumber = dexNumber;
	this.name = name;
	this.type = type;
	DexInfo = dexInfo;
	PokemonPower = pokemonPower;
}
public String getDexNumber() {
	return DexNumber;
}
public void setDexNumber(String dexNumber) {
	DexNumber = dexNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDexInfo() {
	return DexInfo;
}
public void setDexInfo(String dexInfo) {
	DexInfo = dexInfo;
}
public String getPokemonPower() {
	return PokemonPower;
}
public void setPokemonPower(String pokemonPower) {
	PokemonPower = pokemonPower;
}
String DexInfo;
String PokemonPower;
}



