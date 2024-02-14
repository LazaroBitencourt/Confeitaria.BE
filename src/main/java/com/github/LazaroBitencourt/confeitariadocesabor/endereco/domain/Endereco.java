package com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
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
    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false, updatable = false)
    private Cliente cliente;
    @NotBlank
    private String logadouro;
    @NotBlank
    private String numero;
    @NotBlank
    private String bairro;
    private String complemento;
    @NotBlank
    private String cep;

    public Endereco(Cliente cliente, EnderecoRequest enderecoRequest) {
        this.cliente = cliente;
        this.logadouro = enderecoRequest.getLogadouro();
        this.numero = enderecoRequest.getNumero();
        this.bairro = enderecoRequest.getBairro();
        this.complemento = enderecoRequest.getComplemento();
        this.cep = enderecoRequest.getCep();
    }

    public void alteraInformacoesDoEndereco(AlteraEnderecoRequest informacoesDoEndereco) {
        this.logadouro = informacoesDoEndereco.getLogadouro();
        this.numero = informacoesDoEndereco.getNumero();
        this.bairro = informacoesDoEndereco.getBairro();
        this.complemento = informacoesDoEndereco.getComplemento();
        this.cep = informacoesDoEndereco.getCep();
    }

}
