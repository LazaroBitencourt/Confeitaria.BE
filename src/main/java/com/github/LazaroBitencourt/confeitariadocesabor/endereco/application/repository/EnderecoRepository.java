package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;

public interface EnderecoRepository {
    Endereco salva(Endereco endereco);
}
