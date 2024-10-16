package org.example.service;

import org.example.model.Cliente;
import java.util.Map;

/**
 * Interface que define as operações de negócios relacionadas ao cliente.
 * Lida com a lógica de negócios como cálculo de descontos e gerenciamento de clientes.
 *
 * @since 1.0
 * @version 1.0
 */
public interface ClienteService {

    /**
     * Registra um novo cliente no sistema.
     *
     * @param cliente Cliente a ser registrado.
     */
    void registrarCliente(Cliente cliente);

    /**
     * Busca um cliente pelo CPF.
     *
     * @param cpf CPF do cliente.
     * @return Cliente correspondente ou null se não encontrado.
     */
    Cliente buscarClientePorCpf(String cpf);

    /**
     * Retorna todos os clientes cadastrados no sistema.
     *
     * @return Um mapa contendo todos os clientes.
     */
    Map<String, Cliente> listarClientes();

    /**
     * Atualiza as informações de um cliente.
     *
     * @param cliente Cliente atualizado.
     */
    void atualizarCliente(Cliente cliente);

    /**
     * Remove um cliente pelo CPF.
     *
     * @param cpf CPF do cliente a ser removido.
     */
    void removerCliente(String cpf);

    double calcularDesconto(Cliente cliente);
}
