package org.example.model;

import java.time.LocalDate;

/**
 * Classe que representa um Sinistro no sistema de seguros.
 * Um sinistro é o evento que resulta no acionamento do seguro, como um acidente ou roubo.
 * Contém informações sobre o número do sinistro, a data do evento, o cliente, a apólice relacionada, e o endereço do evento.
 *
 * @since 1.0
 * @version 1.1
 */
public class Sinistro {
    private String numeroSinistro;  // Número único do sinistro
    private LocalDate dataEvento;   // Data do evento que gerou o sinistro
    private Apolice apolice;        // Apólice associada ao sinistro
    private Endereco endereco;      // Endereço onde o sinistro ocorreu
    private Cliente cliente;        // Cliente envolvido no sinistro

    /**
     * Construtor da classe Sinistro.
     * Inicializa um novo sinistro com o número do sinistro, a data do evento, o cliente, a apólice e o endereço.
     *
     * @param numeroSinistro Número único do sinistro.
     * @param dataEvento Data em que o sinistro ocorreu.
     * @param cliente Cliente associado ao sinistro.
     * @param apolice Apólice que cobre o sinistro.
     * @param endereco Endereço onde o sinistro ocorreu.
     */
    public Sinistro(String numeroSinistro, LocalDate dataEvento, Cliente cliente, Apolice apolice, Endereco endereco) {
        this.numeroSinistro = numeroSinistro;
        this.dataEvento = dataEvento;
        this.cliente = cliente;
        this.apolice = apolice;
        this.endereco = endereco;
    }

    // GETTERS E SETTERS

    /**
     * Obtém o número único do sinistro.
     *
     * @return Número do sinistro.
     */
    public String getNumeroSinistro() {
        return numeroSinistro;
    }

    /**
     * Define o número único do sinistro.
     *
     * @param numeroSinistro Novo número do sinistro.
     */
    public void setNumeroSinistro(String numeroSinistro) {
        this.numeroSinistro = numeroSinistro;
    }

    /**
     * Obtém a data do evento que gerou o sinistro.
     *
     * @return Data do evento.
     */
    public LocalDate getDataEvento() {
        return dataEvento;
    }

    /**
     * Define a data do evento que gerou o sinistro.
     *
     * @param dataEvento Nova data do evento.
     */
    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    /**
     * Obtém o cliente associado ao sinistro.
     *
     * @return Cliente envolvido no sinistro.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente envolvido no sinistro.
     *
     * @param cliente Novo cliente associado ao sinistro.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém a apólice associada ao sinistro.
     *
     * @return Apólice do sinistro.
     */
    public Apolice getApolice() {
        return apolice;
    }

    /**
     * Define a apólice associada ao sinistro.
     *
     * @param apolice Nova apólice associada ao sinistro.
     */
    public void setApolice(Apolice apolice) {
        this.apolice = apolice;
    }

    /**
     * Obtém o endereço onde o sinistro ocorreu.
     *
     * @return Endereço do sinistro.
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço onde o sinistro ocorreu.
     *
     * @param endereco Novo endereço do sinistro.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Exibe os detalhes completos do sinistro, incluindo o cliente, a apólice e o endereço do evento.
     */
    public void exibirDetalhes() {
        System.out.println("Sinistro Número: " + numeroSinistro);
        System.out.println("Data do Evento: " + dataEvento);
        System.out.println("Cliente Envolvido: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        System.out.println("Detalhes da Apólice: ");
        apolice.exibirDetalhes();  // Exibe os detalhes da apólice associada
        System.out.println("Endereço do Sinistro: ");
        endereco.exibirDetalhes();  // Exibe os detalhes do endereço do sinistro
    }

}
