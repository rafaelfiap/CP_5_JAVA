package org.example.dao;

import org.example.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface ClienteDao.
 * Esta classe simula a persistência de dados em memória utilizando uma lista de clientes.
 *
 * Métodos fornecidos permitem realizar as operações CRUD (Create, Read, Update, Delete)
 * para a entidade Cliente.
 *
 * @since 1.0
 * @version 1.1
 */
public class ClienteDaoImpl implements ClienteDao {

    // Lista para armazenar os clientes em memória
    private List<Cliente> clientes = new ArrayList<>();

    /**
     * Adiciona um novo cliente à lista de clientes.
     *
     * @param cliente O cliente a ser adicionado.
     */
    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Busca um cliente pelo CPF.
     *
     * @param cpf O CPF do cliente a ser buscado.
     * @return O cliente encontrado, ou null se nenhum cliente com o CPF especificado for encontrado.
     */
    @Override
    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Retorna uma lista com todos os clientes registrados.
     *
     * @return Lista de clientes.
     */
    @Override
    public List<Cliente> listarClientes() {
        return clientes;
    }

    /**
     * Atualiza as informações de um cliente existente na lista.
     * Se o cliente não for encontrado, nenhuma ação é realizada.
     *
     * @param cliente O cliente atualizado com as novas informações.
     */
    @Override
    public void atualizarCliente(Cliente cliente) {
        Cliente clienteExistente = buscarClientePorCpf(cliente.getCpf());
        if (clienteExistente != null) {
            clientes.remove(clienteExistente);
            clientes.add(cliente);
        }
    }

    /**
     * Remove um cliente da lista pelo CPF.
     *
     * @param cpf O CPF do cliente a ser removido.
     */
    @Override
    public void removerCliente(String cpf) {
        Cliente cliente = buscarClientePorCpf(cpf);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }
}
