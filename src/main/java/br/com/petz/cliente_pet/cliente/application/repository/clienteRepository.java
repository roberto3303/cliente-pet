package br.com.petz.cliente_pet.cliente.application.repository;

import br.com.petz.cliente_pet.cliente.domain.Cliente;

public interface clienteRepository {
    Cliente salva(Cliente cliente);
}
