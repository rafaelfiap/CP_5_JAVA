package org.example.dao;

import org.example.model.Seguro;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface SeguroDao.
 * Esta classe simula a persistência de dados em memória utilizando uma lista de seguros.
 *
 * Métodos fornecidos permitem realizar as operações CRUD (Create, Read, Update, Delete)
 * para a entidade Seguro.
 *
 * @since 1.0
 * @version 1.1
 */
public class SeguroDaoImpl implements SeguroDao {

    // Lista para armazenar os seguros em memória
    private List<Seguro> seguros = new ArrayList<>();

    /**
     * Adiciona um novo seguro à lista de seguros.
     *
     * @param seguro O seguro a ser adicionado.
     */
    @Override
    public void adicionarSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    /**
     * Busca um seguro pelo número da apolice.
     *
     * @param numero O número único da apolice do seguro.
     * @return O seguro encontrado, ou null se nenhum seguro com o número de apolice especificado for encontrado.
     */
    @Override
    public Seguro buscarSeguroPorNumero(String numero) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numero)) {
                return seguro;
            }
        }
        return null;
    }

    /**
     * Retorna uma lista com todos os seguros registrados.
     *
     * @return Lista de seguros.
     */
    @Override
    public List<Seguro> listarSeguros() {
        return seguros;
    }

    /**
     * Atualiza as informações de um seguro existente na lista.
     * Se o seguro não for encontrado, nenhuma ação é realizada.
     *
     * @param seguro O seguro atualizado com as novas informações.
     */
    @Override
    public void atualizarSeguro(Seguro seguro) {
        Seguro seguroExistente = buscarSeguroPorNumero(seguro.getNumeroApolice());
        if (seguroExistente != null) {
            seguros.remove(seguroExistente);
            seguros.add(seguro);
        }
    }

    /**
     * Remove um seguro da lista pelo número da apolice.
     *
     * @param numero O número da apolice do seguro a ser removido.
     */
    @Override
    public void removerSeguro(String numero) {
        Seguro seguro = buscarSeguroPorNumero(numero);
        if (seguro != null) {
            seguros.remove(seguro);
        }
    }
}
