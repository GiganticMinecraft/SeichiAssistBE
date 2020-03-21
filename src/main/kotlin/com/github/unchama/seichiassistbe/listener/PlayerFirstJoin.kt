package com.github.unchama.seichiassistbe.listener

import cn.nukkit.block.BlockID
import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerRespawnEvent
import cn.nukkit.level.Position

object PlayerFirstJoin : Listener {
    @EventHandler
    fun onFirstJoin(e: PlayerRespawnEvent) {
        if (e.isFirstSpawn) {
            val world = e.respawnPosition.level
            val rw = world.spawnLocation
            val rx = rw.floorX
            val rz = rw.floorZ
            for (x in (rx-5)..(rx+5)) {
                for (z in (rz-5)..(rz+5)) {
                    world.setBlockAt(x, 64, z, BlockID.COBBLESTONE)
                }
            }
        }
        // リスポーンをいじる必要はない
    }
}
