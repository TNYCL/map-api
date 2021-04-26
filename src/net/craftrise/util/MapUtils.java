package net.craftrise.util;

import com.google.gson.Gson;

import net.craftrise.cache.Map;
import net.craftrise.sql.Data;

public class MapUtils {
	
	public static Map getMaptoDatabase(String name) {
		Gson gson = new Gson();
		String data = Data.getMapData(name);
		if(data==null) {
			data = "{}";
		}
		return gson.fromJson(data, Map.class);
	}
	
	public static void setMaptoDatabase(String name, Map map) {
		Gson gson = new Gson();
		String jsonobject = gson.toJson(map, Map.class);
		Data.setMapData(name, jsonobject);
	}
	
	public static Map getMapData(String name) {
		Map map = getMaptoDatabase(name);
		return map;
	}
	
	public static boolean isNotHaveMap(String name) {
		if(Data.getMapNameData(name)==null) {
			return true;
		}
		return false;
	}
	
	public static boolean isDataHave(Map map) {
		if(map.getName() != null && map.getTeamRed().size()==0 && map.getTeamBlue().size()==0 && map.getSpawn().size()==0 && map.getWorld() != null) {
			return true;
		}
		return false;
	}

}
