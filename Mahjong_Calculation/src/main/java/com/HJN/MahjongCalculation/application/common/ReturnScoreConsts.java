package com.HJN.MahjongCalculation.application.common;

import lombok.Getter;

/**
 * 返しの点数
 * @author HighJunk
 *
 */
@Getter
public enum ReturnScoreConsts {
  // 返却点数が30000点
  THIRTY_THOUSAND(30000),
//返却点数が30000点
  TWENTYFIVE_THOUSAND(25000);

  // 返却点数
  private final Integer returnScore;

  /**
   * コンストラクタ
   * @param returnScore 返却点数
   */
  private ReturnScoreConsts(Integer returnScore) {
    this.returnScore = returnScore;
  }
}
