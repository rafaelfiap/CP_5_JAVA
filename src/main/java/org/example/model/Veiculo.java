package org.example.model;

/**
 * Interface Veiculo que define as características comuns de um veículo coberto por seguro.
 * Esta interface será implementada por diferentes tipos de veículos, como Carro, Moto, Caminhão, Ônibus, etc.
 * Ela contém métodos essenciais que devem ser implementados para manipular e acessar as informações dos veículos,
 * além de calcular o valor do seguro com base nas suas características.
 *
 * @since 1.0
 * @version 1.0
 */
public interface Veiculo {

    // MÉTODOS GETTERS

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

    // MÉTODOS SETTERS

    /**
     * Define ou altera a placa do veículo.
     *
     * @param placa A nova placa a ser atribuída ao veículo.
     */
    void setPlaca(String placa);

    /**
     * Define ou altera a marca do veículo.
     *
     * @param marca A nova marca a ser atribuída ao veículo.
     */
    void setMarca(String marca);

    /**
     * Define ou altera o modelo do veículo.
     *
     * @param modelo O novo modelo a ser atribuído ao veículo.
     */
    void setModelo(String modelo);

    /**
     * Define ou altera o ano de fabricação do veículo.
     *
     * @param ano O novo ano de fabricação a ser atribuído ao veículo.
     */
    void setAno(int ano);

    /**
     * Define ou altera a cor do veículo.
     *
     * @param cor A nova cor a ser atribuída ao veículo.
     */
    void setCor(Cor cor);

    /**
     * Define ou altera o tipo de combustível do veículo.
     *
     * @param combustivel O novo tipo de combustível a ser atribuído ao veículo.
     */
    void setCombustivel(String combustivel);

    // MÉTODO DE CÁLCULO DE SEGURO

    /**
     * Calcula o valor do seguro do veículo.
     * O cálculo será baseado em fatores como a idade do veículo, tipo de combustível, entre outros.
     * Cada tipo de veículo pode ter uma fórmula de cálculo diferente.
     *
     * @return O valor do seguro calculado para o veículo.
     */
    double calcularValorSeguro();
}
