package org.example.service;

import org.example.model.Cliente;
import java.time.LocalDate;
import java.time.Period;

/**
 * Implementação da interface ClienteService.
 * Contém a lógica de negócio para calcular a idade do cliente e aplicar descontos no seguro.
 *
 * @since 1.0
 * @version 1.0
 */
public class ClienteServiceImpl implements ClienteService {

    /**
     * Calcula o desconto para o cliente com base na idade.
     * Clientes com mais de 60 anos recebem 10% de desconto.
     *
     * @param cliente O cliente para o qual o desconto será calculado.
     * @return O percentual de desconto (de 0 a 1).
     */
    @Override
    public double calcularDesconto(Cliente cliente) {
        int idade = calcularIdade(cliente);
        if (idade > 60) {
            return 0.10;  // 10% de desconto para clientes acima de 60 anos
        }
        return 0.0;  // Sem desconto
    }

    /**
     * Calcula a idade do cliente com base na data de nascimento.
     *
     * @param cliente O cliente cuja idade será calculada.
     * @return A idade do cliente.
     */
    @Override
    public int calcularIdade(Cliente cliente) {
        return Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
    }
}
