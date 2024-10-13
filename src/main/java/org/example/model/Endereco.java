package org.example.model;


/**
 * Classe que representa um Endereço no sistema.
 * O endereço contém informações sobre o logradouro, número, CEP, bairro, cidade e UF (estado).
 *
 * @since 1.0
 * @version 1.0
 */
public class Endereco {
    private String logradouro;  // Nome da rua ou avenida
    private int numero;         // Número do local
    private String cep;         // Código postal
    private String bairro;      // Nome do bairro
    private String cidade;      // Nome da cidade
    private String uf;          // Unidade Federativa (estado)

    /**
     * Construtor para inicializar um Endereço com todos os atributos.
     *
     * @param logradouro Nome da rua ou avenida
     * @param numero Número do local
     * @param cep Código postal
     * @param bairro Nome do bairro
     * @param cidade Nome da cidade
     * @param uf Unidade Federativa (estado)
     */
    public Endereco(String logradouro, int numero, String cep, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    /**
     * Obtém o logradouro (nome da rua ou avenida) do endereço.
     *
     * @return Logradouro do endereço.
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
     * Obtém o número do local no endereço.
     *
     * @return Número do local.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do local no endereço.
     *
     * @param numero Novo número do local.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém o código postal (CEP) do endereço.
     *
     * @return CEP do endereço.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o código postal (CEP) do endereço.
     *
     * @param cep Novo CEP do endereço.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Obtém o bairro do endereço.
     *
     * @return Bairro do endereço.
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
     * Obtém a cidade do endereço.
     *
     * @return Cidade do endereço.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade do endereço.
     *
     * @param cidade Nova cidade do endereço.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém a Unidade Federativa (UF) do endereço.
     *
     * @return Unidade Federativa do endereço.
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define a Unidade Federativa (UF) do endereço.
     *
     * @param uf Nova Unidade Federativa do endereço.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Exibe o endereço completo.
     * Mostra o logradouro, número, bairro, cidade, UF e CEP.
     */
    public void exibirEndereco() {
        System.out.println(logradouro + ", " + numero + " - " + bairro + ", " + cidade + " - " + uf + " | CEP: " + cep);
    }
}
