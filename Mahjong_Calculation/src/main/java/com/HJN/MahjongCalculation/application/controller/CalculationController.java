package com.HJN.MahjongCalculation.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/calcukation")
public class CalculationController {

  @GetMapping(value = "")
  public String getCalculation() {
    return "calculation/index";
  }

}
