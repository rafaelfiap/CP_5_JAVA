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

    /**
     * Renova a apólice, definindo uma nova data de término.
     *
     * @param apolice A apólice a ser renovada.
     * @param novaDataTermino A nova data de término da apólice.
     */
    public void renovarApolice(Apolice apolice, LocalDate novaDataTermino) {
        apolice.setDataTermino(novaDataTermino);
    }

    /**
     * Cancela a apólice, definindo a data de término como a data atual.
     *
     * @param apolice A apólice a ser cancelada.
     */
    public void cancelarApolice(Apolice apolice) {
        apolice.setDataTermino(LocalDate.now());
    }

    /**
     * Verifica se a apólice é válida com base nas datas de início e término.
     *
     * @param apolice A apólice a ser verificada.
     * @return true se a apólice for válida, false caso contrário.
     */
    public boolean verificarValidade(Apolice apolice) {
        LocalDate hoje = LocalDate.now();
        return (hoje.isAfter(apolice.getDataInicio()) || hoje.isEqual(apolice.getDataInicio())) &&
                hoje.isBefore(apolice.getDataTermino());
    }
}
