package com.alkemy.java2.clase10.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TestController {

  @GetMapping("/hola")
  public String mostrarHola(){
    return  "Hola desplegado desde Websphere Liberty";
  }
}
