package com.github.unchama.seichiassistbe.stickmenu.ranking

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object RankingCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | ランキング")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}整地神ランキング")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ログイン神ランキング")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}投票神ランキング")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}