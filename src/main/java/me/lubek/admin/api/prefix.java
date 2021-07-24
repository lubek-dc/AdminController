package me.lubek.admin.api;

import org.bukkit.ChatColor;

public class prefix {

    public static String Warning(String text){
        text = ChatColor.GOLD +"(!)"+ChatColor.YELLOW+" "+text;

        return text;
    }
    public static String Error(String text) {
        text = ChatColor.DARK_RED +"(!)"+ChatColor.RED+" " + text;
        return text;
    }
    public static String Log(String text) {
        text = ChatColor.DARK_AQUA+"(!) "+ ChatColor.AQUA + text;
        return text;
    }
}
