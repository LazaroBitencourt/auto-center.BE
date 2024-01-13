package br.com.mrtech.autocenter.automoveis.domain;

import br.com.mrtech.autocenter.automoveis.application.api.AlteraInformacoesRequest;
import br.com.mrtech.autocenter.automoveis.application.api.AutomovelRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAutomovel;
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

    public void alteraTipoParaHatch() {
        this.tipo = TipoAutomovel.HATCH;
        this.dataHoraDaUltimaAtualizacao = LocalDate.now();
    }
}
