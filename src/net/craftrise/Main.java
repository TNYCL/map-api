package net.craftrise;

import org.bukkit.plugin.java.JavaPlugin;

import net.craftrise.command.MapCommand;
import net.craftrise.sql.Connect;

public class Main extends JavaPlugin {

	private static Main instance;
	
	public void onEnable() {
		instance = this;
		registerCommand();
		Connect.connectDatabase();
		
		System.out.println("["+getDescription().getName()+"] Aktif!");
	}
	
	public void registerCommand() {
		getCommand("map").setExecutor(new MapCommand());
	}
	
	public static Main getInstance() {
		return instance;
	}
	
}
