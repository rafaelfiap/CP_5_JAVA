package org.example.test;

import org.example.model.Cliente;
import org.example.model.Endereco;
import org.example.service.ClienteService;
import org.example.service.ClienteServiceImpl;
import org.example.dao.ClienteDaoImpl;

public class TesteCliente {  // Renomeie a classe para coincidir com o nome do arquivo

    public static void main(String[] args) {
        // Criando um endereço
        Endereco endereco = new Endereco("Rua das Flores", 123, "12345-678", "Centro", "São Paulo", "SP");

        // Criando um cliente
        Cliente cliente = new Cliente("123.456.789-00", "João da Silva", endereco, "1199999-9999", "joao.silva@email.com", 'M');

        // Exibindo os detalhes do cliente criado
        System.out.println("Cliente criado:");
        cliente.exibirDetalhes();

        // Criando uma instância do DAO e do serviço
        ClienteDaoImpl clienteDao = new ClienteDaoImpl();  // Implementação do DAO (em memória)
        ClienteService clienteService = new ClienteServiceImpl(clienteDao);  // Serviço utilizando o DAO

        // Registrando o cliente
        clienteService.registrarCliente(cliente);

        // Verificando o cliente registrado
        Cliente clienteBuscado = clienteService.buscarClientePorCpf(cliente.getCpf());
        if (clienteBuscado != null) {
            System.out.println("\nCliente registrado com sucesso:");
            clienteBuscado.exibirDetalhes();
        } else {
            System.out.println("Erro ao registrar o cliente.");
        }
    }
}
