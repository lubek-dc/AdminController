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
            if (args[0].equals("0")){ player.setGameMode(GameMode.SURVIVAL); player.sendMessage(prefix.Log(messages.get().getString("survival")));}
            if (args[0].equals("1")){ player.setGameMode(GameMode.CREATIVE); player.sendMessage(prefix.Log(messages.get().getString("creative")));}
            if (args[0].equals("2")){ player.setGameMode(GameMode.ADVENTURE); player.sendMessage(prefix.Log(messages.get().getString("adventure")));}
            if (args[0].equals("3")){ player.setGameMode(GameMode.SPECTATOR); player.sendMessage(prefix.Log(messages.get().getString("spectator")));}
            return true;
        }
        else {
            player.sendMessage(prefix.Error(messages.get().getString("Not-Enough-Args")));
            return true;
        }
    }
}
