package br.com.mrtech.autocenter.automoveis.application.api;

import lombok.Value;



@Value
public class AlteraInformacoes {

    private String descricao;
    private Boolean alugado = false;
    private int valorDiaria;

}
