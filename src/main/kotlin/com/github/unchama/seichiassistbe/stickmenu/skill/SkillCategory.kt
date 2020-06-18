package com.github.unchama.seichiassistbe.stickmenu.skill

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.MainPage

object SkillCategory {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | スキル関連")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}アクティブスキル")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}パッシブスキル")
            button("${TextFormat.YELLOW}${TextFormat.BOLD}採掘速度上昇効果")
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}