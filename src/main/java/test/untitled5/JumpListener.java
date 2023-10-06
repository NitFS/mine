package test.untitled5;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class JumpListener implements Listener {

    @EventHandler
    public void onPlayerJump(PlayerJumpEvent event){
        event.getPlayer().sendMessage("\u041c\u043e\u043b\u043e\u0434\u0435\u0446!");
    }
}