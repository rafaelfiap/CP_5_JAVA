package org.example.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe que representa uma Apólice de seguro.
 * Contém os atributos e métodos necessários para a gestão de uma apólice, incluindo o cliente associado,
 * veículo coberto, e datas de vigência.
 *
 * @since 1.0
 * @version 1.0
 */
public class Apolice {

    private String numeroApolice;     // Número único da apólice
    private double valorApolice;      // Valor total da apólice
    private LocalDate dataInicio;     // Data de início da apólice
    private LocalDate dataTermino;    // Data de término da apólice
    private Cliente cliente;          // Cliente associado à apólice
    private Veiculo veiculo;          // Veículo coberto pela apólice

    /**
     * Construtor da classe Apolice.
     * Inicializa uma apólice com todas as informações necessárias.
     *
     * @param numeroApolice Número único da apólice
     * @param valorApolice  Valor total da apólice
     * @param dataInicio    Data de início da apólice
     * @param dataTermino   Data de término da apólice
     * @param cliente       Cliente associado à apólice
     * @param veiculo       Veículo coberto pela apólice
     */
    public Apolice(String numeroApolice, double valorApolice, LocalDate dataInicio, LocalDate dataTermino, Cliente cliente, Veiculo veiculo) {
        this.numeroApolice = numeroApolice;
        this.valorApolice = valorApolice;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    // GETTERS E SETTERS

    /**
     * Obtém o número único da apólice.
     *
     * @return O número da apólice.
     */
    public String getNumeroApolice() {
        return numeroApolice;
    }

    /**
     * Define o número único da apólice.
     *
     * @param numeroApolice O número da apólice a ser definido.
     */
    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    /**
     * Obtém o valor total da apólice.
     *
     * @return O valor da apólice.
     */
    public double getValorApolice() {
        return valorApolice;
    }

    /**
     * Define o valor total da apólice.
     *
     * @param valorApolice O valor da apólice a ser definido.
     */
    public void setValorApolice(double valorApolice) {
        this.valorApolice = valorApolice;
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
     * @param dataInicio A data de início a ser definida.
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
     * @param dataTermino A data de término a ser definida.
     */
    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * Obtém o cliente associado à apólice.
     *
     * @return O cliente associado.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente associado à apólice.
     *
     * @param cliente O cliente a ser definido.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém o veículo coberto pela apólice.
     *
     * @return O veículo coberto.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * Define o veículo coberto pela apólice.
     *
     * @param veiculo O veículo a ser definido.
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
