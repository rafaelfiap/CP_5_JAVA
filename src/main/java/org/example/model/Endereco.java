package org.example.model;

/**
 * Classe que representa um Endereço no sistema de seguros.
 * O endereço contém informações sobre o logradouro, número, CEP, bairro, cidade e UF (Unidade Federativa).
 * Esta classe será utilizada para armazenar e manipular os dados de endereço em entidades como Cliente e Sinistro.
 *
 * @since 1.0
 * @version 1.0
 */
public class Endereco {
    private String logradouro;  // Nome da rua ou avenida
    private int numero;         // Número do local (residência ou comercial)
    private String cep;         // Código postal do local
    private String bairro;      // Nome do bairro onde o local está situado
    private String cidade;      // Nome da cidade do local
    private String uf;          // Unidade Federativa (estado) do local

    /**
     * Construtor que inicializa todos os atributos de um Endereço.
     *
     * @param logradouro Nome da rua ou avenida.
     * @param numero Número da residência ou estabelecimento.
     * @param cep Código postal do local.
     * @param bairro Nome do bairro onde está situado o local.
     * @param cidade Nome da cidade onde está localizado o local.
     * @param uf Unidade Federativa (estado) do local.
     */
    public Endereco(String logradouro, int numero, String cep, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    // GETTERS E SETTERS

    /**
     * Obtém o logradouro (nome da rua ou avenida) do endereço.
     *
     * @return O logradouro do endereço.
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Define o logradouro (nome da rua ou avenida) do endereço.
     *
     * @param logradouro Novo logradouro do endereço.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Obtém o número da residência ou estabelecimento.
     *
     * @return O número do local.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número da residência ou estabelecimento.
     *
     * @param numero Novo número do local.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém o CEP (código postal) do endereço.
     *
     * @return O CEP do endereço.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o CEP (código postal) do endereço.
     *
     * @param cep Novo CEP do endereço.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Obtém o bairro do endereço.
     *
     * @return O bairro do endereço.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o bairro do endereço.
     *
     * @param bairro Novo bairro do endereço.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Obtém a cidade onde o endereço está localizado.
     *
     * @return A cidade do endereço.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade onde o endereço está localizado.
     *
     * @param cidade Nova cidade do endereço.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém a UF (Unidade Federativa, estado) onde o endereço está localizado.
     *
     * @return A UF (estado) do endereço.
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define a UF (Unidade Federativa, estado) onde o endereço está localizado.
     *
     * @param uf Nova UF (estado) do endereço.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Exibe o endereço completo em formato legível.
     * Exibe o logradouro, número, bairro, cidade, UF e CEP.
     */
    public void exibirEndereco() {
        System.out.println(logradouro + ", " + numero + " - " + bairro + ", " + cidade + " - " + uf + " | CEP: " + cep);
    }
}
