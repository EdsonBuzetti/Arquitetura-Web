package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    public String preverTempo() {
        String dadosMeteorologicos = "";
        String apiUrl = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=4dadd6760a56ca392af58a28e1d10376";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity= restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dadosMeteorologicos = responseEntity.getBody();
        }
        else {
            dadosMeteorologicos = "Falha ao obter dados metereologicos. Codigo de status: " + responseEntity.getStatusCode();
        }
        return dadosMeteorologicos;
    }
}
