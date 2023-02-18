package com.HJN.MahjongCalculation.domain.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.HJN.MahjongCalculation.application.common.ReturnScoreConsts;
import com.HJN.MahjongCalculation.application.resource.RequestInfo;
import com.HJN.MahjongCalculation.application.resource.RequestPlayerInfo;
import com.HJN.MahjongCalculation.application.resource.ResponseInfo;
import com.HJN.MahjongCalculation.domain.exception.ApiException;
import com.HJN.MahjongCalculation.domain.service.ScoreCalculationService;
import com.HJN.MahjongCalculation.domain.service.common.RoundOffPatternConsts;

/**
 * 点数計算サービス
 * @author HighJunk
 *
 */
@Service
public class ScoreCalculationServiceImpl implements ScoreCalculationService {

  /**
   * @param req リクエスト点数情報
   */
  @Override
  public ResponseInfo scoreCalculation(RequestInfo req) throws ApiException {

    List<RequestPlayerInfo> playerList = req.getPlayerList();
    Map<String, Integer> playerMap = new HashMap<>();
    for (RequestPlayerInfo player : playerList) {
      Integer score = (RoundOffPatternConsts.getRoundOff(player.getScore()) - ReturnScoreConsts.THIRTY_THOUSAND.getReturnScore()) / 1000;
    }
    
    
    
    
//    for (RequestPlayerInfo pi : req.getPlayerList()) {
//      // プレイヤーオブジェクト生成
//      PlayerObj playerObj = new PlayerObj();
//      // プレイヤー名
//      String name = pi.getName();
//      /* プレイヤーの点数
//          100の位を五捨六入
//          返しの点数30000点を返す
//          1000で割ることで最終的な点数へ */
//      Integer score = (RoundOffPatternConsts.getRoundOff(pi.getScore())
//          - ReturnScoreConsts.THIRTY_THOUSAND.getReturnScore()) / 1000;
//    }

    return null;
  }

}
