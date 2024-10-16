package org.example.dao;

import org.example.model.Seguro;
import java.util.List;

/**
 * Interface SeguroDao define as operações de persistência para a entidade Seguro.
 * As operações CRUD (Create, Read, Update, Delete) estão definidas nesta interface.
 *
 * @since 1.0
 * @version 1.0
 */
public interface SeguroDao {

    /**
     * Adiciona um seguro ao sistema.
     *
     * @param seguro O seguro a ser adicionado.
     */
    void adicionarSeguro(Seguro seguro);

    /**
     * Busca um seguro pelo número do seguro.
     *
     * @param numero O número do seguro a ser buscado.
     * @return O seguro encontrado ou null se não encontrado.
     */
    Seguro buscarSeguroPorNumero(String numero);

    /**
     * Lista todos os seguros cadastrados no sistema.
     *
     * @return Uma lista de todos os seguros cadastrados.
     */
    List<Seguro> listarSeguros();

    /**
     * Atualiza um seguro existente no sistema.
     *
     * @param seguro O seguro com as informações atualizadas.
     */
    void atualizarSeguro(Seguro seguro);

    /**
     * Remove um seguro do sistema pelo número do seguro.
     *
     * @param numero O número do seguro a ser removido.
     */
    void removerSeguro(String numero);
}
