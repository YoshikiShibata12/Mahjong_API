package com.HJN.MahjongCalculation.application.resource;

import java.util.List;

import lombok.Data;

/**
 * リクエスト情報
 * @author HighJunk
 *
 */
@Data
public class RequestInfo {
  // うまの点数 4位to1位
  private int fourthToFirst;
  // うまの点数 3位to2位
  private int thirdToSecond;
  // プレイヤーリスト
  private List<RequestPlayerInfo> playerList;
}
