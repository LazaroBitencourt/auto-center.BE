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

    private TipoAutomovel tipo;
    private Marca marca;
    private String descricao;
    private String placa;
    private Boolean alugado = false;
    private int valorDiaria;
    private LocalDate anoFabricação;


}
