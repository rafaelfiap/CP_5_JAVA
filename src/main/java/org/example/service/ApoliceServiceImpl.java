package org.example.service;

import org.example.model.Apolice;

import org.example.service.ClienteService;
import org.example.dao.ApoliceDao;
import java.time.LocalDate;
import java.util.List;

/**
 * Implementação da interface ApoliceService.
 * Esta classe implementa a lógica de negócios para as operações de apólice, como cálculo de valor,
 * renovação, cancelamento, verificação de validade, listagem e geração de relatórios.
 *
 * @since 1.0
 * @version 1.2
 */
public class ApoliceServiceImpl implements ApoliceService {

    private ApoliceDao apoliceDao;         // Dependência para acessar o repositório de apólices
    private ClienteService clienteService; // Dependência para acessar serviços de cliente

    /**
     * Construtor que inicializa o serviço com um DAO de apólices e um serviço de cliente.
     *
     * @param apoliceDao Instância da classe que implementa ApoliceDao.
     * @param clienteService Instância da classe que implementa ClienteService.
     */
    public ApoliceServiceImpl(ApoliceDao apoliceDao, ClienteService clienteService) {
        this.apoliceDao = apoliceDao;
        this.clienteService = clienteService;
    }

    public ApoliceServiceImpl() {

    }

    /**
     * Calcula o valor da apólice com base no veículo e no cliente.
     *
     * @param apolice A apólice para a qual o valor será calculado.
     * @return O valor calculado da apólice.
     */
    @Override
    public double calcularValor(Apolice apolice) {
        double valorBase = apolice.getVeiculo().calcularValorSeguro(); // Calcula o valor base do seguro do veículo
        double desconto = clienteService.calcularDesconto(apolice.getCliente()); // Obtém o desconto do cliente através do ClienteService
        return valorBase * (1 - desconto); // Retorna o valor final com desconto aplicado
    }

    /**
     * Renova a apólice, alterando a data de término.
     *
     * @param apolice A apólice a ser renovada.
     * @param novaDataTermino A nova data de término da apólice.
     */
    @Override
    public void renovarApolice(Apolice apolice, LocalDate novaDataTermino) {
        apolice.setDataTermino(novaDataTermino); // Atualiza a data de término da apólice
        apoliceDao.atualizarApolice(apolice);   // Atualiza a apólice no repositório
    }

    /**
     * Cancela a apólice, definindo a data de término como a data atual.
     *
     * @param apolice A apólice a ser cancelada.
     */
    @Override
    public void cancelarApolice(Apolice apolice) {
        apolice.setDataTermino(LocalDate.now()); // Define a data de término para a data atual
        apoliceDao.atualizarApolice(apolice);    // Atualiza a apólice no repositório
    }

    /**
     * Verifica se a apólice ainda é válida.
     *
     * @param apolice A apólice a ser verificada.
     * @return true se a apólice for válida, false caso contrário.
     */
    @Override
    public boolean verificarValidade(Apolice apolice) {
        LocalDate hoje = LocalDate.now(); // Obtém a data atual
        return (hoje.isAfter(apolice.getDataInicio()) || hoje.isEqual(apolice.getDataInicio())) &&
                hoje.isBefore(apolice.getDataTermino()); // Verifica se a data atual está entre a data de início e término
    }

    /**
     * Lista todas as apólices registradas no sistema.
     *
     * @return Uma lista contendo todas as apólices.
     */
    @Override
    public List<Apolice> listarApolices() {
        return apoliceDao.listarApolices(); // Retorna todas as apólices do repositório
    }

    /**
     * Gera um relatório de apólices dentro de um determinado período.
     *
     * @param dataInicio A data de início do período.
     * @param dataTermino A data de término do período.
     * @return Uma lista de apólices que foram emitidas dentro do período especificado.
     */
    @Override
    public List<Apolice> gerarRelatorio(LocalDate dataInicio, LocalDate dataTermino) {
        List<Apolice> todasAsApolices = apoliceDao.listarApolices(); // Obtém todas as apólices
        return todasAsApolices.stream()
                .filter(apolice -> !apolice.getDataInicio().isBefore(dataInicio) && !apolice.getDataInicio().isAfter(dataTermino))
                .toList(); // Filtra as apólices que estão dentro do período
    }
}
