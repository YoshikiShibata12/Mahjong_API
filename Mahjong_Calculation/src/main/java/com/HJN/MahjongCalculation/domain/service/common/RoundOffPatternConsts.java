package com.HJN.MahjongCalculation.domain.service.common;

/**
 * リクエスト点数の変換パターン
 * @author HighJunk
 *
 */
public class RoundOffPatternConsts {

  /**
   * 五捨六入変換メソッド
   * @param score リクエスト点数
   * @return 五捨六入後の点数
   */
  public static final Integer getRoundOff(Integer score) {

    Integer returnScore = score;

    // 100の位が600以上の場合
    if(score % 1000 >=6) {
      returnScore = ((int)Math.ceil(score/1000))*1000;

    // 100の位が500以下の場合
    } else if(score % 1000 <= 5) {
      returnScore = ((int)Math.floor(score/1000))*1000;
    }
    return returnScore;
  }
}
