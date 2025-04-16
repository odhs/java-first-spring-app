package br.com.shdo.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.shdo.first_spring_app.service.HelloWorldService;

/* 
@RestController = @Controller + @ResponseBody
*/
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

  /// MODO 1: Injeção de Dependência via Construtor
  /*
   * private final HelloWorldService helloWorldService;
   * 
   * public HelloWorldController(HelloWorldService helloWorldService) {
   * this.helloWorldService = helloWorldService;
   * }
   */

  /// MODO 2: Injeção de Dependência via Setter
  @Autowired
  private HelloWorldService helloWorldService;

  // http://localhost:8080/hello-world
  @GetMapping
  public String helloWorld() {
    return helloWorldService.helloWorld("Sérgio");
  }
}
