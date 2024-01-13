package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.*;

import java.util.List;

public interface AutomovelService {
    AutomovelIdResponse cadastraNovoAutomovel(AutomovelRequest automovelRequest);

    List<ListAutomoveisResponse> listaTodosVeiculos();

    DetalhaAutomovelResponse DetalhaAutomovelResponse(Long idAutomovel);

    void alteraInformacoesVeiculo(Long idAutomovel, AlteraInformacoesRequest informacoesVeiculo);

    void alteraMarcaParaRenault(Long idAutomovel);

    void alteraMarcaParaFiat(Long idAutomovel);

    void alteraMarcaParaVolkswagen(Long idAutomovel);

    void alteraTipoParaMotocicleta(Long idAutomovel);
}
