package com.github.unchama.seichiassistbe.stickmenu.build

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object BuildCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | 建築関連")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}土地保護メニュー")
            button("${TextFormat.AQUA}${TextFormat.BOLD}範囲設置スキル")
            button("${TextFormat.AQUA}${TextFormat.BOLD}ブロックを並べるスキル(仮)")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}