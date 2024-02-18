package com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "cliente_id", unique = true, updatable = false)
    private UUID idCliente;
    @NotBlank
    private String nome;
    @NotNull
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", nullable = false, updatable = false)
    private Endereco endereco;

    public Cliente(ClienteRequest clienteRequest, Endereco endereco) {
        this.nome = clienteRequest.getNome();
        this.telefone = clienteRequest.getTelefone();
        this.endereco = endereco;
    }

}
