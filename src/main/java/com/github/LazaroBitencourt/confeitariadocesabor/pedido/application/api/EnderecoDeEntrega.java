package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import lombok.Getter;

@Getter
public class EnderecoDeEntrega {
    private String logadouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;

    public EnderecoDeEntrega(Pedido pedido) {
        this.logadouro = pedido.getCliente().getEndereco().getLogadouro();
        this. numero = pedido.getCliente().getEndereco().getNumero();
        this.bairro = pedido.getCliente().getEndereco().getBairro();
        this.complemento = pedido.getCliente().getEndereco().getComplemento();
        this.cep = pedido.getCliente().getEndereco().getCep();
    }
}
