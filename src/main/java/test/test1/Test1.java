package test.test1;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test1 extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("");

        saveDefaultConfig();



        BukkitCommandManager manager = new BukkitCommandManager(this);
        manager.registerCommand(new food(this));

        getLogger().info("");
    }

    @Override
    public void onDisable() {
        getLogger().info("");
    }


}