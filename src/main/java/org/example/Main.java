package org.example;

import org.example.factory.*;
import org.example.model.*;
import org.example.service.*;
import org.example.dao.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Classe Main que executa a simulação de cadastro de um cliente, veículo, seguro, apólice e sinistro.
 * Todos os objetos são criados utilizando fábricas e serviços, simulando um sistema de seguros.
 * A saída está organizada por instância e etapa, com mensagens claras para cada operação.
 *
 * @since 1.0
 * @version 1.2
 */
public class Main {

    public static void main(String[] args) {
        // Definindo o formato de data como "dd/MM/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // *** Cadastro de Cliente com Endereço ***
        System.out.println("===== Cadastro de Cliente =====");
        Endereco endereco = new Endereco("Rua das Flores", 123, "12345-678", "Centro", "São Paulo", "SP");
        Cliente cliente = new Cliente("123.456.789-00", "João Silva", endereco, "123456789", "joao@email.com", 'M');
        System.out.println("Cliente criado com sucesso:");
        cliente.exibirDetalhes();  // *** Exibe todos os detalhes do cliente, incluindo endereço ***
        System.out.println("==================================\n");

        // *** Cadastro de Veículo ***
        System.out.println("===== Cadastro de Veículo =====");
        Veiculo veiculo = VeiculoFactory.criarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2020, Cor.PRETO, "Gasolina");
        System.out.println("Veículo criado com sucesso:");
        System.out.println(veiculo);  // *** Exibe os detalhes do veículo criado ***
        System.out.println("==================================\n");

        // *** Instanciando ClienteService e ApoliceDao ***
        ClienteService clienteService = new ClienteServiceImpl(new ClienteDaoImpl());
        ApoliceDao apoliceDao = new ApoliceDaoImpl();

        // *** Cadastro de Seguro ***
        System.out.println("===== Cadastro de Seguro =====");
        LocalDate dataInicio = LocalDate.parse("15/10/2024", formatter);
        LocalDate dataTermino = LocalDate.parse("15/10/2025", formatter);
        Seguro seguro = SeguroFactory.criarSeguro("001", cliente, veiculo, dataInicio, dataTermino);
        System.out.println("Seguro criado com sucesso:");
        seguro.exibirDetalhes();  // *** Exibe os detalhes do seguro ***
        System.out.println("==================================\n");

        // *** Cadastro de Apólice ***
        System.out.println("===== Cadastro de Apólice =====");
        ApoliceService apoliceService = new ApoliceServiceImpl(apoliceDao, clienteService);
        Apolice apolice = ApoliceFactory.criarApolice("AP-001", cliente, veiculo, dataInicio, dataTermino);
        double valorApolice = apoliceService.calcularValor(apolice);
        System.out.println("Apólice criada com sucesso. Valor da Apólice: R$" + valorApolice);

        apoliceService.renovarApolice(apolice, LocalDate.parse("15/10/2026", formatter));
        System.out.println("Apólice renovada com nova data de término: " + apolice.getDataTermino().format(formatter));

        boolean apoliceValida = apoliceService.verificarValidade(apolice);
        System.out.println("Apólice válida? " + (apoliceValida ? "Sim" : "Não"));

        apoliceService.cancelarApolice(apolice);
        System.out.println("Apólice cancelada na data: " + apolice.getDataTermino().format(formatter));
        System.out.println("==================================\n");

        // *** Cadastro de Sinistro ***
        System.out.println("===== Cadastro de Sinistro =====");
        LocalDate dataSinistro = LocalDate.parse("20/10/2024", formatter);
        Sinistro sinistro = SinistroFactory.criarSinistro("S-001", dataSinistro, cliente, apolice, endereco);
        SinistroService sinistroService = new SinistroServiceImpl(new SinistroDaoImpl());

        sinistroService.registrarSinistro(sinistro);
        System.out.println("Sinistro registrado com sucesso!");

        double valorIndenizacao = sinistroService.calcularIndenizacao(sinistro);
        System.out.println("Valor da Indenização: R$" + valorIndenizacao);

        System.out.println("\nDetalhes do sinistro registrado:");
        sinistro.exibirDetalhes();  // *** Exibe os detalhes completos do sinistro ***
        System.out.println("==================================\n");

        // *** Listagem de Sinistros ***
        System.out.println("===== Listagem de Todos os Sinistros Registrados =====");
        List<Sinistro> sinistrosRegistrados = sinistroService.listarTodos();
        if (sinistrosRegistrados.isEmpty()) {
            System.out.println("Nenhum sinistro registrado.");
        } else {
            for (Sinistro s : sinistrosRegistrados) {
                System.out.println("\nSinistro Registrado: ");
                s.exibirDetalhes();  // *** Exibe os detalhes de cada sinistro ***
            }
        }
        System.out.println("==================================\n");

        // *** Testando funcionalidades do veículo ***
        System.out.println("===== Testes de Funcionalidades do Veículo =====");
        VeiculoService veiculoService = new VeiculoServiceImpl();
        veiculoService.registrarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2020, Cor.PRETO, "Gasolina");
        veiculoService.registrarVeiculo(TipoVeiculo.MOTO, "XYZ-5678", "Honda", "CG 160", 2021, Cor.VERMELHO, "Gasolina");

        List<Veiculo> veiculos = veiculoService.listarVeiculos();
        System.out.println("Veículos Registrados:");
        veiculos.forEach(System.out::println);

        double valorSeguroCarro = veiculoService.calcularValorSeguro(veiculo);
        System.out.println("Valor do Seguro para o Carro: R$" + valorSeguroCarro);
        System.out.println("==================================\n");
    }
}
