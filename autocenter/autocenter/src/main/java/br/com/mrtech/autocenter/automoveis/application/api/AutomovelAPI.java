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


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ListAutomoveisResponse> getListaTodosVeiculos();

    @GetMapping("{idAutomovel}")
    @ResponseStatus(HttpStatus.OK)
    DetalhaAutomovelResponse getDetalhaAutomovel(@PathVariable Long idAutomovel);

    @PatchMapping ("{idAutomovel}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraInformacoesVeiculo(@PathVariable Long idAutomovel,AlteraInformacoes alteraInformacoes);
}