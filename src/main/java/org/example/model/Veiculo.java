package org.example.model;


/**
 * ‘Interface’ Veiculo que define as características comuns de um veículo coberto por seguro.
 * Essa interface será implementada por diferentes tipos de veículos, como Carro, Moto, Caminhão, Ônibus, etc.
 * Ela contém métodos essenciais que devem ser implementados para manipular as informações dos veículos
 * e calcular o valor do seguro.
 *
 * @since 1.0
 * @version 1.0
 */
public interface Veiculo {

    /**
     * Obtém a placa do veículo.
     *
     * @return A placa única do veículo.
     */
    String getPlaca();

    /**
     * Obtém a marca do veículo.
     *
     * @return A marca do veículo (ex: Toyota, Honda, etc.).
     */
    String getMarca();

    /**
     * Obtém o modelo do veículo.
     *
     * @return O modelo do veículo (ex: Corolla, Civic, etc.).
     */
    String getModelo();

    /**
     * Obtém o ano de fabricação do veículo.
     *
     * @return O ano de fabricação do veículo.
     */
    int getAno();

    /**
     * Obtém a cor do veículo.
     *
     * @return A cor do veículo, representada pelo enum Cor.
     */
    Cor getCor();

    /**
     * Obtém o tipo de combustível do veículo.
     *
     * @return O tipo de combustível do veículo (ex: Gasolina, Diesel, Elétrico, etc.).
     */
    String getCombustivel();

    /**
     * Calcula o valor do seguro do veículo.
     * O cálculo será baseado em fatores como a idade do veículo, tipo de combustível, etc.
     *
     * @return O valor do seguro calculado para o veículo.
     */
    double calcularValorSeguro();
}
