package net.craftrise.cache;

import java.util.HashMap;

public class Map {
	
	private String name;
	private HashMap<String, Integer> teamred = new HashMap<>(); 
	private HashMap<String, Integer> teamblue = new HashMap<>(); 
	private HashMap<String, Integer> spawn = new HashMap<>();
	private String world;
	
	public String getName() {
		return this.name;
	}
	
	public int getTeamRedData(String data) {
		return getTeamRed().get(data);
	}
	
	public int getTeamBlueData(String data) {
		return getTeamBlue().get(data);
	}
	
	public int getSpawnData(String data) {
		return getSpawn().get(data);
	}
	
	public HashMap<String, Integer> getTeamRed() {
		return this.teamred;
	}
	
	public HashMap<String, Integer> getTeamBlue() {
		return this.teamblue;
	}
	
	public HashMap<String, Integer> getSpawn() {
		return this.spawn;
	}
	
	public String getWorld() {
		return this.world;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTeamRed(String value, int deger) {
		this.teamred.put(value, deger);
	}
	
	public void setTeamBlue(String value, int deger) {
		this.teamblue.put(value, deger);
	}
	
	public void setSpawn(String value, int deger) {
		this.spawn.put(value, deger);
	}
	
	public void setWorld(String world) {
		this.world = world;
	}
	
}
