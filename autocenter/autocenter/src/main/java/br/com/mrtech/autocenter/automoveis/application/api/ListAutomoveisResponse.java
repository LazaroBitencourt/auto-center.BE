package br.com.mrtech.autocenter.automoveis.application.api;


import br.com.mrtech.autocenter.automoveis.domain.TipoAutomovel;
import lombok.Getter;

@Getter
public class ListAutomoveisResponse {

    private Long idAutomovel;
    private TipoAutomovel tipo;
    private String placa;
    private int valorDiaria;
}
