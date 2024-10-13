package org.example.model;


/**
 * Enum que representa as cores disponíveis para os veículos.
 * Cada cor de veículo possui uma descrição associada.
 *
 * @since 1.0
 * @version 1.0
 */
public enum Cor {
    BRANCO("Branco"),
    PRETO("Preto"),
    PRATA("Prata"),
    CINZA("Cinza"),
    VERMELHO("Vermelho"),
    AZUL("Azul"),
    VERDE("Verde"),
    AMARELO("Amarelo"),
    LARANJA("Laranja"),
    MARROM("Marrom"),
    BEGE("Bege"),
    DOURADO("Dourado"),
    BRONZE("Bronze"),
    ROXO("Roxo"),
    ROSA("Rosa"),
    TURQUESA("Turquesa"),
    CIANO("Ciano"),
    MAGENTA("Magenta"),
    LILAS("Lilás");

    private final String descricao;

    /**
     * Construtor do enum Cor.
     *
     * @param descricao A descrição da cor.
     */
    Cor(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a descrição da cor.
     *
     * @return Descrição da cor.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna uma representação textual da cor.
     * Esse método será útil ao exibir a cor diretamente no sistema.
     *
     * @return A descrição da cor.
     */
    @Override
    public String toString() {
        return descricao;
    }
}
