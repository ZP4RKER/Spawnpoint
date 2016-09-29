package com.zp4rker.yazza;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author ZP4RKER
 */
public class Spawnpoint extends JavaPlugin {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getLabel().equalsIgnoreCase("setspawn")) {
            Player player = (Player) sender;
            Location playerLoc = player.getLocation();
            playerLoc.getWorld().setSpawnLocation(playerLoc.getBlockX(), playerLoc.getBlockY(), playerLoc.getBlockZ());
            player.sendMessage("Set spawn!");
            return true;
        }
        if (cmd.getLabel().equalsIgnoreCase("spawn")) {
            Player player = (Player) sender;
            player.teleport(player.getLocation().getWorld().getSpawnLocation());
            return true;
        }
        return false;
    }
}
