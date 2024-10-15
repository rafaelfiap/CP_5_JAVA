package org.example.service;

import org.example.model.Cliente;

/**
 * Interface para o serviço de Cliente.
 * Define os métodos que devem ser implementados pelo serviço relacionado ao cliente,
 * como o cálculo de idade e o cálculo de desconto.
 *
 * @since 1.0
 * @version 1.0
 */
public interface ClienteService {

    /**
     * Calcula o desconto para o cliente com base em suas características.
     *
     * @param cliente O cliente para o qual o desconto será calculado.
     * @return O percentual de desconto (de 0 a 1).
     */
    double calcularDesconto(Cliente cliente);

    /**
     * Calcula a idade do cliente com base na data de nascimento.
     *
     * @param cliente O cliente cuja idade será calculada.
     * @return A idade do cliente.
     */
    int calcularIdade(Cliente cliente);
}
