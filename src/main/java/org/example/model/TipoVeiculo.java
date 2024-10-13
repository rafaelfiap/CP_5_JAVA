package org.example.model;

/**
 * Enum que representa os diferentes tipos de veículos cobertos por seguro.
 * Cada tipo de veículo possui uma descrição associada.
 *
 * @since 1.0
 * @version 1.0
 */
public enum TipoVeiculo {
    CARRO("Carro"),
    MOTO("Moto"),
    CAMINHAO("Caminhão"),
    ONIBUS("Ônibus");

    private final String descricao;

    /**
     * Construtor do enum TipoVeiculo.
     *
     * @param descricao A descrição do tipo de veículo.
     */
    TipoVeiculo(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a descrição do tipo de veículo.
     *
     * @return Descrição do tipo de veículo.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna uma representação textual do tipo de veículo.
     * Esse método será útil ao exibir o tipo de veículo diretamente no sistema.
     *
     * @return A descrição do tipo de veículo.
     */
    @Override
    public String toString() {
        return descricao;
    }
}
