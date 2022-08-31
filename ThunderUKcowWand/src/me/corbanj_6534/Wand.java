package me.corbanj_6534;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
 
public class Wand extends JavaPlugin implements Listener {
 
        public void onEnable() {
                Bukkit.getPluginManager().registerEvents(this, this);
        }
 
        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
               
               
                if(event.getAction().equals(Action.PHYSICAL)
                || event.getAction().equals(Action.LEFT_CLICK_AIR)
                || event.getAction().equals(Action.LEFT_CLICK_BLOCK))
                return; {
                        }
               
                        Player player = event.getPlayer();
                        if(player.getItemInHand() != null && player.getItemInHand().getType().equals(Material.BLAZE_ROD) && player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("Fire Wand")) {
                                Vector looking = player.getLocation().getDirection().multiply(4.0);
                                Arrow arrow = player.launchProjectile(Arrow.class);
                                arrow.setVelocity(looking);
                                player.playSound(player.getLocation(),Sound.BLAZE_BREATH, 2.0f, 1.0f);
                event.getPlayer().sendMessage(ChatColor.RED + "Firebolt casted!");
                }
        }      
}