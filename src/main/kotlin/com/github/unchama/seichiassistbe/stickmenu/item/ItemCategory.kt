package com.github.unchama.seichiassistbe.stickmenu.item

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object ItemCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | アイテム関連")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}MineStack機能")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}４次元ポケット")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}どこでもエンダーチェスト")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}インベントリ共有")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}FastCraft機能")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}アイテム変交換システム")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ゴミ箱")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}自分の頭を召喚")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}