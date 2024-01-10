package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.AutomovelIdResponse;
import br.com.mrtech.autocenter.automoveis.application.api.AutomovelRequest;

public interface AutomovelService {
    AutomovelIdResponse cadastraNovoAutomovel(AutomovelRequest automovelRequest);
}
