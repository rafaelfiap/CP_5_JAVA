package org.example.service;

import org.example.model.Apolice;
import java.time.LocalDate;
import java.util.List;

/**
 * Interface que define os serviços relacionados à apólice de seguro.
 * Contém métodos para cálculo de valor, renovação, cancelamento, verificação de validade,
 * listagem de apólices e geração de relatórios.
 *
 * @since 1.0
 * @version 1.2
 */
public interface ApoliceService {

    /**
     * Calcula o valor da apólice com base no veículo e no cliente.
     *
     * @param apolice A apólice para a qual o valor será calculado.
     * @return O valor calculado da apólice.
     */
    double calcularValor(Apolice apolice);

    /**
     * Renova a apólice, alterando a data de término.
     *
     * @param apolice A apólice a ser renovada.
     * @param novaDataTermino A nova data de término da apólice.
     */
    void renovarApolice(Apolice apolice, LocalDate novaDataTermino);

    /**
     * Cancela a apólice, definindo a data de término como a data atual.
     *
     * @param apolice A apólice a ser cancelada.
     */
    void cancelarApolice(Apolice apolice);

    /**
     * Verifica se a apólice ainda é válida.
     *
     * @param apolice A apólice a ser verificada.
     * @return true se a apólice for válida, false caso contrário.
     */
    boolean verificarValidade(Apolice apolice);

    /**
     * Lista todas as apólices registradas no sistema.
     *
     * @return Uma lista contendo todas as apólices.
     */
    List<Apolice> listarApolices();

    /**
     * Gera um relatório de apólices dentro de um determinado período.
     *
     * @param dataInicio A data de início do período.
     * @param dataTermino A data de término do período.
     * @return Uma lista de apólices que foram emitidas dentro do período especificado.
     */
    List<Apolice> gerarRelatorio(LocalDate dataInicio, LocalDate dataTermino);
}
