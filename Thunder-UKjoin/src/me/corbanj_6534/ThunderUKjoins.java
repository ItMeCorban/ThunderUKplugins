package me.corbanj_6534;

import org.bukkit.plugin.java.JavaPlugin;

public class ThunderUKjoins extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Thunder-UK Joins enabled");
		new Join(this);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Thunder-UK Joins disabled");
	}
}		
	
	
//	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
//		
//		if (cmd.getName().equalsIgnoreCase("BLANK") && sender instanceof Player) {
//			
//			Player player = (Player) sender;
//			
//			return true;
//			
//		}
		
		
	