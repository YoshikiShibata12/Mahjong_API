package com.HJN.MahjongCalculation.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 独自例外クラス
 * @author HighJunk
 *
 */
@Getter
@AllArgsConstructor
public class ApiException extends Exception {
  // エラーメッセージ
  private String message;
}
