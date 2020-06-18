package com.github.unchama.seichiassistbe.stickmenu

import cn.nukkit.form.SimpleForm
import cn.nukkit.player.Player
import cn.nukkit.utils.TextFormat

object Statistics {
    fun showForm(player: Player) {
        val builder = SimpleForm.SimpleFormBuilder()

        builder.apply {
            title("${TextFormat.LIGHT_PURPLE}棒メニュー | 統計情報")
            content("""
                ${TextFormat.YELLOW}${TextFormat.BOLD}${TextFormat.UNDERLINE}${player.name}の統計情報

                  ${TextFormat.GREEN}${TextFormat.BOLD}整地系
                    ${TextFormat.AQUA}整地レベル: ${TextFormat.UNDERLINE}000
                    ${TextFormat.AQUA}総整地量: ${TextFormat.UNDERLINE}00000000
                    ${TextFormat.YELLOW}整地ランキング: ${TextFormat.UNDERLINE}0000位(0000人中)
                      ${TextFormat.GOLD}RANKING-1(PLAYER)との差: 00000
                    ${TextFormat.AQUA}総獲得ガチャ券数: ${TextFormat.UNDERLINE}00000000枚

                  ${TextFormat.GREEN}${TextFormat.BOLD}スターレベル
                    ${TextFormat.AQUA}スターレベル: ${TextFormat.UNDERLINE}☆0
                    ${TextFormat.AQUA}次のレベルまで: ${TextFormat.UNDERLINE}00000000

                  ${TextFormat.GREEN}${TextFormat.BOLD}建築系
                    ${TextFormat.AQUA}建築レベル: ${TextFormat.UNDERLINE}000
                    ${TextFormat.AQUA}総建築量: ${TextFormat.UNDERLINE}00000000
                    
                  ${TextFormat.GREEN}${TextFormat.BOLD}プレイ情報
                    ${TextFormat.AQUA}総ログイン時間: ${TextFormat.UNDERLINE}000時間00分
                    ${TextFormat.AQUA}通算ログイン日数: ${TextFormat.UNDERLINE}000日
                    ${TextFormat.AQUA}連続ログイン日数: ${TextFormat.UNDERLINE}000日
                    ${TextFormat.AQUA}通算投票回数: ${TextFormat.UNDERLINE}000回
                    ${TextFormat.AQUA}連続投票日数: ${TextFormat.UNDERLINE}000日
            """.trimIndent())
            button("${TextFormat.DARK_GRAY}${TextFormat.BOLD}戻る") { MainPage.showForm(it) }
        }

        player.showFormWindow(builder.build())
    }
}