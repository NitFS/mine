package test.untitled5;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Untitled5 extends JavaPlugin {

    @Override
    public void onEnable() {

        BukkitCommandManager manager = new BukkitCommandManager(this);


        manager.registerCommand(new HelloCommand());
    }
}