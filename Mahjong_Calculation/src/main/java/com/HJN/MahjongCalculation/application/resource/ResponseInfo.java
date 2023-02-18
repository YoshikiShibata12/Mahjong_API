package com.HJN.MahjongCalculation.application.resource;

import java.util.List;

import lombok.Data;

/**
 * レスポンス情報
 * @author HighJunk
 *
 */
@Data
public class ResponseInfo {
  // プレイヤー情報
  private List<ResponsePlayerInfo> playerList;
}
