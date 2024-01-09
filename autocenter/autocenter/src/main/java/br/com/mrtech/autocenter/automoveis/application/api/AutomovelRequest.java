package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.domain.Marca;
import br.com.mrtech.autocenter.automoveis.domain.TipoAutomovel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class AutomovelRequest {

   @NotNull
    private TipoAutomovel tipo;
    @NotNull
    private Marca marca;
    @Size(min = 20, message = "A descricao deve ter no minimo 20 caracteres")
    private String descricao;
    @NotBlank
    private String placa;
    private Boolean alugado = false;
    @NotNull
    private int valorDiaria;
    @NotNull
    private LocalDate anoFabricacao;


}
