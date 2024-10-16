package org.example.dao;

import org.example.model.Apolice;
import java.util.List;

/**
 * Interface que define os métodos de acesso a dados (DAO) para a entidade Apolice.
 * Os métodos aqui definidos serão implementados para realizar operações de persistência
 * em uma base de dados ou em memória.
 *
 * @since 1.0
 * @version 1.0
 */
public interface ApoliceDao {

    /**
     * Adiciona uma nova apólice ao repositório de dados.
     *
     * @param apolice A apólice a ser adicionada.
     */
    void adicionarApolice(Apolice apolice);

    /**
     * Busca uma apólice pelo número.
     *
     * @param numeroApolice O número da apólice a ser buscada.
     * @return A apólice encontrada ou null se não for encontrada.
     */
    Apolice buscarApolicePorNumero(String numeroApolice);

    /**
     * Lista todas as apólices registradas no repositório.
     *
     * @return Uma lista de apólices.
     */
    List<Apolice> listarApolices();

    /**
     * Atualiza as informações de uma apólice existente no repositório de dados.
     *
     * @param apolice A apólice com as informações atualizadas.
     */
    void atualizarApolice(Apolice apolice);

    /**
     * Remove uma apólice do repositório de dados pelo número.
     *
     * @param numeroApolice O número da apólice a ser removida.
     */
    void removerApolice(String numeroApolice);
}
