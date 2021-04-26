package net.craftrise.command;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import net.craftrise.cache.Map;
import net.craftrise.data.MessageData;
import net.craftrise.sql.Data;
import net.craftrise.util.MapUtils;
import net.craftrise.util.Utils;

public class SubCommand implements MessageData {
	
	public static void createMap(Player sender, String mapName) {
		Map map = MapUtils.getMapData(mapName);
		if(MapUtils.isNotHaveMap(mapName)) {
			Utils.message(sender, MAP_CREATED.replace("%name%", mapName));
			map.setName(mapName);
			map.setWorld(sender.getWorld().getName());
			MapUtils.setMaptoDatabase(mapName, map);
		} else {
			Utils.message(sender, MAP_ALREADY_HAVE);
		}
	}
	
	public static void deleteMap(Player sender, String mapName) {
		if(!MapUtils.isNotHaveMap(mapName)) {
			Utils.message(sender, MAP_DELETED.replace("%name%", mapName));
			Data.deleteMapData(mapName);
		} else {
			Utils.message(sender, MAP_NOT_FOUND);
		}
	}
	
	public static void setTeam(Player sender, String mapName, String team) {
		Map map = MapUtils.getMapData(mapName);
		int x = (int)sender.getLocation().getX();
		int y = (int)sender.getLocation().getY();
		int z = (int)sender.getLocation().getZ();
		int yaw = (int)sender.getLocation().getYaw();
		int pitch = (int)sender.getLocation().getPitch();
		if(!MapUtils.isNotHaveMap(mapName)) {
			if(team.equalsIgnoreCase("red")) {
				Utils.setRedTeamData(map, mapName, x, y, z, yaw, pitch);
				Utils.message(sender, "&a"+mapName+MAP_RED_TEAM_LOCATION.replace("%coordinates%", String.valueOf("X:"+x+" Y:"+y+" Z:"+z)));
			} else if(team.equalsIgnoreCase("blue")) {
				Utils.setBlueTeamData(map, mapName, x, y, z, yaw, pitch);
				Utils.message(sender, "&a"+mapName+MAP_BLUE_TEAM_LOCATION.replace("%coordinates%", String.valueOf("X:"+x+" Y:"+y+" Z:"+z)));
			} else {
				Utils.message(sender, NOT_FOUND_TEAM);
			}
			MapUtils.setMaptoDatabase(mapName, map);
		} else {
			Utils.message(sender, MAP_NOT_FOUND);
		}
	}
	
	public static void setSpawn(Player sender, String mapName) {
		Map map = MapUtils.getMapData(mapName);
		int x = (int)sender.getLocation().getX();
		int y = (int)sender.getLocation().getY();
		int z = (int)sender.getLocation().getZ();
		int yaw = (int)sender.getLocation().getYaw();
		int pitch = (int)sender.getLocation().getPitch();
		if(!MapUtils.isNotHaveMap(mapName)) {
			Utils.setSpawnData(map, mapName, x, y, z, yaw, pitch);
			Utils.message(sender, "&a"+mapName+MAP_SPAWN_LOCATION.replace("%coordinates%", String.valueOf("X:"+x+" Y:"+y+" Z:"+z)));
		} else {
			Utils.message(sender, MAP_NOT_FOUND);
		}
	}
	
	public static void mapList(Player sender) {
		ArrayList<String> maps = Data.getAllMaps();
		if(maps.size()>0) {
			Utils.message(sender, MAP_LIST);
			sender.sendMessage("");
			for(int i=0;i<maps.size();i++) {
				Map map = MapUtils.getMapData(maps.get(i));
				if(MapUtils.isDataHave(map)) {
					Utils.message(sender, " &6"+maps.get(i)+" &f- &cHatalý kurulum");
				} else {
					Utils.message(sender, " &6"+maps.get(i)+" &f- &aAktif");
				}
			}
			sender.sendMessage("");
			Utils.message(sender, MAP_LIST);
		} else {
			Utils.message(sender, NOT_FOUND_MAPS);
		}
	}
	
	public static void mapData(Player sender, String mapName) {
		Map map = MapUtils.getMapData(mapName);
		if(!MapUtils.isNotHaveMap(mapName)) {
			Utils.getMapDetails(map, sender, mapName);
		} else {
			Utils.message(sender, MAP_NOT_FOUND);
		}
	}

}
