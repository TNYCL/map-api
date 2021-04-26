package net.craftrise.data;

import net.craftrise.util.Utils;

public interface MessageData {
	
	String[] COMMAND_INFO = {
		Utils.color("&e&l           ------ &6&lHarita Kurulum &e&l------"),
		"",
		Utils.color(" &6/map create <harita> &f- &eYeni harita olu�turur."),
		Utils.color(" &6/map setspawn <harita> &f- &eHaritan�n spawn noktas�n� belirler."),
		Utils.color(" &6/map setteam <harita> <tak�m> &f- &eTak�mlar�n spawn noktas�n� belirler."),
		Utils.color(" &6/map delete <harita> &f- &eOlu�turulan haritay� siler."),
		Utils.color(" &6/map info <harita> &f- &eHarita hakk�nda bilgi verir."),
		Utils.color(" &6/map list &f- &eOlu�turulan haritalar� listeler."),
		"",
		Utils.color("&e&l           ------ &6&lHarita Kurulum &e&l------")
	};
	String MAP_ALREADY_HAVE = "&cB�yle bir harita zaten var!";
	String MAP_CREATED = "&a%name% &eadl� harita ba�ar�yla olu�turuldu!";
	String MAP_DELETED = "&a%name% &eadl� harita ba�ar�yla silindi!";
	String MAP_NOT_FOUND = "&cHarita bulunamad�.";
	String NOT_FOUND_TEAM = "&cB�yle bir tak�m bulunamad�!";
	String MAP_LIST = "&e&l           ------ &6&lHaritalar &e&l------";
	String NOT_FOUND_MAPS = "&cKurulu harita bulunamad�!";
	String MAP_BLUE_TEAM_LOCATION = " &eharitas� i�in mavi tak�m�n spawn alan� ba�ar�yla belirlendi. &a%coordinates%";
	String MAP_RED_TEAM_LOCATION = " &eharitas� i�in k�rm�z� tak�m�n spawn alan� ba�ar�yla belirlendi. &a%coordinates%";
	String MAP_SPAWN_LOCATION = " &eharitas� i�in spawn alan� ba�ar�yla belirlendi. &a%coordinates%";
	String MAP_DETAILS = "&e&l           ------ &6&l%name% &e&l------";
	
}
