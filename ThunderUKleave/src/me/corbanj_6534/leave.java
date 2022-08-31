package me.corbanj_6534;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class leave implements Listener {
	
	public leave(ThunderUKleave plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	
	@EventHandler
	public void onJoin(PlayerQuitEvent j) {
		
		Player player = j.getPlayer();
		

		j.setQuitMessage("         " + ChatColor.DARK_AQUA + "" + ChatColor.BOLD +  player.getName() + ChatColor.GOLD + "" + ChatColor.BOLD + " has disconnected from" + ChatColor.YELLOW + "" + ChatColor.BOLD + " Thunder-UK");
		
		}
		
	}
	
