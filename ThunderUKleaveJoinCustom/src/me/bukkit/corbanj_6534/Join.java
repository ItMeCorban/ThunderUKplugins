package me.bukkit.corbanj_6534;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
	

	public Join(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	


	@EventHandler
	public void onJoin(PlayerJoinEvent j) {
		
		Player player = j.getPlayer();
		

		
		
		if (player.hasPermission("thunderuk.corban")) {
			j.setJoinMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Not to alarm anyone, but the owner has joined. Please stay calm, he doesn't bite. I think the best thing to do is say hi and act natural");	
		}
		else if (player.hasPermission("thunderuk.ragie")) {
			j.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Everyone, Ragie has joined, be kind and say hi!");
		}
		else if (player.hasPermission("thunderuk.devlin")){
			j.setJoinMessage(ChatColor.RED + "" + ChatColor.BOLD + "Ok people. Listen up! CosmicRed just joined, so you need to be nice. If he says something smart and fancy just smile and wave!");
		}
		else if (player.hasPermission("thunderuk.charlotte")) {
			j.setJoinMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Oh look, it's that splecial person, " + ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "ghostnimbus11287" + ChatColor.BOLD + "" + ChatColor.LIGHT_PURPLE + "!");
		}
		}
		else if (player.hasPermission("thunderuk.brett")) {
			j.setJoinMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Brick, " + ChatColor.BOLD + "" + ChatColor.GREEN + "ghostnimbus11287" + ChatColor.BOLD + "" + ChatColor.GREEN + "!");
		}		
		else if (player.hasPlayedBefore() == false) {
			j.setJoinMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "[" + ChatColor.AQUA + Bukkit.getOnlinePlayers().length + ChatColor.GOLD + "]" + ChatColor.BOLD + "EVERYONE welcome " + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + player.getName() + ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.YELLOW + "" + ChatColor.BOLD + " Thunder-UK");
		}
		else {
	       j.setJoinMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "[" + ChatColor.AQUA + Bukkit.getOnlinePlayers().length + ChatColor.GOLD +  "]" + ChatColor.BOLD + "Welcome " + ChatColor.DARK_AQUA + "" + ChatColor.BOLD +  player.getName() + ChatColor.GOLD + "" + ChatColor.BOLD + " to" + ChatColor.YELLOW + "" + ChatColor.BOLD + " Thunder-UK");
		}
	}
}