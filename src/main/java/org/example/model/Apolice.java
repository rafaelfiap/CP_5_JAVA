package org.example.model;

import java.time.LocalDate;

/**
 * Classe que representa uma Apólice de Seguro.
 * A apólice é o contrato entre o cliente e a seguradora que garante a cobertura do veículo.
 * Contém informações sobre o número da apólice, cliente, veículo, data de início e término, e valor do seguro.
 *
 * @since 1.0
 * @version 1.1
 */
public class Apolice {
    private String numeroApolice;  // Número único da apólice
    private Cliente cliente;       // Cliente associado à apólice
    private Veiculo veiculo;       // Veículo coberto pela apólice
    private LocalDate dataInicio;  // Data de início da apólice
    private LocalDate dataTermino; // Data de término da apólice
    private double valor;          // Valor do seguro da apólice

    /**
     * Construtor para inicializar uma Apólice com todos os atributos.
     *
     * @param numeroApolice Número único da apólice.
     * @param cliente       O cliente que contratou a apólice.
     * @param veiculo       O veículo coberto pela apólice.
     * @param dataInicio    A data de início da apólice.
     * @param dataTermino   A data de término da apólice.
     */
    public Apolice(String numeroApolice, Cliente cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataTermino) {
        this.numeroApolice = numeroApolice;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valor = valor;
    }

    // Getters e Setters

    /**
     * Obtém o número da apólice.
     *
     * @return O número único da apólice.
     */
    public String getNumeroApolice() {
        return numeroApolice;
    }

    /**
     * Define o número da apólice.
     *
     * @param numeroApolice O novo número da apólice.
     */
    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    /**
     * Obtém o cliente associado à apólice.
     *
     * @return O cliente da apólice.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente associado à apólice.
     *
     * @param cliente O novo cliente associado à apólice.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém o veículo coberto pela apólice.
     *
     * @return O veículo da apólice.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * Define o veículo coberto pela apólice.
     *
     * @param veiculo O novo veículo associado à apólice.
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * Obtém a data de início da apólice.
     *
     * @return A data de início da apólice.
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * Define a data de início da apólice.
     *
     * @param dataInicio A nova data de início da apólice.
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Obtém a data de término da apólice.
     *
     * @return A data de término da apólice.
     */
    public LocalDate getDataTermino() {
        return dataTermino;
    }

    /**
     * Define a data de término da apólice.
     *
     * @param dataTermino A nova data de término da apólice.
     */
    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * Obtém o valor da apólice.
     *
     * @return O valor do seguro associado à apólice.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da apólice.
     *
     * @param valor O novo valor da apólice.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Exibe os detalhes completos da apólice, incluindo cliente, veículo e valor.
     */
    public void exibirDetalhes() {
        System.out.println("Apólice Número: " + numeroApolice);
        cliente.exibirDetalhes();  // Exibe os detalhes do cliente
        System.out.println("Veículo: " + veiculo.getModelo() + " - " + veiculo.getPlaca());
        System.out.println("Valor da Apólice: R$" + valor);
        System.out.println("Válido de " + dataInicio + " até " + dataTermino);
    }
}
