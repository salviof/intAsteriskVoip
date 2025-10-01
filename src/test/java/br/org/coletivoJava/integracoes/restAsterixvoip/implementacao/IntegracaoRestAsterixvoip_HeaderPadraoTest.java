/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.junit.Test;

/**
 *
 * @author salvio
 */
public class IntegracaoRestAsterixvoip_HeaderPadraoTest {

    public IntegracaoRestAsterixvoip_HeaderPadraoTest() {
    }

    @Test
    public void testeBase64() {
        // Concatena token:key
        String seuToken = "OP989QqTY1T3vs6BC2ST9V9CYZEQ5rEOoAEc";  // Ex: "abc123"
        String suaChave = "lsBypayN2uICCQalulWWEa7XLEVxmttwMRsZ";  // Ex: "xyz789"

        String credenciais = seuToken + ":" + suaChave;
        String authBasic = "Basic " + Base64.getEncoder().encodeToString(credenciais.getBytes(StandardCharsets.UTF_8));

        System.out.println("Auth Header: " + authBasic);
    }

    public void testSomeMethod() {
        String seuToken = "OP989QqTY1T3vs6BC2ST9V9CYZEQ5rEOoAEc";  // Ex: "abc123"
        String suaChave = "lsBypayN2uICCQalulWWEa7XLEVxmttwMRsZ";  // Ex: "xyz789"

        // Gera o JWT
        String jwtToken = Jwts.builder()
                .setSubject(seuToken) // O token/ID como "sub" (ou ajuste conforme a API)
                //     .setIssuedAt(new Date()) // Data de emissão
                //      .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // Expira em 1 hora
                //     .claim("custom_field", "valor") // Adicione claims personalizados se a API exigir
                .signWith(SignatureAlgorithm.HS256, suaChave.getBytes(StandardCharsets.UTF_8)) // Assina com HMAC-SHA256
                .compact();

        // Forma o Bearer Token
        String bearerToken = "Bearer " + jwtToken;

        System.out.println("Bearer Token (JWT): " + bearerToken);

    }
}
