package br.com.mrtech.autocenter.automoveis.domain;

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
    private Long idCarro;
    @Enumerated(value = EnumType.STRING)
    private TipoAutomovel  tipo;
    @Enumerated(value = EnumType.STRING)
    private Marca marca;
    private String descricao;
    @NotBlank
    private String placa;
    private Boolean alugado = false;
    @NotNull
    private LocalDate anoFabricação;
    private LocalDateTime dataHoraCadastro;
    private LocalDate dataHoraDaUltimaAtualizacao;
    private int valorDiaria;
}
