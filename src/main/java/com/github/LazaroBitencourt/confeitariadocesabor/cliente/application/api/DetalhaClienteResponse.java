package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;
import lombok.Getter;

@Getter
public class DetalhaClienteResponse {

    private String nome;
    private String telefone;
    private ClienteEndereco endereco;

    public DetalhaClienteResponse(Cliente cliente) {
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.endereco = new ClienteEndereco(cliente.getEndereco());
    }

    private class ClienteEndereco {

        private String logadouro;
        private String numero;
        private String bairro;
        private String complemento;
        private String cep;

        public ClienteEndereco(Endereco endereco) {
            this.logadouro = endereco.getLogadouro();
            this.numero = endereco.getNumero();
            this.bairro = endereco.getBairro();
            this.complemento = endereco.getComplemento();
            this.cep = endereco.getCep();
        }
    }

}
