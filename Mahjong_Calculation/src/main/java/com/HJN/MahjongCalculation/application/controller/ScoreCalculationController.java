package com.HJN.MahjongCalculation.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HJN.MahjongCalculation.application.resource.RequestInfo;
import com.HJN.MahjongCalculation.application.resource.ResponseInfo;
import com.HJN.MahjongCalculation.domain.exception.ApiException;
import com.HJN.MahjongCalculation.domain.service.ScoreCalculationService;
import com.HJN.MahjongCalculation.domain.service.common.RequestCheckService;

/**
 * 点数計算コントローラー
 * @author HighJunk.minami
 *
 */
@RestController
@RequestMapping(value = "/score_calculation")
public class ScoreCalculationController {

  @Autowired
  /* リクエスト情報チェックサービス */
  private final RequestCheckService requestCheckService;
  /* 点数計算サービス */
  private final ScoreCalculationService scoreCalculationService;

  /**
   * コンストラクタ
   * @param requestCheckService リクエスト情報チェックサービス
   * @param scoreCalculationService 点数計算サービス
   */
  private ScoreCalculationController(RequestCheckService requestCheckService,
      ScoreCalculationService scoreCalculationService) {
    this.requestCheckService = requestCheckService;
    this.scoreCalculationService = scoreCalculationService;
  }

  /**
   * 点数計算
   * @param req 点棒点数
   * @param result バインディングリザルト
   * @return 点数
   * @throws ApiException
   */
  @PostMapping(value = "")
  public ResponseEntity<?> scoreCalculation(@RequestBody @Validated RequestInfo req, BindingResult result)
      throws ApiException {

    try {
      // リクエスト情報チェック
      requestCheckService.requestCheck(req, result);

      // 点数結果を取得
      ResponseInfo res = scoreCalculationService.scoreCalculation(req);
      return ResponseEntity.ok(res);

    } catch (ApiException e) {
      throw new ApiException(e.getMessage());
    }
  }

}
