package org.example.service.impl;

import org.example.dao.ClienteDao;
import org.example.model.Cliente;
import org.example.service.ClienteService;

import java.util.Map;

/**
 * Implementação da interface ClienteService.
 * Esta classe contém a lógica de negócios para o gerenciamento de clientes no sistema de seguros.
 * Ela utiliza um ClienteDao para interagir com os dados persistidos, aplicando as regras de negócio adequadas
 * antes de delegar as operações CRUD ao DAO.
 *
 * @since 1.0
 * @version 1.3
 */
public class ClienteServiceImpl implements ClienteService {

    // Dependência ClienteDao injetada via construtor para interagir com a camada de persistência
    private final ClienteDao clienteDao;

    /**
     * Construtor da classe ClienteServiceImpl.
     * Recebe uma instância de ClienteDao para gerenciar os dados de clientes.
     *
     * @param clienteDao A instância de ClienteDao que será usada para persistência.
     */
    public ClienteServiceImpl(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    /**
     * Registra um novo cliente no sistema.
     * Este método valida as informações do cliente e, se estiverem corretas, delega ao DAO para persistência.
     *
     * @param cliente O cliente a ser registrado no sistema.
     * @throws IllegalArgumentException Se o cliente for nulo ou se o CPF for inválido.
     */
    @Override
    public void registrarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }
        if (cliente.getCpf() == null || cliente.getCpf().isEmpty()) {
            throw new IllegalArgumentException("CPF é obrigatório para registrar o cliente.");
        }
        // Chama o DAO para persistir o cliente após as validações
        clienteDao.adicionarCliente(cliente);
    }

    /**
     * Busca um cliente no sistema pelo CPF.
     * Este método consulta o DAO para recuperar os dados do cliente com base no CPF.
     *
     * @param cpf O CPF do cliente a ser buscado.
     * @return O cliente encontrado, ou null se o CPF não corresponder a nenhum cliente.
     * @throws IllegalArgumentException Se o CPF for inválido ou nulo.
     */
    @Override
    public Cliente buscarClientePorCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser nulo ou vazio.");
        }
        // Chama o DAO para buscar o cliente pelo CPF
        return clienteDao.buscarClientePorCpf(cpf);
    }

    /**
     * Retorna uma lista de todos os clientes registrados no sistema.
     *
     * @return Um mapa com o CPF como chave e o Cliente como valor.
     */
    @Override
    public Map<String, Cliente> listarClientes() {
        return clienteDao.listarClientes();
    }

    /**
     * Atualiza as informações de um cliente no sistema.
     * Antes de atualizar, valida os dados do cliente e garante que ele existe no sistema.
     *
     * @param cliente O cliente com as informações atualizadas.
     * @throws IllegalArgumentException Se o cliente for nulo ou se o CPF não estiver presente no sistema.
     */
    @Override
    public void atualizarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }
        // Verifica se o cliente já está registrado no sistema
        Cliente clienteExistente = clienteDao.buscarClientePorCpf(cliente.getCpf());
        if (clienteExistente == null) {
            throw new IllegalArgumentException("Cliente com CPF " + cliente.getCpf() + " não encontrado.");
        }
        // Chama o DAO para atualizar o cliente
        clienteDao.atualizarCliente(cliente);
    }

    /**
     * Remove um cliente do sistema pelo CPF.
     * Este método garante que o cliente exista antes de tentar removê-lo.
     *
     * @param cpf O CPF do cliente a ser removido.
     * @throws IllegalArgumentException Se o CPF for nulo ou se o cliente não for encontrado.
     */
    @Override
    public void removerCliente(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser nulo ou vazio.");
        }
        // Verifica se o cliente existe no sistema antes de tentar removê-lo
        Cliente clienteExistente = clienteDao.buscarClientePorCpf(cpf);
        if (clienteExistente == null) {
            throw new IllegalArgumentException("Cliente com CPF " + cpf + " não encontrado.");
        }
        // Chama o DAO para remover o cliente pelo CPF
        clienteDao.removerCliente(cpf);
    }

    /**
     * Calcula o desconto do cliente no valor do seguro.
     * A lógica de desconto varia conforme o histórico de sinistros do cliente.
     *
     * @param cliente O cliente para o qual o desconto será calculado.
     * @return O percentual de desconto que o cliente tem direito.
     * @throws IllegalArgumentException Se o cliente for inválido ou o CPF estiver nulo ou vazio.
     */
    @Override
    public double calcularDesconto(Cliente cliente) {
        if (cliente == null || cliente.getCpf() == null || cliente.getCpf().isEmpty()) {
            throw new IllegalArgumentException("Cliente inválido.");
        }

        // Verifica se o cliente possui sinistros
        boolean temSinistro = clienteDao.verificarSinistros(cliente.getCpf());

        // Aplica a lógica de desconto: 10% de desconto se não houver sinistros
        return temSinistro ? 0.0 : 0.10;  // 0% se tiver sinistro, 10% se não tiver.
    }
}
