package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.*;
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

    @Override
    public DetalhaAutomovelResponse DetalhaAutomovelResponse(Long idAutomovel) {
        log.info("[inicia] AutomovelApplication - DetalhaAutomovelResponse");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        log.info("[finaliza] AutomovelApplication - DetalhaAutomovelResponse");
        return new DetalhaAutomovelResponse(automovel);
    }

    @Override
    public void alteraInformacoesVeiculo(Long idAutomovel, AlteraInformacoesRequest informacoesVeiculo) {
        log.info("[inicia] AutomovelApplication - alteraInformacoesVeiculo");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraResquest(informacoesVeiculo);
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplication - alteraInformacoesVeiculo");
    }

    @Override
    public void alteraMarcaParaRenault(Long idAutomovel) {
        log.info("[inicia] AutomovelApplication - alteraMarcaParaRenault");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaRenault();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplication - alteraMarcaParaRenault");
    }

    @Override
    public void alteraMarcaParaFiat(Long idAutomovel) {
        log.info("[inicia] AutomovelApplication - alteraMarcaParaFiat");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaFiat();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplication - alteraMarcaParaFiat");
    }

    @Override
    public void alteraMarcaParaVolkswagen(Long idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - alteraMarcaParaVolkswagen");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaVolkswagen();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplicationService - alteraMarcaParaVolkswagen");

    }

    @Override
    public void alteraTipoParaSedan(Long idAutomovel) {
        log.info("[inicia] AutomovelAplicationService - alteraTipoParaSedan");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraTipoSedan(automovel);
        repository.salva(automovel);
        log.info("[inicia] AutomovelAplicationService - alteraTipoParaSedan");
    }


}
