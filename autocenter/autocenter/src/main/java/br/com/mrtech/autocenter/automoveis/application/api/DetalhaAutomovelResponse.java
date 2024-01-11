package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.domain.Marca;
import br.com.mrtech.autocenter.automoveis.domain.TipoAutomovel;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class DetalhaAutomovelResponse {

    private Long idAutomovel;
    private TipoAutomovel tipo;
    private Marca marca;
    private String descricao;
    private String placa;
    private Boolean alugado = false;
    private LocalDate anoFabricacao;
    private LocalDateTime dataHoraCadastro;
    private LocalDate dataHoraDaUltimaAtualizacao;
    private int valorDiaria;
}
