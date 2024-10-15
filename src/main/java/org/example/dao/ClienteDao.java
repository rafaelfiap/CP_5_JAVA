package org.example.dao;

import org.example.model.Cliente;
import java.util.List;

/**
 * Interface ClienteDao que define os métodos de acesso a dados para a entidade Cliente.
 * Contém métodos para adicionar, buscar, listar, atualizar e remover clientes.
 *
 * Esta interface é responsável por isolar a camada de persistência da camada de lógica de negócios,
 * fornecendo uma API clara para as operações de CRUD (Create, Read, Update, Delete).
 *
 * @since 1.0
 * @version 1.0
 */
public interface ClienteDao {

    /**
     * Adiciona um novo cliente à base de dados.
     *
     * @param cliente Objeto Cliente a ser adicionado.
     */
    void adicionarCliente(Cliente cliente);

    /**
     * Busca um cliente específico pelo CPF.
     *
     * @param cpf O CPF do cliente que se deseja buscar.
     * @return O cliente encontrado, ou null se nenhum cliente com o CPF especificado for encontrado.
     */
    Cliente buscarClientePorCpf(String cpf);

    /**
     * Retorna uma lista com todos os clientes registrados.
     *
     * @return Lista de clientes.
     */
    List<Cliente> listarClientes();

    /**
     * Atualiza as informações de um cliente existente.
     *
     * @param cliente O cliente atualizado com as novas informações.
     */
    void atualizarCliente(Cliente cliente);

    /**
     * Remove um cliente da base de dados pelo CPF.
     *
     * @param cpf O CPF do cliente a ser removido.
     */
    void removerCliente(String cpf);
}
