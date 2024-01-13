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
    void getAlteraInformacoesVeiculo(@PathVariable Long idAutomovel, @RequestBody AlteraInformacoesRequest informacoesVeiculo);

    @PostMapping ("{idAutomovel}/RENAULT")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaRenault(@PathVariable Long idAutomovel);

    @PostMapping ("{idAutomovel}/FIAT")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaFiat(@PathVariable Long idAutomovel);

    @PostMapping ("{idAutomovel}/VOLKSWAGEN")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaVolkswagen(@PathVariable Long idAutomovel);

    @PostMapping ("{idAutomovel}/SUV")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraTipoParaSuv(@PathVariable Long idAutomovel);
    }