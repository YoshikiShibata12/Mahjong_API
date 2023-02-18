package com.HJN.MahjongCalculation.application.resource;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * リクエストプレイヤー情報
 * @author HighJunk
 *
 */
@Data
public class RequestPlayerInfo {
  // プレイヤー名
  @NotBlank
  private String name;
  // 点数
  @NotBlank
  private Integer score;
}
