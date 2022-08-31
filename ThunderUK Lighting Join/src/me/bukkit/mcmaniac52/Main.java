package me.bukkit.mcmaniac52;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.material.Command;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
		
	public void onEnable(){
		new PlayerListener(this);
		getLogger().info("Thunder-UK Lightning join has been enabled");
	}
	@Override
	public void onDisable(){
		getLogger().info("Thunder-UK Lightning join has been disabled");	
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(((CommandSender) cmd).getName().equalsIgnoreCase("thukljtest") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "[Thunder-UK]" + ChatColor.YELLOW + "Lightning Join is working!");
			
		}
		
		return false;
		
	}
	
}
