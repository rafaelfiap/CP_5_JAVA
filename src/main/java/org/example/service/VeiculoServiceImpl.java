package org.example.service;


import org.example.model.*;
import org.example.factory.VeiculoFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface VeiculoService.
 * Contém a lógica de negócios para o gerenciamento de veículos,
 * incluindo a criação, busca, listagem e cálculo do valor do seguro.
 *
 * @since 1.0
 * @version 1.0
 */
public class VeiculoServiceImpl implements VeiculoService {

    private List<Veiculo> veiculosRegistrados;

    /**
     * Construtor para inicializar o serviço com uma lista de veículos.
     */
    public VeiculoServiceImpl() {
        this.veiculosRegistrados = new ArrayList<>();
    }

    @Override
    public Veiculo registrarVeiculo(TipoVeiculo tipo, String placa, String marca, String modelo, int ano, Cor cor, String combustivel) {
        // Utiliza a fábrica para criar o veículo
        Veiculo novoVeiculo = VeiculoFactory.criarVeiculo(tipo, placa, marca, modelo, ano, cor, combustivel);
        veiculosRegistrados.add(novoVeiculo);
        return novoVeiculo;
    }

    @Override
    public Veiculo buscarPorPlaca(String placa) {
        // Busca na lista de veículos registrados pelo número da placa
        for (Veiculo veiculo : veiculosRegistrados) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;  // Retorna null se não encontrado
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        // Retorna a lista de veículos registrados
        return veiculosRegistrados;
    }

    @Override
    public double calcularValorSeguro(Veiculo veiculo) {
        // Utiliza o método da interface Veiculo para calcular o valor do seguro
        return veiculo.calcularValorSeguro();
    }
}
