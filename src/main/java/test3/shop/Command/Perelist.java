package test3.shop.Command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import xyz.xenondevs.invui.gui.PagedGui;
import xyz.xenondevs.invui.item.ItemProvider;
import xyz.xenondevs.invui.item.builder.ItemBuilder;
import xyz.xenondevs.invui.item.impl.controlitem.PageItem;

import static test3.shop.Command.ShopCommand.serialize;


public class Perelist extends PageItem {

    public Perelist() {
        super(true);
    }

    @Override
    public ItemProvider getItemProvider(PagedGui<?> gui) {
        ItemBuilder builder = new ItemBuilder(Material.OAK_SIGN);
        builder.setDisplayName(serialize(
                        Component.text("Следующая страница", NamedTextColor.GRAY)))
                .addLoreLines(serialize(
                        gui.hasNextPage()
                                ? Component.text("Перейти на страницу ", NamedTextColor.DARK_PURPLE)
                                .append(Component.text(gui.getCurrentPage() + 2, NamedTextColor.GREEN))
                                .append(Component.text("/", NamedTextColor.GRAY))
                                .append(Component.text(gui.getPageAmount(), NamedTextColor.BLUE))
                                : Component.text("Вы на последней странице", NamedTextColor.RED)));
        return builder;
    }

}