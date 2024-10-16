package org.example.dao;

import org.example.model.Apolice;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface ApoliceDao, utilizando uma lista em memória
 * para armazenar as apólices. Simula um repositório de dados onde as apólices são persistidas.
 *
 * @since 1.0
 * @version 1.1
 */
public class ApoliceDaoImpl implements ApoliceDao {

    // Lista que simula um banco de dados em memória
    private List<Apolice> apolices = new ArrayList<>();

    /**
     * Adiciona uma nova apólice ao repositório de dados (em memória).
     *
     * @param apolice A apólice a ser adicionada.
     */
    @Override
    public void adicionarApolice(Apolice apolice) {
        apolices.add(apolice);
    }

    /**
     * Busca uma apólice pelo número da apólice.
     *
     * @param numeroApolice O número da apólice a ser buscada.
     * @return A apólice encontrada ou null se não for encontrada.
     */
    @Override
    public Apolice buscarApolicePorNumero(String numeroApolice) {
        for (Apolice apolice : apolices) {
            if (apolice.getNumeroApolice().equals(numeroApolice)) {
                return apolice;
            }
        }
        return null;  // Se não encontrada, retorna null
    }

    /**
     * Lista todas as apólices registradas.
     *
     * @return Uma lista de apólices.
     */
    @Override
    public List<Apolice> listarApolices() {
        return apolices;
    }

    /**
     * Atualiza as informações de uma apólice existente.
     *
     * @param apolice A apólice com as novas informações.
     */
    @Override
    public void atualizarApolice(Apolice apolice) {
        Apolice apoliceExistente = buscarApolicePorNumero(apolice.getNumeroApolice());
        if (apoliceExistente != null) {
            apolices.remove(apoliceExistente);  // Remove a apólice antiga
            apolices.add(apolice);  // Adiciona a nova
        }
    }

    /**
     * Remove uma apólice do repositório pelo número.
     *
     * @param numeroApolice O número da apólice a ser removida.
     */
    @Override
    public void removerApolice(String numeroApolice) {
        Apolice apolice = buscarApolicePorNumero(numeroApolice);
        if (apolice != null) {
            apolices.remove(apolice);  // Remove a apólice se encontrada
        }
    }
}
