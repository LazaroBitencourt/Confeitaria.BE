package com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.AlteraEnderecoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.EnderecoRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID",name = "endereco_id", unique = true, updatable = false)
    private UUID idEndereco;
    @NotBlank
    private String logadouro;
    @NotBlank
    private String numero;
    @NotBlank
    private String bairro;
    private String complemento;
    @NotBlank
    private String cep;

    public Endereco(EnderecoRequest enderecoRequest) {
        this.logadouro = enderecoRequest.getLogadouro();
        this.numero = enderecoRequest.getNumero();
        this.bairro = enderecoRequest.getBairro();
        this.complemento = enderecoRequest.getComplemento();
        this.cep = enderecoRequest.getCep();
    }

    public Endereco(ClienteRequest clienteRequest) {
        this.logadouro = clienteRequest.getEndereco().getLogadouro();
        this.numero = clienteRequest.getEndereco().getNumero();
        this.bairro = clienteRequest.getEndereco().getBairro();
        this.complemento = clienteRequest.getEndereco().getComplemento();
        this.cep = clienteRequest.getEndereco().getCep();
    }

    public void alteraInformacoesDoEndereco(AlteraEnderecoRequest informacoesDoEndereco) {
        this.logadouro = informacoesDoEndereco.getLogadouro();
        this.numero = informacoesDoEndereco.getNumero();
        this.bairro = informacoesDoEndereco.getBairro();
        this.complemento = informacoesDoEndereco.getComplemento();
        this.cep = informacoesDoEndereco.getCep();
    }

}
