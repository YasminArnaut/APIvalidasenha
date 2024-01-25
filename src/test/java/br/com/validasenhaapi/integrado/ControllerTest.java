package br.com.validasenhaapi.integrado;


import br.com.validasenhaapi.controller.dto.Senha;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestPropertySource(properties = "server.port=9090")
public class ControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("Teste integrado com senha valida")
    public void testeOk() throws JsonProcessingException {
        Senha senha = new Senha("Abs1234@!");
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(objectMapper.writeValueAsString(senha), headers);

        ResponseEntity<Senha> responseEntity = restTemplate.exchange(
                "http://localhost:9090/api/senhas/validacoes",
                HttpMethod.POST,
                requestEntity,
                Senha.class
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertTrue(responseEntity.getBody().isSenhaValida());
    }

    @Test
    @DisplayName("Teste integrado com senha invalida")
    public void testeNaoOk() throws JsonProcessingException {
        Senha senha = new Senha("Abs123!");
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(objectMapper.writeValueAsString(senha), headers);

        ResponseEntity<Senha> responseEntity = restTemplate.exchange(
                "http://localhost:9090/api/senhas/validacoes",
                HttpMethod.POST,
                requestEntity,
                Senha.class
        );

        Assertions.assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, responseEntity.getStatusCode());
        Assertions.assertFalse(responseEntity.getBody().isSenhaValida());
    }
}
