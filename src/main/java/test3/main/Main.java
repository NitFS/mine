package test3.main;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PaperCommandManager manager = new PaperCommandManager(this);
        manager.registerCommand(new BowCommand());
        getServer().getPluginManager().registerEvents(new TeleportBowLstener(), this);
    }
}