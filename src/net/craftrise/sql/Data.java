package net.craftrise.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Data {
	
	public static String getMapData(String name) {
		String data = null;
		try {
			String sql = "SELECT * FROM maps WHERE name='"+name+"'";
			ResultSet rs = Connect.stat.executeQuery(sql);
			while(rs.next()) {
				data = rs.getString("data");
			}
			if(data == null) {
				return null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public static String getMapNameData(String name) {
		String mapname = null;
		try {
			String sql = "SELECT * FROM maps WHERE name='"+name+"'";
			ResultSet rs = Connect.stat.executeQuery(sql);
			while(rs.next()) {
				mapname = rs.getString("name");
			}
			if(mapname == null) {
				return null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return mapname;
	}
	
	public static ArrayList<String> getAllMaps() {
		ArrayList<String> maps = new ArrayList<>();
		try {
			String sql = "SELECT * FROM maps";
			ResultSet rs = Connect.stat.executeQuery(sql);
			while(rs.next()) {
				maps.add(rs.getString("name"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return maps;
	}
	
	public static void deleteMapData(String name) {
		try {
			if(getMapData(name) != null) {
				String sql = "DELETE FROM maps WHERE name='"+name+"'";
				Connect.stat.executeUpdate(sql);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void setMapData(String name, String data) {
		try {
			if(getMapData(name) == null) {
				String sql = "INSERT INTO maps (name, data) VALUES ('"+name+"','"+data+"')";
				Connect.stat.executeUpdate(sql);
			} else {
				String sql = "UPDATE maps set data='"+data+"' WHERE name='"+name+"'";
				Connect.stat.executeUpdate(sql);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
