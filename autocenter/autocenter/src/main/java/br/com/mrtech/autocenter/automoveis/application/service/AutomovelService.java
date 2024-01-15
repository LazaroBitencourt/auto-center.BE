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


    void alteraTipoParaHatch(UUID idAutomovel);


    void alteraTipoParaSedan(UUID idAutomovel);


    void deletaAutomovelPorId(UUID idAutomovel);

}
