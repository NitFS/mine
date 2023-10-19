package test3.shopnor.Util;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static test3.shopnor.Command.ShopCommand.mainshop;


@CommandAlias("shop")
public class Answer extends BaseCommand {
    @Default
    public void shop(CommandSender sender) {
        if (!(sender instanceof Player player)) {
            return;
        }

        mainshop(player);

    }

}