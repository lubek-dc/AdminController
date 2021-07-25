package me.lubek.admin.commands;

import me.lubek.admin.api.prefix;
import me.lubek.admin.files.messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class admin implements CommandExecutor {

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
            if (args[0].equals("reload")) { // Reloads Config
                messages.reload();
                player.sendMessage(prefix.Log("config.yml Reloaded", true, player));
                return true;
            }
        }
        else {
            player.sendMessage("Commands:");
            player.sendMessage("/admin reload - Przeladowywuje wszystkie pliki configowe");
            return true;
        }

        return false;
    }
}
