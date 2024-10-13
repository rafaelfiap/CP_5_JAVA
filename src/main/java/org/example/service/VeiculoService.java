package org.example.service;

import org.example.model.Veiculo;
import org.example.model.TipoVeiculo;
import org.example.model.Cor;
import java.util.List;

/**
 * Interface que define os métodos para o serviço de Veículo.
 * O serviço de Veículo é responsável por encapsular a lógica de negócios associada a veículos,
 * como criação, listagem, e cálculo do valor do seguro.
 *
 * @since 1.0
 * @version 1.0
 */
public interface VeiculoService {

    /**
     * Registra um novo veículo no sistema.
     *
     * @param tipo Tipo do veículo.
     * @param placa Placa do veículo.
     * @param marca Marca do veículo.
     * @param modelo Modelo do veículo.
     * @param ano Ano de fabricação do veículo.
     * @param cor Cor do veículo.
     * @param combustivel Tipo de combustível do veículo.
     * @return O veículo registrado.
     */
    Veiculo registrarVeiculo(TipoVeiculo tipo, String placa, String marca, String modelo, int ano, Cor cor, String combustivel);

    /**
     * Busca um veículo pelo número da placa.
     *
     * @param placa Placa do veículo.
     * @return O veículo encontrado, ou null se não houver.
     */
    Veiculo buscarPorPlaca(String placa);

    /**
     * Retorna uma lista de todos os veículos registrados.
     *
     * @return Lista de veículos.
     */
    List<Veiculo> listarVeiculos();

    /**
     * Calcula o valor do seguro de um veículo com base em suas características.
     *
     * @param veiculo Veículo para o qual o seguro será calculado.
     * @return Valor do seguro calculado.
     */
    double calcularValorSeguro(Veiculo veiculo);
}
