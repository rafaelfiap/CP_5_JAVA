package org.example.model;


import java.util.Date;

/**
 * Classe que representa um Seguro no sistema.
 * Um seguro está relacionado a um veículo e um cliente, e contém informações sobre a validade e o valor.
 *
 * @since 1.0
 * @version 1.0
 */
public class Seguro {
    private Cliente cliente;    // Cliente relacionado ao seguro
    private Veiculo veiculo;    // Veículo coberto pelo seguro
    private double valorSeguro; // Valor do seguro
    private Date dataInicio;    // Data de início da vigência do seguro
    private Date dataFim;       // Data de término da vigência do seguro

    /**
     * Construtor para inicializar um Seguro.
     *
     * @param cliente Cliente relacionado ao seguro
     * @param veiculo Veículo coberto pelo seguro
     * @param valorSeguro Valor do seguro
     * @param dataInicio Data de início da vigência
     * @param dataFim Data de término da vigência
     */
    public Seguro(Cliente cliente, Veiculo veiculo, double valorSeguro, Date dataInicio, Date dataFim) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorSeguro = valorSeguro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    /**
     * Obtém o cliente associado ao seguro.
     *
     * @return Cliente associado ao seguro.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente associado ao seguro.
     *
     * @param cliente Novo cliente associado ao seguro.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém o veículo coberto pelo seguro.
     *
     * @return Veículo coberto pelo seguro.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * Define o veículo coberto pelo seguro.
     *
     * @param veiculo Novo veículo coberto pelo seguro.
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * Obtém o valor do seguro.
     *
     * @return Valor do seguro.
     */
    public double getValorSeguro() {
        return valorSeguro;
    }

    /**
     * Define o valor do seguro.
     *
     * @param valorSeguro Novo valor do seguro.
     */
    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    /**
     * Obtém a data de início da vigência do seguro.
     *
     * @return Data de início da vigência.
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * Define a data de início da vigência do seguro.
     *
     * @param dataInicio Nova data de início da vigência.
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Obtém a data de término da vigência do seguro.
     *
     * @return Data de término da vigência.
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * Define a data de término da vigência do seguro.
     *
     * @param dataFim Nova data de término da vigência.
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Verifica se o seguro está dentro do prazo de validade.
     *
     * @return true se o seguro ainda é válido, false caso contrário.
     */
    public boolean isSeguroValido() {
        Date hoje = new Date();
        return hoje.after(dataInicio) && hoje.before(dataFim);
    }

    /**
     * Exibe os detalhes do seguro.
     */
    public void exibirDetalhes() {
        System.out.println("Seguro para o cliente: " + cliente.getNome() + ", Veículo: " + veiculo.getModelo());
        System.out.println("Valor do seguro: R$ " + valorSeguro + " | Vigência: " + dataInicio + " até " + dataFim);
    }

}
