package me.lubek.admin.api;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class prefix {

    public static String Warning(String text, Boolean Title, Player p){
        text = ChatColor.GOLD +"(!)"+ChatColor.YELLOW+" "+text;
        if (Title) {
            p.sendTitle(text,"");
        }
        return text;
    }
    public static String Error(String text, Boolean Title, Player p) {
        text = ChatColor.DARK_RED +"(!)"+ChatColor.RED+" " + text;
        if (Title) {
            p.sendTitle(text,"");
        }
        return text;
    }
    public static String Log(String text, Boolean Title, Player p) {
        text = ChatColor.DARK_AQUA+"(!) "+ ChatColor.AQUA + text;
        if (Title) {
            p.sendTitle(text,"");
        }
        return text;
    }
}
