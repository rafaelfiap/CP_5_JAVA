package org.example.service;

import org.example.model.Cliente;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface ClienteService.
 * Contém a lógica de negócios para o gerenciamento de clientes, incluindo o registro,
 * atualização, exclusão, busca, e cálculo de descontos para clientes.
 *
 * @since 1.0
 * @version 1.1
 */
public class ClienteServiceImpl implements ClienteService {

    // Lista que simula a persistência dos clientes em memória
    private List<Cliente> clientesRegistrados;

    /**
     * Construtor que inicializa a lista de clientes.
     */
    public ClienteServiceImpl() {
        this.clientesRegistrados = new ArrayList<>();
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        clientesRegistrados.add(cliente);
        return cliente;  // Retorna o cliente registrado
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        // Busca o cliente pelo CPF e atualiza suas informações
        Cliente clienteExistente = buscarPorCpf(cliente.getCpf());
        if (clienteExistente != null) {
            clientesRegistrados.remove(clienteExistente);
            clientesRegistrados.add(cliente);
        }
    }

    @Override
    public void excluirCliente(String cpf) {
        // Remove o cliente da lista com base no CPF
        Cliente cliente = buscarPorCpf(cpf);
        if (cliente != null) {
            clientesRegistrados.remove(cliente);
        }
    }

    @Override
    public Cliente buscarPorCpf(String cpf) {
        // Busca e retorna o cliente com o CPF fornecido
        for (Cliente cliente : clientesRegistrados) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> listarClientes() {
        return clientesRegistrados;  // Retorna a lista de clientes registrados
    }

    @Override
    public double calcularDesconto(Cliente cliente) {
        // Calcula a idade do cliente com base na data de nascimento
        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(cliente.getDataNascimento(), dataAtual).getYears();

        // Calcula desconto baseado em fatores como idade e tempo de relacionamento
        double desconto = 0;

        // Desconto por idade
        if (idade >= 60) {
            desconto += 0.10;  // 10% de desconto para maiores de 60 anos
        } else if (idade >= 30) {
            desconto += 0.05;  // 5% de desconto para clientes de 30 a 59 anos
        }

        // Desconto por tempo de relacionamento com a empresa
        int anosDeRelacionamento = Period.between(cliente.getDataCadastro(), dataAtual).getYears();
        if (anosDeRelacionamento >= 5) {
            desconto += 0.10;  // 10% de desconto para clientes com mais de 5 anos de relacionamento
        } else if (anosDeRelacionamento >= 1) {
            desconto += 0.05;  // 5% de desconto para clientes com 1 a 4 anos de relacionamento
        }

        // Garante que o desconto não ultrapasse 20%
        return Math.min(desconto, 0.20);
    }

    @Override
    public boolean verificarElegibilidade(Cliente cliente) {
        // Regras simples de elegibilidade para seguro
        int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
        return idade >= 18 && idade <= 75;  // Clientes entre 18 e 75 anos são elegíveis
    }
}
