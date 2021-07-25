package me.lubek.admin;

import me.lubek.admin.api.prefix;
import me.lubek.admin.commands.admin;
import me.lubek.admin.commands.gamemode;
import me.lubek.admin.files.messages;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

public final class Admin extends JavaPlugin {

    @Override
    public void onEnable() {




        //Commands Setup
        this.getCommand("gamemode").setExecutor(new gamemode());
        this.getCommand("admin").setExecutor(new admin());


        //Config setup
        //getConfig().options().copyDefaults();
        //saveDefaultConfig();
        messages.setup();
        messages.get().options().copyDefaults(true);


        //Gamemodes setup

        ConfigurationSection gamemodes = messages.get().getConfigurationSection("Gamemodes");
        if (gamemodes == null) { gamemodes = messages.get().createSection("Gamemodes"); }

        gamemodes.addDefault("survival", "Survival");
        gamemodes.addDefault("creative", "Creative");
        gamemodes.addDefault("adventure", "adventure");
        gamemodes.addDefault("spectator", "Spectator");
        gamemodes.addDefault("Not-Enough-Args", "Za malo argumentow");


        //Admin messages setup


        messages.save();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
