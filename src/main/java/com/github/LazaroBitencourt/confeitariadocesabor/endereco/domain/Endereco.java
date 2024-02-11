package com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
    @OneToMany
    @Column(name = "cliente_id",updatable = false)
    private Cliente cliente;
    @NotBlank
    private String logadouro;
    @NotBlank
    @Size(min = 2)
    private String numero;
    @NotBlank
    private String bairro;
    @NotBlank
    @Size(min = 8, max = 8)
    private String cep;
}
