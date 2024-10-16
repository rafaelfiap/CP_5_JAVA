package org.example.test;

import org.example.factory.SeguroFactory;
import org.example.factory.VeiculoFactory;
import org.example.model.Cliente;
import org.example.model.Endereco;
import org.example.model.Seguro;
import org.example.model.TipoVeiculo;
import org.example.model.Veiculo;
import org.example.service.SeguroService;
import org.example.service.SeguroServiceImpl;

import java.time.LocalDate;

public class TesteSeguro {

    public static void main(String[] args) {
        // Criar endereço do cliente
        Endereco endereco = new Endereco("Rua das Flores", 123, "12345-678", "Centro", "São Paulo", "SP");

        // Criar cliente com o endereço recém-criado
        Cliente cliente = new Cliente("123.456.789-00", "João Silva", endereco, "123456789", "joao@email.com", 'M');

        // Criar veículo fictício para o seguro
        Veiculo veiculo = VeiculoFactory.criarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2015, null, "Gasolina");

        // Criar o serviço de seguro
        SeguroService seguroService = new SeguroServiceImpl();

        // Criar um seguro usando a factory
        Seguro seguro = SeguroFactory.criarSeguro("001", cliente, veiculo, LocalDate.now(), LocalDate.now().plusYears(1));

        // Exibir os detalhes do seguro
        System.out.println("Detalhes do Seguro:");
        seguro.exibirDetalhesSeguro();

        // Calcular o valor do seguro
        double valor = seguroService.calcularValor(seguro);
        System.out.println("Valor do Seguro: R$" + valor);

        // Renovar o seguro
        seguroService.renovarSeguro(seguro, LocalDate.now().plusYears(2));
        System.out.println("Seguro renovado com nova data de término: " + seguro.getDataTermino());

        // Verificar a validade do seguro
        boolean validade = seguroService.verificarValidade(seguro);
        System.out.println("Seguro válido? " + (validade ? "Sim" : "Não"));

        // Atualizar o valor do seguro
        seguroService.atualizarValorSeguro(seguro, 1500.00);
        System.out.println("Seguro atualizado com novo valor: R$" + seguro.getValor());

        // Cancelar o seguro
        seguroService.cancelarSeguro(seguro);
        System.out.println("Seguro cancelado na data: " + seguro.getDataTermino());

        // Registrar um sinistro
        seguroService.registrarSinistro(seguro);
    }
}
