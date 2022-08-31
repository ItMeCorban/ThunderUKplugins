package me.corbanj_6534;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class LocalBC extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Thunder-UK Local Broadcast Enabled!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Thunder-UK Local Broadcast Disabled!");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		

			
		 if (cmd.getName().equalsIgnoreCase("thunderukbc") && sender instanceof Player) {
			
			Player player = (Player) sender;
			String bcmessage = "";
			int length = args.length; 
			
			for (String arg : args){
				bcmessage = ChatColor.GREEN + bcmessage + arg + " ";
			}
			
			if (length >= 1) {
				String pname = "";
				if (!player.hasPermission("thunderuk.bc"))
					player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "ThunderUK " + ChatColor.AQUA + "" + ChatColor.BOLD +  "Broadcaster" + ChatColor.GOLD + "]" + ChatColor.RED + "You do not have permission to do this!");
				else
					//Bukkit.broadcastMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "ThunderUK Broadcast" + ChatColor.GOLD + "]" + ChatColor.GRAY + "From:" + ChatColor.AQUA + "" + ChatColor.BOLD + "<" + ChatColor.DARK_AQUA + player.getName() + ChatColor.AQUA + "" + ChatColor.BOLD + ">" +  ChatColor.GREEN + bcmessage);
					pname = ChatColor.RED + player.getName();
					Bukkit.broadcastMessage("╔═══════════════════════════════╗");
					Bukkit.broadcastMessage("║From" +            "                                                                ║");
					Bukkit.broadcastMessage("║ "  + pname + ChatColor.WHITE + "                                                       ║");
					Bukkit.broadcastMessage("║Broadcast " +  "                                                        ║");
					Bukkit.broadcastMessage("║" + bcmessage +  "                                                                ║");
					Bukkit.broadcastMessage("╚═══════════════════════════════╝");
					
			}
			else player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Incorrect usage, use /thunderukbc {message}");
			
			return true;
			
		}else if (cmd.getName().equalsIgnoreCase("thunderukbctest") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.DARK_GREEN + "Thunder-UK broadcaster is functioning!");		

			return true;
			
		}
		
		return false;	
		
	}
	
}