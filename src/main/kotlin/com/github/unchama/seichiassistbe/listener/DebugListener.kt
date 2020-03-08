package com.github.unchama.seichiassistbe.listener

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerFormRespondedEvent
import cn.nukkit.event.player.PlayerInteractEvent
import cn.nukkit.form.element.ElementButton
import cn.nukkit.item.Item
import com.github.unchama.seichiassistbe.util.WindowWithCallback

@Suppress("unused")
object DebugListener : Listener {

    @EventHandler
    fun `show a form with buttons on clicking a stick`(event: PlayerInteractEvent) {
        val player = event.player ?: return

        if (!player.isOp
                || event.action != PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK
                || event.item?.id != Item.STICK) return

        event.player.showFormWindow(
                WindowWithCallback(
                        "title",
                        "desciption",
                        ('A'..'Z').map { alphabet ->
                            ElementButton("$alphabet") to { event: PlayerFormRespondedEvent -> event.player.sendMessage("You clicked '$alphabet' !") }
                        }
                )
        )
    }

}