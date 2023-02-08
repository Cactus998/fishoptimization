package me.cactus.fishoptimization;

import org.bukkit.entity.Fish;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class FishControl implements Listener {

    @EventHandler
    public void onFishSpawn(EntitySpawnEvent event) {
        if (event.getEntity() instanceof Fish) {
            ((Fish) event.getEntity()).setAI(false);
        }
    }
}