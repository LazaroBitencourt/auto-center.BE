package br.com.mrtech.autocenter.automoveis.application.api;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class AutomovelIdResponse {
    private Long idAutomovel;
}
