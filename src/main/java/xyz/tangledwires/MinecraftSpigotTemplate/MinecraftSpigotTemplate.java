package xyz.tangledwires.MinecraftSpigotTemplate;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftSpigotTemplate extends JavaPlugin {
	@Override
    public void onEnable() {
		Bukkit.getServer().getLogger().info("Loaded MinecraftSpigotTemplate by xWires.");
		Bukkit.getServer().getLogger().info("Found an bug? Open an issue at https://github.com/TangledWiresYT/GetNBT");
    }
    
    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("MinecraftSpigotTemplate Disabled, bye!");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("command1")) { 
    		return true;
    	}
    	else if (cmd.getName().equalsIgnoreCase("command2")) {
    		return true;
    	}
	else if (cmd.getName().equalsIgnoreCase("command3")) {
		return true;
	}
    	return false; 
    }
}
