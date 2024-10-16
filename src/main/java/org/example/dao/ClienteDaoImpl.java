package org.example.dao;

import org.example.model.Cliente;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementação da interface ClienteDao.
 * Utiliza um HashMap para armazenar os clientes simulando a persistência de dados.
 * Inclui um método para verificar sinistros associados ao cliente.
 *
 * @since 1.0
 * @version 1.1
 */
public class ClienteDaoImpl implements ClienteDao {

    // Simulação de um banco de dados usando HashMap
    private Map<String, Cliente> clientes = new HashMap<>();

    /**
     * Adiciona um novo cliente ao sistema.
     *
     * @param cliente O cliente a ser adicionado.
     */
    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);  // Adiciona o cliente ao HashMap
    }

    /**
     * Busca um cliente pelo CPF.
     *
     * @param cpf O CPF do cliente.
     * @return O cliente correspondente ou null se não encontrado.
     */
    @Override
    public Cliente buscarClientePorCpf(String cpf) {
        return clientes.get(cpf);  // Retorna o cliente pelo CPF ou null se não encontrado
    }

    /**
     * Retorna todos os clientes cadastrados no sistema.
     *
     * @return Um mapa contendo todos os clientes, onde a chave é o CPF e o valor é o objeto Cliente.
     */
    @Override
    public Map<String, Cliente> listarClientes() {
        return clientes;  // Retorna o mapa completo de clientes
    }

    /**
     * Atualiza os dados de um cliente no sistema.
     *
     * @param cliente Cliente com as informações atualizadas.
     */
    @Override
    public void atualizarCliente(Cliente cliente) {
        if (clientes.containsKey(cliente.getCpf())) {
            clientes.put(cliente.getCpf(), cliente);  // Atualiza o cliente no HashMap
        }
    }

    /**
     * Remove um cliente pelo CPF.
     *
     * @param cpf CPF do cliente a ser removido.
     */
    @Override
    public void removerCliente(String cpf) {
        clientes.remove(cpf);  // Remove o cliente pelo CPF
    }

    /**
     * Verifica se o cliente tem algum sinistro associado.
     *
     * @param cpf CPF do cliente a ser verificado.
     * @return true se o cliente tem sinistro, false caso contrário.
     */
    @Override
    public boolean verificarSinistros(String cpf) {
        // Neste exemplo, assumimos que o sinistro está associado ao cliente de forma simples
        // Aqui, o cliente poderia ter uma lista de sinistros. Para simplicidade, retornamos false.
        return false;  // Implementação fictícia, ajustar conforme necessário
    }
}
