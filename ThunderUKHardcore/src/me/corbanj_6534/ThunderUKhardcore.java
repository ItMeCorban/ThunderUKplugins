package me.corbanj_6534;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ThunderUKhardcore extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Thunder-UK Hardcore enabled");
		new hardcore(this);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Thunder-UK Hardcore disabled");
	}		
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
         if (cmd.getName().equalsIgnoreCase("thunderukhc") && sender instanceof Player) {
	
	
	         player.sendMessage(ChatColor.GREEN + "Thunder-UK Hardcore is working!");	
		
			return true;
			
		}
		return false;
	}
}
		
		
	