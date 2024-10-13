package org.example.test;

import org.example.model.Cor;
import org.example.model.TipoVeiculo;
import org.example.model.Veiculo;
import org.example.service.VeiculoService;
import org.example.service.VeiculoServiceImpl;

import java.util.List;

/**
 * Classe para simular os testes do VeiculoService sem o uso de JUnit.
 * O objetivo é testar o registro, busca, listagem e cálculo do valor do seguro de veículos.
 *
 * @since 1.0
 * @version 1.0
 */
public class TesteVeiculoService {

    public static void main(String[] args) {
        // Criação de uma instância do VeiculoService
        VeiculoService veiculoService = new VeiculoServiceImpl();

        // Teste: Registrar um novo veículo
        System.out.println("Testando Registro de Veículo...");
        Veiculo carro = veiculoService.registrarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2020, Cor.PRETO, "Gasolina");
        System.out.println("Veículo Registrado: " + carro);

        // Teste: Buscar veículo por placa
        System.out.println("Testando Buscar Veículo por Placa...");
        Veiculo veiculoEncontrado = veiculoService.buscarPorPlaca("ABC-1234");
        System.out.println("Veículo Encontrado: " + veiculoEncontrado);

        // Teste: Listar todos os veículos registrados
        System.out.println("Testando Listar Veículos...");
        veiculoService.registrarVeiculo(TipoVeiculo.MOTO, "XYZ-5678", "Honda", "CG 160", 2021, Cor.VERMELHO, "Gasolina");
        List<Veiculo> veiculos = veiculoService.listarVeiculos();
        System.out.println("Veículos Registrados: " + veiculos);

        // Teste: Calcular valor do seguro de um veículo
        System.out.println("Testando Cálculo de Valor do Seguro...");
        double valorSeguro = veiculoService.calcularValorSeguro(carro);
        System.out.println("Valor do Seguro para o Carro: " + valorSeguro);
    }
}
