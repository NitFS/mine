package test3.shopnor;

import org.bukkit.plugin.java.JavaPlugin;

import co.aikar.commands.BukkitCommandManager;
import test3.shopnor.Util.Answer;


public final class Shopnor extends JavaPlugin {
    private static Shopnor instance;
    @Override
    public void onEnable() {
        instance = this;
        BukkitCommandManager manager = new BukkitCommandManager(this);
        manager.registerCommand(new Answer());
    }
    public static Shopnor getInstance() {
        return instance;
    }
}