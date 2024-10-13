package org.example.test;

import org.example.factory.VeiculoFactory;
import org.example.model.Cor;
import org.example.model.TipoVeiculo;
import org.example.model.Veiculo;

/**
 * Classe para simular os testes da VeiculoFactory sem o uso de JUnit.
 * O objetivo é testar a criação de diferentes tipos de veículos pela fábrica.
 *
 * @since 1.0
 * @version 1.0
 */
public class TesteVeiculoFactory {

    public static void main(String[] args) {
        // Teste: Criar um carro pela fábrica
        System.out.println("Testando Criação de Carro...");
        Veiculo carro = VeiculoFactory.criarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2020, Cor.PRETO, "Gasolina");
        System.out.println("Carro Criado: " + carro);

        // Teste: Criar uma moto pela fábrica
        System.out.println("Testando Criação de Moto...");
        Veiculo moto = VeiculoFactory.criarVeiculo(TipoVeiculo.MOTO, "XYZ-5678", "Honda", "CG 160", 2021, Cor.VERMELHO, "Gasolina");
        System.out.println("Moto Criada: " + moto);

        // Teste: Criar um caminhão pela fábrica
        System.out.println("Testando Criação de Caminhão...");
        Veiculo caminhao = VeiculoFactory.criarVeiculo(TipoVeiculo.CAMINHAO, "QWE-9876", "Volvo", "FH", 2018, Cor.BRANCO, "Diesel");
        System.out.println("Caminhão Criado: " + caminhao);

        // Teste: Criar um ônibus pela fábrica
        System.out.println("Testando Criação de Ônibus...");
        Veiculo onibus = VeiculoFactory.criarVeiculo(TipoVeiculo.ONIBUS, "FGH-4567", "Mercedes", "OF 1721", 2017, Cor.AZUL, "Diesel");
        System.out.println("Ônibus Criado: " + onibus);
    }
}
