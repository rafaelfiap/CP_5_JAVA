package org.example.dao;

import org.example.model.Seguro;
import java.util.List;

/**
 * Interface SeguroDao que define os métodos de acesso a dados para a entidade Seguro.
 * Contém métodos para adicionar, buscar, listar, atualizar e remover seguros.
 *
 * Esta interface é responsável por encapsular as operações de persistência e oferecer uma API
 * para a lógica de negócios interagir com a camada de dados.
 *
 * @since 1.0
 * @version 1.0
 */
public interface SeguroDao {

    /**
     * Adiciona um novo seguro à base de dados.
     *
     * @param seguro Objeto Seguro a ser adicionado.
     */
    void adicionarSeguro(Seguro seguro);

    /**
     * Busca um seguro específico pelo número da apólice.
     *
     * @param numero Número único da apólice do seguro.
     * @return O seguro encontrado, ou null se nenhum seguro com o número de apólice especificado for encontrado.
     */
    Seguro buscarSeguroPorNumero(String numero);

    /**
     * Retorna uma lista com todos os seguros registrados.
     *
     * @return Lista de seguros.
     */
    List<Seguro> listarSeguros();

    /**
     * Atualiza as informações de um seguro existente.
     *
     * @param seguro O seguro atualizado com as novas informações.
     */
    void atualizarSeguro(Seguro seguro);

    /**
     * Remove um seguro da base de dados pelo número da apólice.
     *
     * @param numero O número da apólice do seguro a ser removido.
     */
    void removerSeguro(String numero);
}
