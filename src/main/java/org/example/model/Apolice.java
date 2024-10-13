package org.example.model;


import java.util.Date;

/**
 * Classe que representa uma Apólice de seguro.
 * Contém informações sobre o número da apólice, datas de emissão e vencimento.
 *
 * @since 1.0
 * @version 1.0
 */
public class Apolice {
    private int numeroApolice;  // Número único da apólice
    private Seguro seguro;      // Seguro relacionado à apólice
    private Date dataEmissao;   // Data de emissão da apólice
    private Date dataVencimento;// Data de vencimento da apólice

    /**
     * Construtor para inicializar uma Apólice com todos os atributos.
     *
     * @param numeroApolice Número único da apólice
     * @param seguro Seguro relacionado à apólice
     * @param dataEmissao Data de emissão da apólice
     * @param dataVencimento Data de vencimento da apólice
     */
    public Apolice(int numeroApolice, Seguro seguro, Date dataEmissao, Date dataVencimento) {
        this.numeroApolice = numeroApolice;
        this.seguro = seguro;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
    }

    /**
     * Obtém o número da apólice.
     *
     * @return Número da apólice.
     */
    public int getNumeroApolice() {
        return numeroApolice;
    }

    /**
     * Define o número da apólice.
     *
     * @param numeroApolice Novo número da apólice.
     */
    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    /**
     * Obtém o seguro relacionado à apólice.
     *
     * @return Seguro relacionado à apólice.
     */
    public Seguro getSeguro() {
        return seguro;
    }

    /**
     * Define o seguro relacionado à apólice.
     *
     * @param seguro Novo seguro relacionado à apólice.
     */
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    /**
     * Obtém a data de emissão da apólice.
     *
     * @return Data de emissão da apólice.
     */
    public Date getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define a data de emissão da apólice.
     *
     * @param dataEmissao Nova data de emissão da apólice.
     */
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * Obtém a data de vencimento da apólice.
     *
     * @return Data de vencimento da apólice.
     */
    public Date getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define a data de vencimento da apólice.
     *
     * @param dataVencimento Nova data de vencimento da apólice.
     */
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * Verifica se a apólice está vencida.
     *
     * @return true se a apólice está vencida, false caso contrário.
     */
    public boolean isApoliceVencida() {
        Date hoje = new Date();
        return hoje.after(dataVencimento);
    }

    /**
     * Exibe os detalhes da apólice.
     */
    public void exibirDetalhes() {
        System.out.println("Apólice número: " + numeroApolice);
        seguro.exibirDetalhes();
        System.out.println("Emissão: " + dataEmissao + " | Vencimento: " + dataVencimento);
    }
}
