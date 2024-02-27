package com.github.LazaroBitencourt.confeitariadocesabor.pedido.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.repository.PedidoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PedidoJpaRepository implements PedidoRepository {

    private final PedidoSpringDataJpaRepository jpaRepository;

    @Override
    public Pedido salva(Pedido novoPedido) {
        log.info("[inicia] PedidoJpaRepository - salva");
        try {
            jpaRepository.save(novoPedido);
        }catch(DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"EXISTE DADOS DUPLICADOS", e);
        }
        log.info("[finaliza] PedidoJpaRepository - salva");
        return novoPedido;
    }

    @Override
    public Pedido buscaPedidoPorId(UUID idPedido) {
        log.info("[inicia] PedidoJpaRepository - buscaPedidoPorId");
        Pedido pedido = jpaRepository.findById(idPedido).orElseThrow(()
        -> APIException.build(HttpStatus.NOT_FOUND,"PEDIDO NAO ENCONTRADO OU " +
                "NAO EXISTE! !INSIRA UM ID VALIDO OU INFORME AO ADM DO SISTEMA!"));
        log.info("[finaliza] PedidoJpaRepository - buscaPedidoPorId");
        return pedido;
    }

    @Override
    public List<Pedido> buscaPedidosDoClientePorIdCliente(UUID idCliente) {
        log.info("[inicia] PedidoJpaRepository - buscaPedidosDoClientePorIdCliente");
        List<Pedido> listaDePedidos = jpaRepository.findAllOrderByIdClient(idCliente);
        log.info("[finaliza] PedidoJpaRepository - buscaPedidosDoClientePorIdCliente");
        return listaDePedidos;
    }

    @Override
    public void deletaPedidoPorId(UUID idPedido) {
        log.info("[inicia] PedidoJpaRepository - deletaPedidoPorId");
        jpaRepository.deleteById(idPedido);
        log.info("[finaliza] PedidoJpaRepository - deletaPedidoPorId");
    }

    @Override
    public List<Pedido> buscaTodosPedidos() {
        log.info("[inicia] PedidoJpaRepository - buscaTodosPedidos");
        List<Pedido> listaDePedidos = jpaRepository.findAll();
        log.info("[finaliza] PedidoJpaRepository - buscaTodosPedidos");
        return listaDePedidos;
    }

}
