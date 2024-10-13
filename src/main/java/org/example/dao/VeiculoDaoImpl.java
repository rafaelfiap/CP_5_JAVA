package org.example.dao;

import org.example.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface VeiculoDao utilizando uma lista em memória para armazenamento dos veículos.
 * Essa implementação simula o comportamento de persistência em banco de dados, mantendo os veículos em memória.
 * Cada operação (adicionar, buscar, atualizar, remover e listar) é realizada diretamente sobre uma lista.
 *
 * @since 1.0
 * @version 1.0
 */
public class VeiculoDaoImpl implements VeiculoDao {

    // Lista que armazena todos os veículos registrados em tempo de execução.
    private List<Veiculo> veiculos;

    /**
     * Construtor que inicializa a lista de veículos.
     * A lista é responsável por armazenar os veículos de forma temporária em memória.
     */
    public VeiculoDaoImpl() {
        this.veiculos = new ArrayList<>();
    }

    @Override
    public Veiculo adicionarVeiculo(Veiculo veiculo) {
        // Adiciona o veículo à lista e o retorna para confirmar a operação.
        veiculos.add(veiculo);
        return veiculo;
    }

    @Override
    public Veiculo buscarPorPlaca(String placa) {
        // Percorre a lista para buscar um veículo pela sua placa.
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;  // Retorna o veículo encontrado.
            }
        }
        return null;  // Retorna null se nenhum veículo for encontrado com a placa informada.
    }

    @Override
    public Veiculo atualizarVeiculo(Veiculo veiculoAtualizado) {
        // Percorre a lista para encontrar o veículo pela placa e atualizar seus dados.
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculoExistente = veiculos.get(i);
            if (veiculoExistente.getPlaca().equalsIgnoreCase(veiculoAtualizado.getPlaca())) {
                veiculos.set(i, veiculoAtualizado);  // Substitui o veículo antigo pelo atualizado.
                return veiculoAtualizado;  // Retorna o veículo atualizado.
            }
        }
        return null;  // Retorna null se o veículo não for encontrado.
    }

    @Override
    public boolean removerVeiculo(String placa) {
        // Percorre a lista para encontrar o veículo pela placa e o remover da lista.
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                veiculos.remove(veiculo);  // Remove o veículo da lista.
                return true;  // Confirma a remoção com true.
            }
        }
        return false;  // Retorna false se o veículo não for encontrado.
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        // Retorna todos os veículos registrados atualmente no sistema.
        return veiculos;
    }
}
