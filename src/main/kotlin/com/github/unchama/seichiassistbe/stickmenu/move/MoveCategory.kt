package com.github.unchama.seichiassistbe.stickmenu.move

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object MoveCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | 移動")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}サーバー間移動メニュー")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}メインワールドへワープ")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ロビーサーバーへ移動")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}Fly機能")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ホームメニュー")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ランダムテレポート(β)")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}