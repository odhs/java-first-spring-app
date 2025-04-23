package br.com.shdo.first_spring_app.configuration;

import org.springframework.context.annotation.Configuration;

// Classes com anotação @configuration são classes de configuração do Spring
// e podem conter métodos que retornam beans do Spring, ou seja, objetos gerenciados pelo Spring  
// e que podem ser injetados em outros componentes do Spring
// O Spring irá instanciar a classe e gerenciar o ciclo de vida dela.
// O padrão é singleton.
@Configuration
public class HelloConfiguration {
    private String message = "Hello, World!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}