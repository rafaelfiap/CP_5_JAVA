package org.example.factory;

import org.example.model.Cliente;
import org.example.model.Seguro;
import org.example.model.Veiculo;

import java.time.LocalDate;

/**
 * Fábrica para criar instâncias de Seguro.
 * Utiliza o padrão Factory para encapsular a criação de objetos de seguro,
 * facilitando a manutenção e desacoplamento do código.
 *
 * @since 1.0
 * @version 1.0
 */
public class SeguroFactory {

    /**
     * Cria uma nova instância de Seguro com os parâmetros fornecidos.
     *
     * @param numeroSeguro O número único do seguro.
     * @param cliente      O cliente que contratou o seguro.
     * @param veiculo      O veículo segurado pelo seguro.
     * @param dataInicio   A data de início do seguro.
     * @param dataTermino  A data de término do seguro.
     * @return Uma instância de Seguro.
     */
    public static Seguro criarSeguro(String numeroSeguro, Cliente cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataTermino) {
        return new Seguro(numeroSeguro, cliente, veiculo, dataInicio, dataTermino);
    }
}
