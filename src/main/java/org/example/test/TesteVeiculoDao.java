package org.example.test;

import org.example.dao.VeiculoDao;
import org.example.dao.VeiculoDaoImpl;
import org.example.factory.VeiculoFactory;
import org.example.model.Cor;
import org.example.model.TipoVeiculo;
import org.example.model.Veiculo;

import java.util.List;

/**
 * Classe para simular testes da implementação de VeiculoDao sem o uso de frameworks.
 * Essa classe testa as operações CRUD (Create, Read, Update, Delete) no contexto de veículos.
 *
 * @since 1.0
 * @version 1.0
 */
public class TesteVeiculoDao {

    public static void main(String[] args) {
        // Criação da instância de VeiculoDao (em memória)
        VeiculoDao veiculoDao = new VeiculoDaoImpl();

        // Teste: Adicionar um veículo
        System.out.println("Adicionando Veículo...");
        Veiculo carro = VeiculoFactory.criarVeiculo(TipoVeiculo.CARRO, "ABC-1234", "Toyota", "Corolla", 2020, Cor.PRETO, "Gasolina");
        veiculoDao.adicionarVeiculo(carro);
        System.out.println("Veículo Adicionado: " + carro);

        // Teste: Buscar veículo por placa
        System.out.println("\nBuscando Veículo por Placa...");
        Veiculo veiculoEncontrado = veiculoDao.buscarPorPlaca("ABC-1234");
        if (veiculoEncontrado != null) {
            System.out.println("Veículo Encontrado: " + veiculoEncontrado);
        } else {
            System.out.println("Veículo Não Encontrado.");
        }

        // Teste: Atualizar veículo
        System.out.println("\nAtualizando Veículo...");
        carro.setMarca("Honda");
        veiculoDao.atualizarVeiculo(carro);
        Veiculo veiculoAtualizado = veiculoDao.buscarPorPlaca("ABC-1234");
        System.out.println("Veículo Atualizado: " + veiculoAtualizado);

        // Teste: Listar todos os veículos
        System.out.println("\nListando Veículos...");
        Veiculo moto = VeiculoFactory.criarVeiculo(TipoVeiculo.MOTO, "XYZ-5678", "Honda", "CG 160", 2021, Cor.VERMELHO, "Gasolina");
        veiculoDao.adicionarVeiculo(moto);
        List<Veiculo> veiculos = veiculoDao.listarVeiculos();
        System.out.println("Veículos Registrados:");
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }

        // Teste: Remover veículo
        System.out.println("\nRemovendo Veículo...");
        veiculoDao.removerVeiculo("ABC-1234");
        System.out.println("Tentando buscar o veículo removido...");
        Veiculo veiculoRemovido = veiculoDao.buscarPorPlaca("ABC-1234");
        System.out.println("Resultado da busca: " + veiculoRemovido);
    }
}
