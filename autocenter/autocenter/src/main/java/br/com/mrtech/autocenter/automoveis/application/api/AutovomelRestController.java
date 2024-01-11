package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.application.service.AutomovelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AutovomelRestController implements AutomovelAPI{

    private final AutomovelService service;

    @Override
    public AutomovelIdResponse postCadastraNovoVeiculo(AutomovelRequest automovelRequest) {
        log.info("[inicia] AutomovelRestController - postCadastraNovoVeiculo");
        AutomovelIdResponse automovel = service.cadastraNovoAutomovel(automovelRequest);
        log.info("[finaliza] AutomovelRestController - postCadastraNovoVeiculo");
        return automovel;
    }

    @Override
    public List<ListAutomoveisResponse> getListaTodosVeiculos() {
        log.info("[inicia] AutovomelRestController - getListaTodosVeiculos");
        List<ListAutomoveisResponse> lista = service.listaTodosVeiculos();
        log.info("[finaliza] AutovomelRestController - getListaTodosVeiculos");
        return lista;
    }

    @Override
    public DetalhaAutomovelResponse getDetalhaAutomovelResponse(Long idAutomovel) {
        log.info("[inicia] AutomovelResController - getDetalhaAutomovelResponse");

        log.info("[finaliza] AutomovelResController - getDetalhaAutomovelResponse");
        return null;
    }


}
