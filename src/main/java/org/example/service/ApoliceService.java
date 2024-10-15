package org.example.service;

import org.example.model.Apolice;
import java.time.LocalDate;

/**
 * Classe de serviço responsável pelas operações de negócio relacionadas à Apólice.
 * Contém métodos para cálculo de valor, renovação, cancelamento e verificação de validade.
 *
 * @since 1.0
 * @version 1.0
 */
public class ApoliceService {

    /**
     * Calcula o valor da apólice com base no veículo e no cliente.
     *
     * @param apolice A apólice para a qual o valor será calculado.
     * @return O valor calculado da apólice.
     */
    public double calcularValor(Apolice apolice) {
        double valorBase = apolice.getVeiculo().calcularValorSeguro();  // Calcula o valor base do seguro do veículo
        double desconto = apolice.getCliente().calcularDesconto();      // Aplica um possível desconto ao cliente
        return valorBase * (1 - desconto);                              // Retorna o valor final com desconto aplicado
    }



}