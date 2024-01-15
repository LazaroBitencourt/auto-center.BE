package br.com.mrtech.autocenter.automoveis.application.api;

import lombok.Value;

@Value
public class AlteraInformacoesRequest {

    private String descricao;
    private Boolean alugado = false;
    private int valorDiaria;

}
