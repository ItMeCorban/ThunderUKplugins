package me.corbanj_6534;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
	
	public BlockListener(AntiBlock plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	
	@EventHandler
	public void onEvent(BlockPlaceEvent b) {
		
		Player player = b.getPlayer();
		
		//Removes placed TNT if player doesn't have thunderuk.place.tnt permission
		if (b.getBlock().getType() == Material.TNT)
			if (!player.hasPermission("thunderuk.place.tnt")) {
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Thunder-UK" + ChatColor.YELLOW + " AntiBlock" + ChatColor.GOLD + "]" + ChatColor.RED + "" + ChatColor.BOLD + "You cannot place TNT!");
				b.setCancelled(true);
	
		//Removes placed Water Bucket if player doesn't have thunderuk.place.water permission	
	}	if (b.getBlock().getType() == Material.WATER_BUCKET)
			if (!player.hasPermission("thunderuk.place.water")) {
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Thunder-UK" + ChatColor.YELLOW + " AntiBlock" + ChatColor.GOLD + "]" + ChatColor.RED + "" + ChatColor.BOLD + "You cannot place Water!");
				b.setCancelled(true);
			
		//Removes Water if player doesn't have thunderuk.place.water permission	
	} 	if (b.getBlock().getType() == Material.WATER)
			if (!player.hasPermission("thunderuk.place.water")) {
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Thunder-UK" + ChatColor.YELLOW + " AntiBlock" + ChatColor.GOLD + "]" + ChatColor.RED + "" + ChatColor.BOLD + "You cannot place Water!");
				b.setCancelled(true);
		
		//Removes placed Lava Bucket if player doesn't have thunderuk.place.lava permission	
	}	if (b.getBlock().getType() == Material.LAVA_BUCKET)
			if (!player.hasPermission("thunderuk.place.lava")) {
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Thunder-UK" + ChatColor.YELLOW + " AntiBlock" + ChatColor.GOLD + "]" +  ChatColor.RED + "" + ChatColor.BOLD + "You cannot place Lava!");
				b.setCancelled(true);
				
		//Removes placed Lava if player doesn't have thunderuk.place.lava permission
	}	if (b.getBlock().getType() == Material.LAVA)
			if (!player.hasPermission("thunderuk.place.lava")) {
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Thunder-UK" + ChatColor.YELLOW + " AntiBlock" + ChatColor.GOLD + "]" +  ChatColor.RED + "" + ChatColor.BOLD + "You cannot place Lava!");
				b.setCancelled(true);
		
		//Removes placed Bedrock if player doesn't have thunderuk.place.bedrock permission	
	}	if (b.getBlock().getType() == Material.BEDROCK)
			if (!player.hasPermission("thunderuk.place.bedrock")) {
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Thunder-UK" + ChatColor.YELLOW + " AntiBlock" + ChatColor.GOLD + "]" +  ChatColor.RED + "" + ChatColor.BOLD + "You cannot place Bedrock!");
				b.setCancelled(true);
			}
	}
}