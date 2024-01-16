package br.com.mrtech.autocenter.automoveis.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/v1/automovel")
public interface AutomovelAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    AutomovelIdResponse postCadastraNovoVeiculo(@RequestBody @Valid AutomovelRequest automovelRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ListAutomoveisResponse> getListaTodosVeiculos();

    @GetMapping("/{idAutomovel}")
    @ResponseStatus(HttpStatus.OK)
    DetalhaAutomovelResponse getDetalhaAutomovel(@PathVariable UUID idAutomovel);

    @PatchMapping ("/{idAutomovel}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraInformacoesVeiculo(@PathVariable UUID idAutomovel, @RequestBody AlteraInformacoesRequest informacoesVeiculo);

    @PostMapping ("/{idAutomovel}/RENAULT")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaRenault(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/FIAT")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaFiat(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/VOLKSWAGEN")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaVolkswagen(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/HYUNDAI")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaHyundai(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/HONDA")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaHonda(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/TOYOTA")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraMarcaParaToyota(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/MOTOCICLETA")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraTipoParaMotocicleta(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/SUV")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraTipoParaSuv(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/HATCH")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraTipoParaHatch(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/SEDAN")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraTipoParaSedan(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/MINIVAN")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraTipoParaMinivan(@PathVariable UUID idAutomovel);

    @PostMapping ("/{idAutomovel}/PICAPE")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void getAlteraTipoParaPicape(@PathVariable UUID idAutomovel);

    @DeleteMapping ("/{idAutomovel}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteAutomovelPorId(@PathVariable UUID idAutomovel);

    }