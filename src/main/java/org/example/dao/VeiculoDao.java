package org.example.dao;

import org.example.model.Veiculo;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados (DAO) para a entidade Veiculo.
 * As operações incluem adicionar, buscar, atualizar, remover e listar veículos.
 * Esse padrão DAO desacopla a lógica de negócios da lógica de persistência.
 *
 * @since 1.0
 * @version 1.0
 */
public interface VeiculoDao {

    /**
     * Adiciona um novo veículo ao sistema de armazenamento.
     *
     * @param veiculo O objeto Veiculo a ser adicionado.
     * @return O veículo adicionado ao sistema.
     */
    Veiculo adicionarVeiculo(Veiculo veiculo);

    /**
     * Busca um veículo no sistema pelo número da placa.
     *
     * @param placa A placa do veículo a ser buscado.
     * @return O veículo encontrado, ou null se não houver veículo com essa placa.
     */
    Veiculo buscarPorPlaca(String placa);

    /**
     * Atualiza as informações de um veículo existente no sistema.
     *
     * @param veiculo O objeto Veiculo contendo as informações atualizadas.
     * @return O veículo atualizado ou null se o veículo não foi encontrado.
     */
    Veiculo atualizarVeiculo(Veiculo veiculo);

    /**
     * Remove um veículo do sistema com base na sua placa.
     *
     * @param placa A placa do veículo a ser removido.
     * @return true se o veículo foi removido com sucesso, false caso contrário.
     */
    boolean removerVeiculo(String placa);

    /**
     * Lista todos os veículos atualmente armazenados no sistema.
     *
     * @return Uma lista contendo todos os veículos registrados.
     */
    List<Veiculo> listarVeiculos();
}
