package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.*;

import java.util.List;
import java.util.UUID;

public interface AutomovelService {
    AutomovelIdResponse cadastraNovoAutomovel(AutomovelRequest automovelRequest);

    List<ListAutomoveisResponse> listaTodosVeiculos();

    DetalhaAutomovelResponse DetalhaAutomovelResponse(UUID idAutomovel);

    void alteraInformacoesVeiculo(UUID idAutomovel, AlteraInformacoesRequest informacoesVeiculo);

    void alteraMarcaParaRenault(UUID idAutomovel);

    void alteraMarcaParaFiat(UUID idAutomovel);

    void alteraMarcaParaVolkswagen(UUID idAutomovel);

    void alteraMarcaParaHyundai(UUID idAutomovel);

    void alteraMarcaParaHonda(UUID idAutomovel);

    void alteraMarcaParaToyota(UUID idAutomovel);

    void alteraTipoParaMotocicleta(UUID idAutomovel);

    void alteraTipoParaSuv(UUID idAutomovel);

    void alteraTipoParaHatch(UUID idAutomovel);

    void alteraTipoParaSedan(UUID idAutomovel);

    void alteraTipoParaPicape(UUID idAutomovel);

    void alteraTipoParaMinivan(UUID idAutomovel);
    
    void alteraTipoParaCupe(UUID idAutomovel);

    void deletaAutomovelPorId(UUID idAutomovel);


}
