package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.domain.Automovel;
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
    private int valorDiaria;
    private LocalDateTime dataHoraCadastro;
    private LocalDate dataHoraDaUltimaAtualizacao;



    public DetalhaAutomovelResponse(Automovel automovel) {
        this.idAutomovel = automovel.getIdAutomovel();
        this.tipo = automovel.getTipo();
        this.marca = automovel.getMarca();
        this.descricao = automovel.getDescricao();
        this.placa = automovel.getPlaca();
        this.alugado = automovel.getAlugado();
        this.anoFabricacao = automovel.getAnoFabricacao();
        this.dataHoraCadastro = automovel.getDataHoraCadastro();
        this.dataHoraDaUltimaAtualizacao = automovel.getDataHoraDaUltimaAtualizacao();
        this.valorDiaria = automovel.getValorDiaria();
    }
}
