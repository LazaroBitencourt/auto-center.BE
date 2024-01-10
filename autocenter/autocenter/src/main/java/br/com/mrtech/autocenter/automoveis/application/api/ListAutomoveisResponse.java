package br.com.mrtech.autocenter.automoveis.application.api;


import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import br.com.mrtech.autocenter.automoveis.domain.TipoAutomovel;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ListAutomoveisResponse {

    private Long idAutomovel;
    private TipoAutomovel tipo;
    private String placa;
    private int valorDiaria;

    public static List<ListAutomoveisResponse> converte(List<Automovel> automovel) {
        return automovel.stream().map(ListAutomoveisResponse::new).collect(Collectors.toList());
    }

    public ListAutomoveisResponse(Automovel automovel) {
        this.idAutomovel = automovel.getIdAutomovel();
        this.tipo = automovel.getTipo();
        this.placa = automovel.getPlaca();
        this.valorDiaria = automovel.getValorDiaria();
    }
}
