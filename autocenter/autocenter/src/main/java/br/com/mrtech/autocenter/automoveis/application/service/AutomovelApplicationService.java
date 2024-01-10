package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.AutomovelIdResponse;
import br.com.mrtech.autocenter.automoveis.application.api.AutomovelRequest;
import br.com.mrtech.autocenter.automoveis.application.api.ListAutomoveisResponse;
import br.com.mrtech.autocenter.automoveis.application.repository.AutomovelRepository;
import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class AutomovelApplicationService implements AutomovelService{
    private final AutomovelRepository repository;

    @Override
    public AutomovelIdResponse cadastraNovoAutomovel(AutomovelRequest automovelRequest) {
        log.info("[inicia] AutomovelAplicationService - cadastraNovoAutomovel");
        Automovel automovel = repository.salva(new Automovel((automovelRequest)));
        log.info("[finaliza] AutomovelAplicationService - cadastraNovoAutomovel");
        return AutomovelIdResponse.builder().idAutomovel(automovel.getIdAutomovel()).build();
    }

    @Override
    public List<ListAutomoveisResponse> listaTodosVeiculos() {
        log.info("[inicia] AutomovelApplicationService - listaTodosVeiculos");
        List<Automovel> automovel = repository.buscaTodosVeiculos();
        log.info("[finaliza] AutomovelApplicationService - listaTodosVeiculos");
        return ListAutomoveisResponse.converte(automovel);
    }
}
