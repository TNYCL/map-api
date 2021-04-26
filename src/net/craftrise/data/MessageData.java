package net.craftrise.data;

import net.craftrise.util.Utils;

public interface MessageData {
	
	String[] COMMAND_INFO = {
		Utils.color("&e&l           ------ &6&lHarita Kurulum &e&l------"),
		"",
		Utils.color(" &6/map create <harita> &f- &eYeni harita oluþturur."),
		Utils.color(" &6/map setspawn <harita> &f- &eHaritanýn spawn noktasýný belirler."),
		Utils.color(" &6/map setteam <harita> <takým> &f- &eTakýmlarýn spawn noktasýný belirler."),
		Utils.color(" &6/map delete <harita> &f- &eOluþturulan haritayý siler."),
		Utils.color(" &6/map info <harita> &f- &eHarita hakkýnda bilgi verir."),
		Utils.color(" &6/map list &f- &eOluþturulan haritalarý listeler."),
		"",
		Utils.color("&e&l           ------ &6&lHarita Kurulum &e&l------")
	};
	String MAP_ALREADY_HAVE = "&cBöyle bir harita zaten var!";
	String MAP_CREATED = "&a%name% &eadlý harita baþarýyla oluþturuldu!";
	String MAP_DELETED = "&a%name% &eadlý harita baþarýyla silindi!";
	String MAP_NOT_FOUND = "&cHarita bulunamadý.";
	String NOT_FOUND_TEAM = "&cBöyle bir takým bulunamadý!";
	String MAP_LIST = "&e&l           ------ &6&lHaritalar &e&l------";
	String NOT_FOUND_MAPS = "&cKurulu harita bulunamadý!";
	String MAP_BLUE_TEAM_LOCATION = " &eharitasý için mavi takýmýn spawn alaný baþarýyla belirlendi. &a%coordinates%";
	String MAP_RED_TEAM_LOCATION = " &eharitasý için kýrmýzý takýmýn spawn alaný baþarýyla belirlendi. &a%coordinates%";
	String MAP_SPAWN_LOCATION = " &eharitasý için spawn alaný baþarýyla belirlendi. &a%coordinates%";
	String MAP_DETAILS = "&e&l           ------ &6&l%name% &e&l------";
	
}
