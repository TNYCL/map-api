package net.craftrise.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.craftrise.data.MessageData;

public class MapCommand implements CommandExecutor, MessageData {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(args.length == 0) {
				player.sendMessage(COMMAND_INFO);
			} else if(args[0].equalsIgnoreCase("create")) {
				if(args.length != 1) {
					String mapName = args[1];
					SubCommand.createMap(player, mapName);
				} else {
					player.sendMessage(COMMAND_INFO);
				}
			} else if(args[0].equalsIgnoreCase("delete")) {
				if(args.length != 1) {
					String mapName = args[1];
					SubCommand.deleteMap(player, mapName);
				} else {
					player.sendMessage(COMMAND_INFO);
				}
			} else if(args[0].equalsIgnoreCase("setteam")) {
				if(args.length != 2) {
					String team = args[2];
					String mapName = args[1];
					SubCommand.setTeam(player, mapName, team);
				} else {
					player.sendMessage(COMMAND_INFO);
				}
			} else if(args[0].equalsIgnoreCase("setspawn")) {
				if(args.length != 1) {
					String mapName = args[1];
					SubCommand.setSpawn(player, mapName);
				} else {
					player.sendMessage(COMMAND_INFO);
				}
			} else if(args[0].equalsIgnoreCase("list")) {
				SubCommand.mapList(player);
			} else if(args[0].equalsIgnoreCase("info")) {
				if(args.length != 1) {
					String mapName = args[1];
					SubCommand.mapData(player, mapName);
				} else {
					player.sendMessage(COMMAND_INFO);
				}
			} else {
				player.sendMessage(COMMAND_INFO);
			}
		}
		return false;
	}

}
