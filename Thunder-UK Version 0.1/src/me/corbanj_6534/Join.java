package me.corbanj_6534;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
	

	public Join(V01 plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	


	@EventHandler
	public void onJoin(PlayerJoinEvent j) {
		
		Player player = j.getPlayer();
		

		
		
		if (player.hasPermission("thunderuk.corban")) {
			j.setJoinMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "[" + ChatColor.AQUA + Bukkit.getOnlinePlayers().size() + ChatColor.GOLD +  "]" + ChatColor.BLUE + ChatColor.BOLD + ChatColor.UNDERLINE + "WOOOO CORBAN'S HERE EVERYONE PARTYYYYY!");	
		}
		else if (player.hasPlayedBefore() == false) {
			j.setJoinMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "[" + ChatColor.AQUA + Bukkit.getOnlinePlayers().size() + ChatColor.GOLD + "]" + ChatColor.BOLD + "EVERYONE welcome " + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + player.getName() + ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.YELLOW + "" + ChatColor.BOLD + " Thunder-UK");
		}
		else {
	       j.setJoinMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "[" + ChatColor.AQUA + Bukkit.getOnlinePlayers().size() + ChatColor.GOLD +  "]" + ChatColor.BOLD + "Welcome " + ChatColor.DARK_AQUA + "" + ChatColor.BOLD +  player.getName() + ChatColor.GOLD + "" + ChatColor.BOLD + " to" + ChatColor.YELLOW + "" + ChatColor.BOLD + " Thunder-UK");
		}
	}
}