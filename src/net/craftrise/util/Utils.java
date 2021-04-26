package net.craftrise.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import net.craftrise.cache.Map;
import net.craftrise.data.MessageData;

public class Utils implements MessageData {

	public static String color(String msg) {
		String message = ChatColor.translateAlternateColorCodes('&', msg);
		return message;
	}
	
	public static void message(Player sender, String msg) {
		sender.sendMessage(color(msg));
	}
	
	public static void setRedTeamData(Map map, String mapName, int x, int y, int z, int yaw, int pitch) {
		map.setTeamRed("x", x);
		map.setTeamRed("y", y);
		map.setTeamRed("z", z);
		map.setTeamRed("yaw", yaw);
		map.setTeamRed("pitch", pitch);
		MapUtils.setMaptoDatabase(mapName, map);
	}
	
	public static void setBlueTeamData(Map map, String mapName, int x, int y, int z, int yaw, int pitch) {
		map.setTeamBlue("x", x);
		map.setTeamBlue("y", y);
		map.setTeamBlue("z", z);
		map.setTeamBlue("yaw", yaw);
		map.setTeamBlue("pitch", pitch);
		MapUtils.setMaptoDatabase(mapName, map);
	}
	
	public static void setSpawnData(Map map, String mapName, int x, int y, int z, int yaw, int pitch) {
		map.setSpawn("x", x);
		map.setSpawn("y", y);
		map.setSpawn("z", z);
		map.setSpawn("yaw", yaw);
		map.setSpawn("pitch", pitch);
		MapUtils.setMaptoDatabase(mapName, map);
	}
	
	public static void getMapDetails(Map map, Player sender, String mapName) {
		Utils.message(sender, MAP_DETAILS.replace("%name%", map.getName()));
		sender.sendMessage("");
		Utils.message(sender, "  &6Dünya ismi: &a"+map.getWorld());
		Utils.message(sender, "  &6Spawn noktasý: &aX:"+map.getSpawn().get("x")+" Y:"+map.getSpawn().get("y")+" Z:"+map.getSpawn().get("z"));
		Utils.message(sender, "  &6Mavi takým spawn noktasý: &aX:"+map.getTeamBlue().get("x")+" Y:"+map.getTeamBlue().get("y")+" Z:"+map.getTeamBlue().get("z"));
		Utils.message(sender, "  &6Kýrmýzý takým spawn noktasý: &aX:"+map.getTeamRed().get("x")+" Y:"+map.getTeamRed().get("y")+" Z:"+map.getTeamRed().get("z"));
		sender.sendMessage("");
		Utils.message(sender, MAP_DETAILS.replace("%name%", map.getName()));
	}
	
}
