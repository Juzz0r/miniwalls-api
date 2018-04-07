package xyz.laur.miniwalls.api;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class MiniWallsDeathEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();

    @Getter
    private final Player killer;

    @Getter
    private final String team, killerTeam;

    public MiniWallsDeathEvent(Player who, Player killer, String team, String killerTeam) {
        super(who);

        this.killer = killer;
        this.team = team;
        this.killerTeam = killerTeam;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
