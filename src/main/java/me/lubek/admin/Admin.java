package me.lubek.admin;

import me.lubek.admin.commands.admin;
import me.lubek.admin.commands.gamemode;
import me.lubek.admin.files.messages;
import org.bukkit.plugin.java.JavaPlugin;

public final class Admin extends JavaPlugin {

    @Override
    public void onEnable() {




        //Commands Setup
        this.getCommand("gamemode").setExecutor(new gamemode());
        this.getCommand("admin").setExecutor(new admin());


        //Config setup
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        messages.setup();
        messages.get().options().copyDefaults(true);


        //Gamemodes setup
        messages.get().addDefault("survival", "Survival");
        messages.get().addDefault("creative", "Creative");
        messages.get().addDefault("adventure", "adventure");
        messages.get().addDefault("spectator", "Spectator");
        messages.get().addDefault("Not-Enough-Args", "Za malo argumentow");
        //Admin messages setup


        messages.save();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
