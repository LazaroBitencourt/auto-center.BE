package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.*;
import br.com.mrtech.autocenter.automoveis.application.repository.AutomovelRepository;
import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
    public DetalhaAutomovelResponse DetalhaAutomovelResponse(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplication - DetalhaAutomovelResponse");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        log.info("[finaliza] AutomovelApplication - DetalhaAutomovelResponse");
        return new DetalhaAutomovelResponse(automovel);
    }

    @Override
    public void alteraInformacoesVeiculo(UUID idAutomovel, AlteraInformacoesRequest informacoesVeiculo) {
        log.info("[inicia] AutomovelApplication - alteraInformacoesVeiculo");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraResquest(informacoesVeiculo);
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplication - alteraInformacoesVeiculo");
    }

    @Override
    public void alteraMarcaParaRenault(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplication - alteraMarcaParaRenault");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaRenault();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplication - alteraMarcaParaRenault");
    }

    @Override
    public void alteraMarcaParaFiat(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplication - alteraMarcaParaFiat");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaFiat();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplication - alteraMarcaParaFiat");
    }

    @Override
    public void alteraMarcaParaVolkswagen(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - alteraMarcaParaVolkswagen");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaVolkswagen();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplicationService - alteraMarcaParaVolkswagen");

    }

    @Override
    public void alteraMarcaParaHonda(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - alteraMarcaParaHonda");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaHonda();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplicationService - alteraMarcaParaHonda");
    }

    @Override
    public void alteraMarcaParaToyota(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - alteraMarcaParaToyota");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaToyota();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplicationService - alteraMarcaParaToyota");
    }

    @Override
    public void alteraTipoParaMotocicleta(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - alteraTipoParaMotocicleta");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaMotocicleta();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplicationService - alteraTipoParaMotocicleta");
    }

    public void alteraTipoParaSuv(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - alteraTipoParaSuv");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaSuv();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplicationService - alteraTipoParaSuv");
    }

    public void alteraTipoParaHatch(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - alteraTipoParaHatch");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaHatch();
        repository.salva(automovel);
        log.info("[finaliza] AutomovelApplicationService - alteraTipoParaHatch");
    }

    public void alteraTipoParaSedan(UUID idAutomovel) {
        log.info("[inicia] AutomovelAplicationService - alteraTipoParaSedan");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraParaSedan();
        repository.salva(automovel);
        log.info("[inicia] AutomovelAplicationService - alteraTipoParaSedan");
    }

    public void deletaAutomovelPorId(UUID idAutomovel) {
        log.info("[inicia] AutomovelApplicationService - deletaAutomovelPorId");
        repository.buscaAutomovelId(idAutomovel);
        repository.deletaAutomovelPorId(idAutomovel);
        log.info("[finaliza] AutomovelApplicationService - deletaAutomovelPorId");

    }

}
