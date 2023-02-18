package com.HJN.MahjongCalculation.domain.service.common;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.HJN.MahjongCalculation.application.resource.RequestInfo;
import com.HJN.MahjongCalculation.domain.exception.ApiException;

/**
 * リクエスト点数情報チェック
 * @author HighJunk
 *
 */
@Service
public class RequestCheckService {

  /**
   * 
   * @param req リクエスト点数情報
   * @param result バインディングリザルト
   * @throws ApiException 
   */
  public void requestCheck(RequestInfo req, BindingResult result) throws ApiException {

    // 入力内容にエラーがある場合
    if(result.hasErrors()) {
      throw new ApiException("ParameterError");
    }
  }

}
