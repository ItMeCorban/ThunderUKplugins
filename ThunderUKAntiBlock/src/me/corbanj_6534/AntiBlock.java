package me.corbanj_6534;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiBlock extends JavaPlugin {

	@Override
	public void onEnable() {
		new BlockListener(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("thunderukblocktest") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + ", the AntiBlock plugin works");
			
			return true;
			
		} else if (cmd.getName().equalsIgnoreCase("thunderukbcblocktest") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "The AntiBlock plugin is functioning correctly, message from: " + player.getName());
			
			return true;
			
		}
		
		return false;	
		
	}
	
}