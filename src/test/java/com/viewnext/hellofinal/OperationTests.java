package com.viewnext.hellofinal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OperacionTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void puedeSumar() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/suma?a=1&b=2", String.class)).isEqualTo("3.0");
    }

    @Test
    void puedeRestar() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/resta?a=1&b=2", String.class)).isEqualTo("-1.0");
    }

    @Test
    void puedeMultiplicar() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/multiplicacion?a=1&b=2", String.class)).isEqualTo("2.0");
    }

    @Test
    void puedeDividir() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/division?a=1&b=2", String.class)).isEqualTo("0.5");
    }

}
