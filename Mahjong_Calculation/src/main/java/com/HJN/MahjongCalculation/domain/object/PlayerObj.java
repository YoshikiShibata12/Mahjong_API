package com.HJN.MahjongCalculation.domain.object;

import lombok.Data;

/**
 * プレイヤーオブジェクト
 * @author HighJunk
 *
 */
@Data
public class PlayerObj {
  // プレイヤー名
  private String name;
  // 点数
  private Integer score;
}
