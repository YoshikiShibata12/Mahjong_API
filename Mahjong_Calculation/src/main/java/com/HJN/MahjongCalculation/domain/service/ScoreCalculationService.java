package com.HJN.MahjongCalculation.domain.service;

import com.HJN.MahjongCalculation.application.resource.RequestInfo;
import com.HJN.MahjongCalculation.application.resource.ResponseInfo;
import com.HJN.MahjongCalculation.domain.exception.ApiException;

/**
 * 点数計算サービス
 * @author HighJunk
 *
 */
public interface ScoreCalculationService {

  /**
   * 点数計算メソッド
   * @return レスポンス点数情報
   */
  public ResponseInfo scoreCalculation(RequestInfo req) throws ApiException;
}
