package com.github.unchama.seichiassistbe.stickmenu

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat
import com.github.unchama.seichiassistbe.stickmenu.build.BuildCategory
import com.github.unchama.seichiassistbe.stickmenu.gacha.GachaCategory
import com.github.unchama.seichiassistbe.stickmenu.help.HelpCategory
import com.github.unchama.seichiassistbe.stickmenu.item.ItemCategory
import com.github.unchama.seichiassistbe.stickmenu.move.MoveCategory
import com.github.unchama.seichiassistbe.stickmenu.other.OtherCategory
import com.github.unchama.seichiassistbe.stickmenu.ranking.RankingCategory
import com.github.unchama.seichiassistbe.stickmenu.skill.SkillCategory

object MainPage {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            builder.title("${TextFormat.LIGHT_PURPLE}木の棒メニュー")
            button("${TextFormat.AQUA}${TextFormat.BOLD}統計情報") { Statistics.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}アイテム関連") { ItemCategory.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}スキル関連") { SkillCategory.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ガチャ関連") { GachaCategory.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}建築関連") { BuildCategory.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}移動") { MoveCategory.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}ランキング") { RankingCategory.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}その他") { OtherCategory.showForm(it) }
            button("${TextFormat.YELLOW}${TextFormat.BOLD}困ったときは") { HelpCategory.showForm(it) }
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}閉じる") //何も処理をしない
        }

        player.showFormWindow(builder.build())
    }
}