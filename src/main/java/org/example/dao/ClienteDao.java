package org.example.dao;

import org.example.model.Cliente;
import java.util.Map;

/**
 * Interface que define as operações de persistência para a entidade Cliente.
 * Operações CRUD são definidas para adicionar, buscar, atualizar e remover clientes.
 *
 * @since 1.0
 * @version 1.0
 */
public interface ClienteDao {

    /**
     * Adiciona um novo cliente ao sistema.
     *
     * @param cliente O cliente a ser adicionado.
     */
    void adicionarCliente(Cliente cliente);

    /**
     * Busca um cliente pelo CPF.
     *
     * @param cpf O CPF do cliente.
     * @return O cliente correspondente ou null se não encontrado.
     */
    Cliente buscarClientePorCpf(String cpf);

    /**
     * Retorna todos os clientes cadastrados no sistema.
     *
     * @return Um mapa contendo todos os clientes, onde a chave é o CPF e o valor é o objeto Cliente.
     */
    Map<String, Cliente> listarClientes();

    /**
     * Atualiza os dados de um cliente.
     *
     * @param cliente Cliente com as informações atualizadas.
     */
    void atualizarCliente(Cliente cliente);

    /**
     * Remove um cliente pelo CPF.
     *
     * @param cpf CPF do cliente a ser removido.
     */
    void removerCliente(String cpf);
}



