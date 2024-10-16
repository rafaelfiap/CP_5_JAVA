package org.example.service;

import org.example.model.Seguro;
import org.example.service.SeguroService;

import java.time.LocalDate;

/**
 * Implementação da interface SeguroService.
 * Esta classe implementa a lógica de negócios para as operações de seguro,
 * como cálculo de valor, renovação, cancelamento, verificação de validade
 * e outros métodos relacionados à gestão de seguros.
 *
 * @since 1.0
 * @version 1.2
 */
public class SeguroServiceImpl implements SeguroService {

    /**
     * Calcula o valor do seguro com base nas características do veículo associado ao seguro.
     *
     * @param seguro O seguro cujo valor será calculado.
     * @return O valor calculado do seguro.
     */
    @Override
    public double calcularValor(Seguro seguro) {
        // Simulação de cálculo de valor com base no veículo
        double valorBase = seguro.getVeiculo().calcularValorSeguro();
        return valorBase;
    }

    /**
     * Renova o seguro, alterando a data de término.
     *
     * @param seguro          O seguro a ser renovado.
     * @param novaDataTermino A nova data de término.
     */
    @Override
    public void renovarSeguro(Seguro seguro, LocalDate novaDataTermino) {
        seguro.setDataTermino(novaDataTermino); // Atualiza a data de término do seguro
    }

    /**
     * Cancela o seguro, definindo a data de término como a data atual.
     *
     * @param seguro O seguro a ser cancelado.
     */
    @Override
    public void cancelarSeguro(Seguro seguro) {
        seguro.setDataTermino(LocalDate.now()); // Define a data atual como término
    }

    /**
     * Verifica se o seguro é válido com base nas datas de início e término.
     *
     * @param seguro O seguro cuja validade será verificada.
     * @return true se o seguro for válido, false caso contrário.
     */
    @Override
    public boolean verificarValidade(Seguro seguro) {
        LocalDate hoje = LocalDate.now();
        return hoje.isAfter(seguro.getDataInicio()) && hoje.isBefore(seguro.getDataTermino());
    }

    /**
     * Atualiza o valor do seguro com base em novos parâmetros.
     *
     * @param seguro O seguro cujo valor será atualizado.
     * @param novoValor O novo valor do seguro.
     */
    @Override
    public void atualizarValorSeguro(Seguro seguro, double novoValor) {
        seguro.setValor(novoValor); // Define o novo valor do seguro
    }

    /**
     * Registra um sinistro no seguro.
     *
     * @param seguro O seguro no qual o sinistro será registrado.
     */
    @Override
    public void registrarSinistro(Seguro seguro) {
        // Simulação de registro de sinistro
        System.out.println("Sinistro registrado para o seguro número: " + seguro.getNumeroSeguro());
    }

    /**
     * Calcula o prêmio do seguro, que é o valor pago pelo cliente periodicamente.
     *
     * @param seguro O seguro cujo prêmio será calculado.
     * @return O valor do prêmio do seguro.
     */
    @Override
    public double calcularPremio(Seguro seguro) {
        double valorBase = seguro.getValor();
        return valorBase; // O prêmio pode ser baseado no valor do seguro
    }

    /**
     * Realiza a renovação automática do seguro, se a data de término estiver próxima.
     *
     * @param seguro O seguro a ser renovado automaticamente.
     */
    @Override
    public void renovacaoAutomatica(Seguro seguro) {
        if (LocalDate.now().plusMonths(1).isAfter(seguro.getDataTermino())) {
            renovarSeguro(seguro, LocalDate.now().plusYears(1)); // Renova por mais um ano
            System.out.println("Seguro renovado automaticamente por mais um ano.");
        }
    }
}
