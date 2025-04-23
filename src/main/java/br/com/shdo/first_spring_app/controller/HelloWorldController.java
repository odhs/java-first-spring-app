package br.com.shdo.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.shdo.first_spring_app.domain.User;
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

  /*
   * POST http://localhost:8080/hello-world/000456 HTTP/1.1
   * content-type: application/json
   * 
   * {
   * "name": "Sérgio",
   * "email": "teste@emailserver.com"
   * }
   */
  @PostMapping("/{id}")
  public String helloWorldPost(
      @PathVariable("id") String id,
      @RequestParam(value = "filter", defaultValue = "nenhum") String filter,
      @RequestBody User body) {
    return "Hello World " +
        body.getName() +
        " email: " + body.getEmail() +
        " id: " + id +
        " filter: " + filter;
  }

}
