package com.github.unchama.seichiassistbe

import cn.nukkit.level.gamerule.GameRules
import cn.nukkit.plugin.PluginBase
import com.github.unchama.seichiassistbe.listener.DebugListener
import com.github.unchama.seichiassistbe.listener.NoticeListener
import com.github.unchama.seichiassistbe.listener.PlayerFirstJoin


@Suppress("unused")
class SeichiAssistBE : PluginBase() {

    override fun onEnable() {
        server.levels.forEach { it.gameRules.put(GameRules.PVP, false) }

        setOf(
                DebugListener,
                NoticeListener,
                PlayerFirstJoin
        ).forEach { listener -> server.pluginManager.registerEvents(listener, this) }
    }

}
