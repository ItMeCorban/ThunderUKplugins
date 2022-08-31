package me.bukkit.corbanj_6534;



import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{


	@Override
	public void onEnable() {
		getLogger().info("Thunder-UK Join/Leave message plugin loaded!");
		new leave(this);
		new Join(this);
	}
	
	public void OnDisable() {
		getLogger().info("Thunder-UK Join/Leave message plugin disabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("thunderukjltest") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + ", the Join/Leave message plugin is functional!");
			
			return true;
		}
		
		return false;
	}


}



