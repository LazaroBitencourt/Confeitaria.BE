package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import lombok.Getter;

import java.util.UUID;

@Getter
public class InformacoesDoCliente {
    private UUID idCliente;
    private String nome;
    private String telefone;


    public InformacoesDoCliente(Pedido pedido) {
        this.idCliente = pedido.getCliente().getIdCliente();
        this.nome = pedido.getCliente().getNome();
        this.telefone = pedido.getCliente().getTelefone();
    }
}
