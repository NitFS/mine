package test3.shop.Command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.jetbrains.annotations.NotNull;
import xyz.xenondevs.invui.item.ItemProvider;
import xyz.xenondevs.invui.item.builder.ItemBuilder;
import xyz.xenondevs.invui.item.impl.AbstractItem;

import static test3.shop.Command.ShopCommand.openShopWindow;
import static test3.shop.Command.ShopCommand.serialize;


public class back extends AbstractItem {
    @Override
    public ItemProvider getItemProvider() {
        return new ItemBuilder(Material.RED_TERRACOTTA)
                .setDisplayName(serialize(Component
                        .text("No!NO!NO!NO!", NamedTextColor.RED)
                        .decorate(TextDecoration.ITALIC)));
    }

    @Override
    public void handleClick(@NotNull ClickType clickType, @NotNull Player player, @NotNull InventoryClickEvent event) {
        openShopWindow(player);
    }
}