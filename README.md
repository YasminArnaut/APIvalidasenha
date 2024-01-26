# API de Validação de Senha.

- Descrição:<br>
A API de Validação de Senha é uma ferramenta abrangente para garantir a segurança das credenciais. Ao implementar verificações abrangentes, 
a API assegura que as senhas atendam a critérios rigorosos, proporcionando uma camada adicional de proteção.

- Requisitos de Senha<br>
A API impõe os seguintes requisitos mínimos para garantir senhas seguras:<br>
- Nove ou mais caracteres: As senhas devem ter nove ou mais caracteres, proporcionando uma extensão suficiente para aumentar a complexidade.<br>
- Ao menos 1 número: Pelo menos um caractere numérico deve estar presente na senha, aumentando sua diversidade.<br>
- Ao menos 1 letra minúscula e 1 letra maiúscula: Garanta a presença de letras minúsculas e maiúsculas na senha para torná-la mais resistente a ataques.<br>
- Ao menos 1 caractere especial: Inclua pelo menos um caractere especial da lista: !@#$%^&*()-+. Esses caracteres adicionam complexidade à senha.<br>
- Sem caracteres repetidos: A senha não deve conter caracteres repetidos dentro do conjunto, reforçando a segurança.<br>

# Desenho da Aplicação<br>
![Captura de tela 2024-01-25 215437](https://github.com/YasminArnaut/YasminArnaut/assets/98672747/0f4dc00a-3939-4e86-b297-088a896f132f)

# Tecnologias<br>
Este projeto foi desenvolvido com as principais tecnologias:
- [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Regex](https://medium.com/xp-inc/regex-um-guia-pratico-para-express%C3%B5es-regulares-1ac5fa4dd39f)
- JUnit
- Biblioteca de testes

# API
- A utilização é bastante direta: basta enviar uma senha para ser validada; se a senha seguir as regras, será retornado `true`, caso contrário, `false`. 
- Exemplo de Senha Válida:<br>
"AbTi1@jok"<br>
- Exemplo de Senha Inválida:<br>
"AA11@@22"<br>
- Para acessar remotamente sem precisar da API rodando localmente, será necessário realizar uma requisição
  do tipo `POST` no end-point : `http://localhost:8080/api/senhas/validacoes`

https://github.com/YasminArnaut/apivalidasenha/assets/98672747/b9b54844-4dbe-4154-bbdd-9ae4f276ac59

### Possíveis aprimoramentos:<br>
- Incluir a capacidade de fornecer uma mensagem explicativa ao detectar uma senha inválida.<br>

##
Feito por [Yasmin Arnaut](https://www.linkedin.com/in/yasmin-arnaut/) 👩🏽‍💻
