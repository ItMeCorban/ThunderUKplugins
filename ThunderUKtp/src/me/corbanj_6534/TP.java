package me.corbanj_6534;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TP extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Thunder-UK Local Broadcast Enabled!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Thunder-UK Local Broadcast Disabled!");
		
	}
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		int length = args.length;
		
		 if (cmd.getName().equalsIgnoreCase("ttp") && sender instanceof Player) {
			
			if (!player.hasPermission("thunderuk.tp.player"))
					player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.RED + "You do not have permission to do this!");
			else {
			
				if (args.length == 0){
					player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD +  "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.RED + "Incorrect usage! use /ttp {player}");
			}	else if (length == 1) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					Location targetLocation = targetPlayer.getLocation();
					player.teleport(targetLocation);
					player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD +  "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.GOLD +  "You have been teleported to "+ targetPlayer.getName() + ChatColor.GOLD + "!");
					targetPlayer.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.GOLD +  player.getName() + " teleported to you!");
			}
				else if (args.length == 2) {
					Player tpTo = player.getServer().getPlayer(args[1]);
					Player tpFrom = player.getServer().getPlayer(args[0]);
					Location teleportTo = tpTo.getLocation();
					tpFrom.teleport(teleportTo);
					tpFrom.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.GOLD +  "You have been teleported to " + tpTo.getName() + ChatColor.GOLD + "!");
					tpTo.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD +  "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.GOLD + tpFrom.getName() + " Has been teleported to you!");
				}
		}
			return true;
}					
		 if (cmd.getName().equalsIgnoreCase("ttploc") && sender instanceof Player) {
				
			if (!player.hasPermission("thunderuk.tp.findlocation"))
					player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.RED + "You do not have permission to do this!");
			else {
			
				if (args.length == 0){
					player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD +  "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.RED + "Incorrect usage! use /ttploc {player}");
			}	else if (length == 1) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					Location playerLoc = targetPlayer.getLocation();
					player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD +  "ThunderUK" + ChatColor.RED + "" + ChatColor.BOLD + " Teleports" + ChatColor.GOLD + "]" + ChatColor.GOLD +  targetPlayer.getName() + " is at " + playerLoc + ChatColor.GOLD + "!");
			}
		}
			return true;
			
		 } else if (cmd.getName().equalsIgnoreCase("thunderuktptest") && sender instanceof Player) {
			
			
			player.sendMessage(ChatColor.DARK_GREEN + "Thunder-UK teleporter is functioning!");		

			return true;
			
		}
		
		return false;	
		
	}
	
} 