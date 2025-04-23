# _Java Spring Boot First App_

Este material é destinado ao estudo do _Spring Boot_, e esta aplicação é um exemplo de utilização.

## Spring Boot

O Spring Boot é um framework que facilita a criação de aplicações baseadas em Spring Framework. Você pode utilizar _Java_, _Kotlin_ ou _Groovy_, e usar o gestor de dependências _Maven_ ou _Gladle_.

## Iniciando

O projeto foi iniciado utilizando o website [start.spring.io]([https://start.spring.io/)

Este projeto exemplo usa o _Maven_.

O Grupo é o domínio, por exemplo, `br.com.shdo`

### Dependências Interessantes

- _Spring Boot DevTools_: Fornece reinício rápido da aplicação, rápido reload, e configurações para experiência de dese aprimorada.

- _Spring Web_: Construa aplicações web, incluindo RESTful e aplicações usando Spring MVC. Usa o Apache Tomcat como um container embutido.

- _Lombok_: Biblioteca para geração de código _boilerplate_

## 📦 Estrutura de um Projeto _Spring Boot_ (Gerado pelo start.spring.io)

### 📁 Estrutura de Diretórios e Arquivos

```plaintext
my-project/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── example/
    │   │           └── Application.java
    │   └── resources/
    │       ├── application.properties
    │       ├── application.yml
    │       ├── static/
    │       └── templates/
    └── test/
        └── java/
            └── com/
                └── example/
                    └── ApplicationTests.java
```

### 📄 Descrição dos Arquivos e Pastas

#### Projeto (raiz)

- **`.gitignore`**  
  Arquivo que informa ao _Git_ quais arquivos/pastas devem ser ignorados no versionamento (como `target/`, `.idea/`, entre outros).

- **`mvnw` / `mvnw.cmd`**  
  Scripts do Maven Wrapper que permitem executar o Maven sem instalá-lo globalmente.

  - `mvnw` para Unix/Linux/macOS
  - `mvnw.cmd` para Windows

- **`pom.xml`**  
  Arquivo de configuração do Maven. Define dependências, plugins e propriedades do projeto.  
  Se estiver usando **Gradle**, será `build.gradle`.

- **`README.md`**  
  Arquivo de documentação opcional para informações sobre o projeto.

---

#### 📂 `src/main/` – Código da aplicação

##### `java/`

- **`com/example/Application.java`**  
  Classe principal da aplicação. Contém o método `main` e é anotada com `@SpringBootApplication`, responsável por iniciar a aplicação.

##### 📂 `resources/`

- **`application.properties`** ou **`application.yml`**  
  Arquivos de configuração do _Spring Boot_.  
  Ex: porta do servidor, configurações de banco de dados, perfis, etc:
  
  ```sh
  spring.application.name=first-spring-app
  server.port=3000
  spring.datasource.url=${DB_HOST:jdbc:mysql://localhost:3306/springapp}
  spring.datasource.username=root
  spring.datasource.password=123456
  ```

- 📂 **`static/`**  
  Pasta para arquivos estáticos (ex: HTML, CSS, JS, imagens). O _Spring Boot_ serve esses arquivos automaticamente via HTTP.

- 📂 **`templates/`**  
  Diretório para templates de visualização (views) como **Thymeleaf**, **FreeMarker**, etc.  
  Usado para gerar páginas HTML dinâmicas.

---

#### 📂 `src/test/` – Código de testes

##### 📂 `java/`

- **`com/example/ApplicationTests.java`**  
  Classe de teste unitário padrão.  
  Usa _JUnit_ e _Spring Test_ para verificar se o contexto da aplicação carrega corretamente.

---

## Anotações

O Spring trabalha por meio de anotações, a classe principal da aplicação é notada com
@SpringBootAplication que compreende 3 anotações do Spring Framework:

`@Configuration`

- Métodos que definem _beans_

`@EnableAutoConfiguration`

- Ativa a auto configuração do _Spring_

`@ComponentScan`

- Permite que o Spring scaneie o projeto e gerencie a injeção de dependências das classes e o ciclo de vida de cada uma delas

### _Controllers_

`@RestController`, é um conjunto de `@Controller` e `@ResponseBody`
o controler é para a regra de negócio, e o responseBody

Continua...
