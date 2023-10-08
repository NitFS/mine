package test.test1;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("food")
public class food extends BaseCommand {

    private final Test1 plugin;

    public food(Test1 plugin) {
        this.plugin = plugin;
    }



    @Default
    public void onFavouriteFood(CommandSender sender, String[] args) {
        if (sender instanceof Player player) {
            if (args.length > 0) {
                String newFavouriteFood = String.join("", args);
                this.plugin.getConfig().set("favourite-food", newFavouriteFood);
                this.plugin.saveConfig();
                player.sendMessage("Любимая еда была изменена на " + newFavouriteFood);

            } else {
                String favouriteFood = this.plugin.getConfig().getString("favourite-food");
                player.sendMessage("Любимая еда - " + favouriteFood);
            }
        } else {
            sender.sendMessage("Команда может быть выполнена только оператором, не консолью");
        }
    }
}