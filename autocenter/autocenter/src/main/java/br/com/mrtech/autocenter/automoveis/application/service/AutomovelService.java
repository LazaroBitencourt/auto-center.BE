package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.AutomovelIdResponse;
import br.com.mrtech.autocenter.automoveis.application.api.AutomovelRequest;
import br.com.mrtech.autocenter.automoveis.application.api.DetalhaAutomovelResponse;
import br.com.mrtech.autocenter.automoveis.application.api.ListAutomoveisResponse;

import java.util.List;

public interface AutomovelService {
    AutomovelIdResponse cadastraNovoAutomovel(AutomovelRequest automovelRequest);

    List<ListAutomoveisResponse> listaTodosVeiculos();

    DetalhaAutomovelResponse DetalhaAutomovelResponse(Long idAutomovel);

}
