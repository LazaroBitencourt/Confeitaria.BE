package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class EnderecoIdResponse {

    private UUID IdEndereco;
}
