package me.corbanj_6534;


import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class hardcore implements Listener {
	
	public hardcore(ThunderUKhardcore plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	
	@EventHandler
	public void onDeath(PlayerDeathEvent d) {

		
		Player player = (Player)d.getEntity();
		BanList bl = Bukkit.getBanList(BanList.Type.NAME);
		
		if (!player.hasPermission("thunderuk.nodeath")){
			player.kickPlayer("You Have Died.");
			bl.addBan(player.getName(), "You Have Died.", null, null);
			Bukkit.getServer().broadcastMessage(ChatColor.GRAY + player.getName() + ChatColor.RED + "Has Died.");
		}
		else {
			player.sendMessage(ChatColor.GOLD + "You're safe from being banned on death, don't worry!");
		}
		
	}

}	
