package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Endereco;

import java.util.UUID;

public interface EnderecoRepository {

    Endereco salva(Endereco endereco);

    Endereco buscaEnderecoPorId(UUID idEndereco);

    void deletaEnderecoPorId(UUID idEndereco);
}
