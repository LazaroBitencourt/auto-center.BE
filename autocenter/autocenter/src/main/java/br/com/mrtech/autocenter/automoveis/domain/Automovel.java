package br.com.mrtech.autocenter.automoveis.domain;

import br.com.mrtech.autocenter.automoveis.application.api.AlteraInformacoesRequest;
import br.com.mrtech.autocenter.automoveis.application.api.AutomovelRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idAutomovel", unique = true, nullable = false)
    private UUID idAutomovel;
    @Enumerated(value = EnumType.STRING)
    private TipoAutomovel  tipo;
    @Enumerated(value = EnumType.STRING)
    private Marca marca;
    private String descricao;
    @NotBlank
    @Column(unique = true)
    private String placa;
    private Boolean alugado = false;
    @NotNull
    private LocalDate anoFabricacao;
    private int valorDiaria;
    private LocalDateTime dataHoraCadastro;
    private LocalDate dataHoraDaUltimaAtualizacao;


    public Automovel(AutomovelRequest automovelRequest) {
        this.tipo = automovelRequest.getTipo();
        this.marca = automovelRequest.getMarca();
        this.descricao = automovelRequest.getDescricao();
        this.placa = automovelRequest.getPlaca();
        this.alugado = automovelRequest.getAlugado();
        this.anoFabricacao = automovelRequest.getAnoFabricacao();
        this.valorDiaria = automovelRequest.getValorDiaria();
        this.dataHoraCadastro = LocalDateTime.now();

    }

    public void alteraResquest(AlteraInformacoesRequest informacoesVeiculo) {
        this.descricao = informacoesVeiculo.getDescricao();
        this.alugado = informacoesVeiculo.getAlugado();
        this.valorDiaria = informacoesVeiculo.getValorDiaria();
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaRenault() {
        this.marca = Marca.RENAULT;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaFiat() {
        this.marca = Marca.FIAT;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaVolkswagen() {
        this.marca = Marca.VOLKSWAGEN;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaHyundai() {
        this.marca = Marca.HYUNDAI;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaHonda() {
        this.marca = Marca.HONDA;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }
    public void alteraParaToyota() {
        this.marca = Marca.TOYOTA;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaMotocicleta() {
        this.tipo = TipoAutomovel.MOTOCICLETA;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }
    public void alteraParaSuv() {
        this.tipo = TipoAutomovel.SUV;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaHatch() {
        this.tipo = TipoAutomovel.HATCH;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaSedan() {
        this.tipo = TipoAutomovel.SEDAN;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaPicape() {
        this.tipo = TipoAutomovel.PICAPE;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaMinivan() {
        this.tipo = TipoAutomovel.MINIVAN;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }

    public void alteraParaCupe() {
        this.tipo = TipoAutomovel.CUPE;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }
}
