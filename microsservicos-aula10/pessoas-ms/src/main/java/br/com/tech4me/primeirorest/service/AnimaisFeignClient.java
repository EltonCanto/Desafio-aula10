package br.com.tech4me.primeirorest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tech4me.primeirorest.compartilhado.Animais;

@FeignClient(name = "animais-ms", fallback = AnimaisFeignClientFallBack.class)
public interface AnimaisFeignClient {
    @GetMapping(path = "/api/animais/{dono}/lista")
    List<Animais> obterAnimais(@PathVariable String dono);
}

@Component
class AnimaisFeignClientFallBack implements AnimaisFeignClient{

    @Override
    public List<Animais> obterAnimais(String dono) {
       
        return new ArrayList<>();
    }
    
}