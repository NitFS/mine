package test3.main;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TeleportBowLstener implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Arrow) {
            Arrow arrow = (Arrow) event.getEntity();
            if (arrow.getShooter() instanceof Player) {
                Player player = (Player) arrow.getShooter();
                if (player.getInventory().getItemInMainHand().getType() == Material.BOW &&
                        player.getInventory().getItemInMainHand().hasItemMeta() &&
                        player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("Телепортационный Лук")) {
                    player.teleport(arrow.getLocation());
                    arrow.remove();
                }
            }
        }
    }
}