package org.example.test;

import org.example.factory.ApoliceFactory;
import org.example.factory.VeiculoFactory;
import org.example.model.*;
import org.example.dao.ApoliceDaoImpl;
import org.example.dao.ClienteDaoImpl;
import org.example.service.ApoliceServiceImpl;
import org.example.service.ClienteServiceImpl;

import java.time.LocalDate;

public class TesteApolice {

    public static void main(String[] args) {
        // Criar um endereço fictício para o cliente
        Endereco endereco = new Endereco("Rua das Flores", 123, "12345-678", "Centro", "São Paulo", "SP");

        // Criar um cliente com o endereço fictício
        Cliente cliente = new Cliente("123.456.789-00", "João Silva", endereco, "123456789", "joao@email.com", 'M');

        // Criar um veículo fictício para testar a apólice
        Veiculo veiculo = VeiculoFactory.criarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2015, Cor.PRETO, "Gasolina");

        // Criar uma apólice usando a factory
        Apolice apolice = ApoliceFactory.criarApolice("001", cliente, veiculo, LocalDate.now(), LocalDate.now().plusYears(1));

        // Exibir os detalhes da apólice
        System.out.println("Detalhes da Apólice Criada:");
        apolice.exibirDetalhesApolice();

        // Criar instâncias dos DAOs e serviços
        ClienteDaoImpl clienteDao = new ClienteDaoImpl(); // Cria o DAO de cliente
        ApoliceDaoImpl apoliceDao = new ApoliceDaoImpl(); // Cria o DAO de apólice
        ClienteServiceImpl clienteService = new ClienteServiceImpl(clienteDao); // Cria o serviço de cliente
        ApoliceServiceImpl apoliceService = new ApoliceServiceImpl(apoliceDao, clienteService); // Injeta o ApoliceDao e o ClienteService

        // Calcular o valor da apólice
        double valor = apoliceService.calcularValor(apolice);
        System.out.println("Valor da Apólice: R$" + valor);

        // Renovar a apólice
        apoliceService.renovarApolice(apolice, LocalDate.now().plusYears(2));
        System.out.println("Apólice renovada com nova data de término: " + apolice.getDataTermino());

        // Verificar a validade da apólice
        boolean validade = apoliceService.verificarValidade(apolice);
        System.out.println("Apólice válida? " + (validade ? "Sim" : "Não"));

        // Cancelar a apólice
        apoliceService.cancelarApolice(apolice);
        System.out.println("Apólice cancelada na data: " + apolice.getDataTermino());

        // Testar a persistência usando o ApoliceDao
        apoliceDao.adicionarApolice(apolice);
        System.out.println("Apólice adicionada ao sistema.");

        // Buscar apólice pelo número
        Apolice apoliceBuscada = apoliceDao.buscarApolicePorNumero("001");
        System.out.println("Apólice buscada pelo número: " + apoliceBuscada.getNumeroApolice());

        // Atualizar a apólice
        apolice.setValor(1200);
        apoliceDao.atualizarApolice(apolice);
        System.out.println("Apólice atualizada com novo valor: " + apolice.getValor());

        // Remover a apólice
        apoliceDao.removerApolice("001");
        System.out.println("Apólice removida do sistema.");
    }
}
