package org.example.factory;

import org.example.model.Apolice;
import org.example.model.Cliente;
import org.example.model.Veiculo;

import java.time.LocalDate;

/**
 * Fábrica responsável pela criação de instâncias da classe Apolice.
 * Centraliza a lógica de criação, utilizando o padrão Factory para desacoplar a criação de instâncias.
 *
 * @since 1.0
 * @version 1.1
 */
public class ApoliceFactory {

    /**
     * Método estático responsável por criar uma nova instância de Apolice.
     *
     * @param numeroApolice Número da apólice.
     * @param cliente Cliente associado à apólice.
     * @param veiculo Veículo coberto pela apólice.
     * @param dataInicio Data de início da apólice.
     * @param dataTermino Data de término da apólice.
     * @return Uma nova instância da classe Apolice.
     */
    public static Apolice criarApolice(String numeroApolice, Cliente cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataTermino) {
        return new Apolice(numeroApolice, cliente, veiculo, dataInicio, dataTermino);
    }
}
