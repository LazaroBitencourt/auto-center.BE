package br.com.mrtech.autocenter.automoveis.application.api;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/v1/automovel")
public interface AutomovelAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    AutomovelIdResponse postCadastraNovoVeiculo(@RequestBody @Valid AutomovelRequest automovelRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ListAutomoveisResponse> getListaTodosVeiculos();