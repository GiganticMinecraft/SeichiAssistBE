package com.github.unchama.seichiassistbe.listener

import cn.nukkit.block.Block
import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerRespawnEvent
import cn.nukkit.utils.Identifier

object PlayerFirstJoin : Listener {
    @EventHandler
    fun onFirstJoin(e: PlayerRespawnEvent) {
        if (e.isFirstSpawn) {
            val world = e.respawnLocation.level
            val rw = world.spawnLocation
            val rx = rw.floorX
            val rz = rw.floorZ
            for (x in (rx-5)..(rx+5)) {
                for (z in (rz-5)..(rz+5)) {
                    world.setBlockAt(x, 64, z, Block.get(Identifier.fromString("COBBLESTONE")))
                }
            }
        }
        // リスポーンをいじる必要はない
    }
}
