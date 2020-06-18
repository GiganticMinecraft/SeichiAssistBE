package com.github.unchama.seichiassistbe.stickmenu.other

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object OtherCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | その他")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}実績・二つ名システム")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}投票ptメニュー")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}全体通知切り替え")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}死亡メッセージ表示切り替え")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ワールドガード保護メッセージ切り替え")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}