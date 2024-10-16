package org.example.model;

import java.time.LocalDate;

/**
 * Classe que representa o Seguro de um veículo.
 * Contém informações sobre o número do seguro, cliente, veículo, valor do seguro,
 * além das datas de início e término do seguro.
 *
 * Esta classe é responsável por armazenar as informações de uma apólice de seguro de veículo,
 * bem como fornecer métodos para acessar e modificar esses dados.
 *
 * @since 1.0
 * @version 1.0
 */
public class Seguro {
    private String numeroSeguro;  // Número único do seguro
    private Cliente cliente;      // Cliente que contratou o seguro
    private Veiculo veiculo;      // Veículo segurado
    private double valor;         // Valor do seguro
    private LocalDate dataInicio; // Data de início do seguro
    private LocalDate dataTermino;// Data de término do seguro

    /**
     * Construtor para inicializar o seguro com todos os atributos.
     *
     * @param numeroSeguro O número único do seguro.
     * @param cliente      O cliente que contratou o seguro.
     * @param veiculo      O veículo segurado.
     * @param dataInicio   A data de início do seguro.
     * @param dataTermino  A data de término do seguro.
     */
    public Seguro(String numeroSeguro, Cliente cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataTermino) {
        this.numeroSeguro = numeroSeguro;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valor = 0.0;  // Inicializado como 0, será calculado posteriormente
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    // Getters e Setters

    /**
     * Obtém o número único do seguro.
     *
     * @return O número do seguro.
     */
    public String getNumeroSeguro() {
        return numeroSeguro;
    }

    /**
     * Define o número do seguro.
     *
     * @param numeroSeguro O novo número do seguro.
     */
    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    /**
     * Obtém o cliente associado ao seguro.
     *
     * @return O cliente que contratou o seguro.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente associado ao seguro.
     *
     * @param cliente O novo cliente associado ao seguro.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém o veículo segurado.
     *
     * @return O veículo associado ao seguro.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * Define o veículo associado ao seguro.
     *
     * @param veiculo O novo veículo associado ao seguro.
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * Obtém o valor do seguro.
     *
     * @return O valor do seguro.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor do seguro.
     *
     * @param valor O novo valor do seguro.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Obtém a data de início do seguro.
     *
     * @return A data de início do seguro.
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * Define a data de início do seguro.
     *
     * @param dataInicio A nova data de início do seguro.
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Obtém a data de término do seguro.
     *
     * @return A data de término do seguro.
     */
    public LocalDate getDataTermino() {
        return dataTermino;
    }

    /**
     * Define a data de término do seguro.
     *
     * @param dataTermino A nova data de término do seguro.
     */
    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * Exibe os detalhes completos do seguro, incluindo o cliente, veículo e o valor do seguro.
     *
     * Este método imprime as informações do seguro, como o número do seguro, os dados do cliente e
     * do veículo, além das datas de início e término do seguro. Ele é utilizado para apresentar uma
     * visão geral do seguro atual.
     */
    public void exibirDetalhesSeguro() {
        System.out.println("Seguro Número: " + numeroSeguro);
        cliente.exibirDetalhes();  // Exibe os detalhes do cliente associado
        System.out.println("Veículo: " + veiculo.getModelo() + " - " + veiculo.getPlaca());
        System.out.println("Valor do Seguro: R$" + valor);
        System.out.println("Válido de " + dataInicio + " até " + dataTermino);
    }
}
