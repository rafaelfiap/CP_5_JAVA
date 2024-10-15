package org.example.factory;

import org.example.model.Cliente;
import org.example.model.Endereco;
import java.time.LocalDate;

/**
 * Fábrica responsável pela criação de instâncias da classe Cliente.
 * Utiliza o padrão Factory para centralizar a lógica de criação, permitindo que o código cliente
 * fique desacoplado do processo de instanciamento.
 *
 * @since 1.0
 * @version 1.1
 */
public class ClienteFactory {

    /**
     * Método estático responsável por criar uma nova instância de Cliente.
     *
     * @param cpf O CPF do cliente. Deve ser um número único que identifica o cliente.
     * @param nome O nome completo do cliente.
     * @param endereco O endereço de residência do cliente, representado pela classe Endereco.
     * @param telefone O telefone de contato do cliente.
     * @param email O email de contato do cliente.
     * @param sexo O sexo do cliente, representado por 'M' ou 'F'.
     * @param dataNascimento A data de nascimento do cliente.
     * @return Retorna uma nova instância da classe Cliente.
     */
    public static Cliente criarCliente(String cpf, String nome, Endereco endereco, String telefone, String email, char sexo, LocalDate dataNascimento) {
        // Cria e retorna uma nova instância de Cliente com os parâmetros fornecidos
        return new Cliente(cpf, nome, endereco, telefone, email, sexo);
    }
}
