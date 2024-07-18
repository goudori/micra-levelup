package plugin.thirteen_micra;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//  CommandExecutor　→コマンド実行する
//  CommandExecutorを作った後に、onCommandを作る事
// プレイヤーレベルを上げるコマンド
public class LevelUpCommand implements CommandExecutor {

  //  args →/コマンド　引数(マイクラで使うコマンドの事)
  @Override
  public boolean onCommand(CommandSender sender, Command command, String s,
      String[] args) {
    if (sender instanceof Player player) {
//      プレイヤーのレベル30にする
      player.setLevel(30);
    }
    return false;
  }
}
