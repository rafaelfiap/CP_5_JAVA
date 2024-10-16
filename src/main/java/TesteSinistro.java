package org.example.test;

import org.example.dao.SinistroDao;
import org.example.dao.SinistroDaoImpl;
import org.example.factory.ApoliceFactory;
import org.example.model.Apolice;
import org.example.model.Cliente;
import org.example.model.Endereco;
import org.example.model.Sinistro;
import org.example.model.Veiculo;
import org.example.model.TipoVeiculo;
import org.example.service.SinistroService;
import org.example.service.SinistroServiceImpl;
import org.example.factory.VeiculoFactory;

import java.time.LocalDate;

/**
 * Classe de teste para Sinistro.
 * Testa a criação, registro, busca e remoção de sinistros utilizando as camadas de serviço e DAO.
 */
public class TesteSinistro {

    public static void main(String[] args) {
        // Criar endereço fictício para o cliente
        Endereco endereco = new Endereco("Rua das Flores", 123, "12345-678", "Centro", "São Paulo", "SP");

        // Criar cliente fictício
        Cliente cliente = new Cliente("123.456.789-00", "João Silva", endereco, "123456789", "joao@email.com", 'M');

        // Criar veículo fictício usando a fábrica
        Veiculo veiculo = VeiculoFactory.criarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2015, null, "Gasolina");

        // Criar uma apólice fictícia usando a fábrica
        Apolice apolice = ApoliceFactory.criarApolice("001", cliente, veiculo, LocalDate.now(), LocalDate.now().plusYears(1));

        // Criar um sinistro fictício, agora na ordem correta (Apolice vem antes de Endereco)
        Sinistro sinistro1 = new Sinistro("SIN001", LocalDate.now(), cliente, apolice, endereco);

        // Criar instâncias da DAO e do serviço de Sinistro
        SinistroDao sinistroDao = new SinistroDaoImpl();
        SinistroService sinistroService = new SinistroServiceImpl(sinistroDao);

        // Testar o registro do sinistro
        sinistroService.registrarSinistro(sinistro1);
        System.out.println("Sinistro registrado com sucesso!");

        // Testar a busca de um sinistro pelo número
        Sinistro sinistroBuscado = sinistroService.buscarSinistro("SIN001");
        if (sinistroBuscado != null) {
            System.out.println("Sinistro encontrado: ");
            sinistroBuscado.exibirDetalhes();
        } else {
            System.out.println("Sinistro não encontrado.");
        }

        // Testar a remoção de um sinistro
        sinistroService.removerSinistro("SIN001");
        System.out.println("Sinistro removido com sucesso.");

        // Testar a listagem de todos os sinistros
        System.out.println("Sinistros registrados:");
        for (Sinistro s : sinistroService.listarTodos()) {
            s.exibirDetalhes();
        }
    }
}
