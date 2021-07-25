package me.lubek.admin.commands;

import me.lubek.admin.api.prefix;
import me.lubek.admin.files.messages;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

public class gamemode implements CommandExecutor {
    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = Bukkit.getPlayer(sender.getName());
        if (args.length==1) {
            ConfigurationSection gamemodes = messages.get().getConfigurationSection("Gamemodes");
            if (args[0].equals("0")){ player.setGameMode(GameMode.SURVIVAL); player.sendMessage(prefix.Log(gamemodes.getString("survival"),true, player));}
            if (args[0].equals("1")){ player.setGameMode(GameMode.CREATIVE); player.sendMessage(prefix.Log(gamemodes.getString("creative"),true, player));}
            if (args[0].equals("2")){ player.setGameMode(GameMode.ADVENTURE); player.sendMessage(prefix.Log(gamemodes.getString("adventure"),true, player));}
            if (args[0].equals("3")){ player.setGameMode(GameMode.SPECTATOR); player.sendMessage(prefix.Log(gamemodes.getString("spectator"),true, player));}
            return true;
        }
        else {
            player.sendMessage(prefix.Error(messages.get().getString("Not-Enough-Args"), true, player));
            return true;
        }
    }
}
