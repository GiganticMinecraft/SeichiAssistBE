package com.github.unchama.seichiassistbe.stickmenu.help

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object HelpCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | 困ったときは")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}公式Wikiにアクセス")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}運営方針とルールを確認")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}JMSリンク")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}