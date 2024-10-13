package org.example.model;


/**
 * Classe que representa um Cliente no sistema de seguros.
 * O cliente possui informações pessoais como CPF, nome, endereço, telefone, email e sexo.
 * Esta classe inclui métodos para manipular e exibir as informações do cliente.
 *
 * @since 1.0
 * @version 1.0
 */
public class Cliente {
    private String cpf;        // CPF do cliente
    private String nome;       // Nome completo do cliente
    private Endereco endereco; // Endereço do cliente
    private String telefone;   // Telefone do cliente (armazenado como String)
    private String email;      // Email do cliente
    private char sexo;         // Sexo do cliente (M/F)

    /**
     * Construtor para inicializar um Cliente com todos os atributos.
     *
     * @param cpf CPF do cliente
     * @param nome Nome completo do cliente
     * @param endereco Endereço residencial do cliente
     * @param telefone Telefone de contato do cliente
     * @param email Email do cliente
     * @param sexo Sexo do cliente
     */
    public Cliente(String cpf, String nome, Endereco endereco, String telefone, String email, char sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    /**
     * Obtém o CPF do cliente.
     *
     * @return CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     *
     * @param cpf Novo CPF do cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o nome completo do cliente.
     *
     * @return Nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome completo do cliente.
     *
     * @param nome Novo nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o endereço do cliente.
     *
     * @return Endereço do cliente.
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     *
     * @param endereco Novo endereço do cliente.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o telefone do cliente.
     *
     * @return Telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do cliente.
     *
     * @param telefone Novo telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o email do cliente.
     *
     * @return Email do cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do cliente.
     *
     * @param email Novo email do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o sexo do cliente.
     *
     * @return Sexo do cliente (M/F).
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Define o sexo do cliente.
     *
     * @param sexo Novo sexo do cliente (M/F).
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Exibe os detalhes do cliente.
     * Inclui informações como nome, CPF, endereço, telefone e email.
     */
    public void exibirDetalhes() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf + " | Sexo: " + sexo);
        endereco.exibirEndereco();
        System.out.println("Telefone: " + telefone + " | Email: " + email);
    }
}
