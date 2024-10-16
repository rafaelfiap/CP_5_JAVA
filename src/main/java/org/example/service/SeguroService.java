package org.example.service;

import org.example.model.Seguro;

import java.time.LocalDate;

/**
 * Interface SeguroService define as operações de negócio para a entidade Seguro.
 * Contém métodos para cálculo de valor, renovação, cancelamento, verificação de validade
 * e outros métodos relacionados ao gerenciamento de seguros.
 *
 * @since 1.0
 * @version 1.2
 */
public interface SeguroService {

    /**
     * Calcula o valor do seguro com base nas características do veículo e do seguro.
     *
     * @param seguro O seguro cujo valor será calculado.
     * @return O valor calculado do seguro.
     */
    double calcularValor(Seguro seguro);

    /**
     * Renova o seguro, atualizando a data de término.
     *
     * @param seguro O seguro a ser renovado.
     * @param novaDataTermino A nova data de término do seguro.
     */
    void renovarSeguro(Seguro seguro, LocalDate novaDataTermino);

    /**
     * Cancela o seguro, definindo a data de término como a data atual.
     *
     * @param seguro O seguro a ser cancelado.
     */
    void cancelarSeguro(Seguro seguro);

    /**
     * Verifica a validade do seguro com base nas datas de início e término.
     *
     * @param seguro O seguro cuja validade será verificada.
     * @return true se o seguro for válido, false caso contrário.
     */
    boolean verificarValidade(Seguro seguro);

    /**
     * Atualiza o valor do seguro.
     *
     * @param seguro O seguro cujo valor será atualizado.
     * @param novoValor O novo valor do seguro.
     */
    void atualizarValorSeguro(Seguro seguro, double novoValor);

    /**
     * Registra um sinistro para o seguro.
     *
     * @param seguro O seguro no qual o sinistro será registrado.
     */
    void registrarSinistro(Seguro seguro);

    /**
     * Calcula o prêmio do seguro com base em informações do seguro.
     *
     * @param seguro O seguro cujo prêmio será calculado.
     * @return O valor do prêmio do seguro.
     */
    double calcularPremio(Seguro seguro);

    /**
     * Realiza a renovação automática do seguro, se necessário, ao verificar a proximidade da data de término.
     *
     * @param seguro O seguro a ser renovado automaticamente.
     */
    void renovacaoAutomatica(Seguro seguro);
}
