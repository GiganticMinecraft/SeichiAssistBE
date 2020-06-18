package com.github.unchama.seichiassistbe.stickmenu.gacha

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object GachaCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | ガチャ関連")
            button("${TextFormat.AQUA}${TextFormat.BOLD}整地報酬ガチャ券を受け取る")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}整地報酬ガチャ券の受け取り方法")
            button("${TextFormat.AQUA}${TextFormat.BOLD}運営からのガチャ券を受け取る")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}