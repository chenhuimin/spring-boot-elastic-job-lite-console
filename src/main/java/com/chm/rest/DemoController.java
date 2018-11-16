package com.chm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

  @GetMapping("/time")
  public long time() {
    return System.currentTimeMillis();
  }
}
