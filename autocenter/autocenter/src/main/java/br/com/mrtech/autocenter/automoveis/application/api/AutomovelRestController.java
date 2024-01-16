package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.application.service.AutomovelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AutomovelRestController implements AutomovelAPI{

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
    public DetalhaAutomovelResponse getDetalhaAutomovel(UUID idAutomovel) {
        log.info("[inicia] AutomovelResController - getDetalhaAutomovelResponse");
        DetalhaAutomovelResponse detalhes = service.DetalhaAutomovelResponse(idAutomovel);
        log.info("[finaliza] AutomovelResController - getDetalhaAutomovelResponse");
        return detalhes;
    }

    @Override
    public void getAlteraInformacoesVeiculo(UUID idAutomovel, AlteraInformacoesRequest informacoesVeiculo) {
        log.info("[inicia] AutomovelRestController - getAlteraInformacoesVeiculo ");
        service.alteraInformacoesVeiculo(idAutomovel, informacoesVeiculo);
        log.info("[finaliza] AutomovelRestController - getAlteraInformacoesVeiculo ");
    }

    @Override
    public void getAlteraMarcaParaRenault(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraMarcaParaRenault");
        service.alteraMarcaParaRenault(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraMarcaParaRenault");
    }

    @Override
    public void getAlteraMarcaParaFiat(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraMarcaParaFiat");
        service.alteraMarcaParaFiat(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraMarcaParaFiat");
    }

    @Override
    public void getAlteraMarcaParaVolkswagen(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraMarcaParaVolkswagen" );
        service.alteraMarcaParaVolkswagen(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraMarcaParaVolkswagen" );
    }

    @Override
    public void getAlteraMarcaParaHyundai(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraMarcaParaHyundai");
        service.alteraMarcaParaHyundai(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraMarcaParaHyundai");
    }

    @Override
    public void getAlteraMarcaParaHonda(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraMarcaParaHonda");
        service.alteraMarcaParaHonda(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraMarcaParaHonda");
    }

    @Override
    public void getAlteraMarcaParaToyota(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraMarcaParaToyota");
        service.alteraMarcaParaToyota(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraMarcaParaToyota");
    }

    @Override
    public void getAlteraTipoParaMotocicleta(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraTipoParaMotocicleta");
        service.alteraTipoParaMotocicleta(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraTipoParaMotocicleta");
    }

    public void getAlteraTipoParaSuv(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraTipoParaSuv");
        service.alteraTipoParaSuv(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraTipoParaSuv");
    }

    public void getAlteraTipoParaHatch(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraTipoHatch");
        service.alteraTipoParaHatch(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraTipoHatch");
    }

    public void getAlteraTipoParaSedan(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraTipoParaSedan");
        service.alteraTipoParaSedan(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraTipoParaSedan");

    }

    @Override
    public void getAlteraTipoParaMinivan(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getAlteraTipoParaMinivan");
        service.alteraTipoParaMinivan(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getAlteraTipoParaMinivan");
    }

    public void deleteAutomovelPorId(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - deleteAutomovelPorId" );
        service.deletaAutomovelPorId(idAutomovel);
        log.info("[finaliza] AutomovelRestController - deleteAutomovelPorId" );

    }

}
