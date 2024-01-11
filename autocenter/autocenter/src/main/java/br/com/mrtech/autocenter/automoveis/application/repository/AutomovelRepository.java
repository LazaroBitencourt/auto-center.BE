package br.com.mrtech.autocenter.automoveis.application.repository;

import br.com.mrtech.autocenter.automoveis.domain.Automovel;

import java.util.List;

public interface AutomovelRepository {
    Automovel salva(Automovel automovel);

    List<Automovel> buscaTodosVeiculos();

    Automovel buscaAutomovelId(Long idAutomovel);
}
