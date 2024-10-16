package org.example.dao;

import org.example.dao.ClienteDao;
import org.example.model.Cliente;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementação da interface ClienteDao.
 * Utiliza um HashMap para armazenar os clientes simulando a persistência de dados.
 *
 * @since 1.0
 * @version 1.0
 */
public class ClienteDaoImpl implements ClienteDao {

    // Simulação de um banco de dados usando HashMap
    private Map<String, Cliente> clientes = new HashMap<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);  // Adiciona o cliente ao HashMap
    }

    @Override
    public Cliente buscarClientePorCpf(String cpf) {
        return clientes.get(cpf);  // Retorna o cliente pelo CPF ou null se não encontrado
    }

    @Override
    public Map<String, Cliente> listarClientes() {
        return clientes;  // Retorna o mapa completo de clientes
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        if (clientes.containsKey(cliente.getCpf())) {
            clientes.put(cliente.getCpf(), cliente);  // Atualiza o cliente no HashMap
        }
    }

    @Override
    public void removerCliente(String cpf) {
        clientes.remove(cpf);  // Remove o cliente pelo CPF
    }
}

