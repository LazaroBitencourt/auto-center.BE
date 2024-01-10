package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.AutomovelIdResponse;
import br.com.mrtech.autocenter.automoveis.application.api.AutomovelRequest;
import br.com.mrtech.autocenter.automoveis.application.repository.AutomovelRepository;
import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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
}
