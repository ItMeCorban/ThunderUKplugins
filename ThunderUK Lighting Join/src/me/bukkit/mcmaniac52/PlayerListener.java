package me.bukkit.mcmaniac52;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.World;

public class PlayerListener implements Listener{
	
	public PlayerListener(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	
public void onJoin(PlayerJoinEvent j) {
		
		Player player = j.getPlayer();
		World world = player.getWorld();
		
		player.sendMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "[Thunder-UK]" + ChatColor.YELLOW + "Welcome to the server!");
		world.strikeLightning(player.getLocation());
	}

}
