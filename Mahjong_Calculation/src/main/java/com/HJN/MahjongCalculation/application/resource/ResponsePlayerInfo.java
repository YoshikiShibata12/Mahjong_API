package com.HJN.MahjongCalculation.application.resource;

import lombok.Data;

/**
 * レスポンスプレイヤー情報
 * @author HighJunk
 *
 */
@Data
public class ResponsePlayerInfo {
  // プレイヤー名
  private String name;
  // 点数
  private int score;
}
