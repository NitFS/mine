package test3.shop;


import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;
import test3.shop.util.Shop;

public final class PLugin extends JavaPlugin {

    private static PLugin instance;

    public static PLugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin is setting!!");

        instance = this;

        saveDefaultConfig();


        BukkitCommandManager manager = new BukkitCommandManager(this);

        manager.registerCommand(new Shop());

        getLogger().info("Plugin is working!!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin has turned off!!");
    }
}