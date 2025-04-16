package br.com.shdo.first_spring_app.service;

import org.springframework.stereotype.Service;


/* Service:
 * - Acesso ao repositório
 * - Lógicas de Negócio
 */
@Service
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello World " + name + "!";
    }    
}
