# SeichiAssistBE
## About
SeichiAssist for Minecraft Bedrock Edition

The server to test is running on `play.seichi.click:19132`.

## Requirements
- Nukkit git-fa6dc7e
- JDK 8
- Kotlin 1.3+

## Environment
docker/docker-composeが扱えることを前提としています.
合わせてSeichiAssistの[README](https://github.com/GiganticMinecraft/SeichiAssist)を参照してください.

Linux/MacOS環境では`debug.sh`を実行することでビルド, 成果物のデバッグサーバへの配置,
起動までを一手に行います.

// TODO: Support Windows

また初回起動時にNukkitXの仕様上**標準入力でインタラクティブに言語を指定しなければなりません**(`jpn`のように).
`socat`コマンドが存在する場合は自動で行いますが, そうでない場合は手動で入力する必要があります.

## License
[GPL_v3](LICENSE)

## AutoReleasing
developブランチにマージすると自動でplay.seichi.click:19132に反映&再起動されます。

CircleCIの適用範囲はjar作成→リリース用ディレクトリ配置までです。

稼働環境への反映と再起動はインフラ側で別途スクリプト組んでいます。（本リポジトリの管理対象外）
