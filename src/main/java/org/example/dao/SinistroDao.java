package org.example.dao;

import org.example.model.Sinistro;
import java.time.LocalDate;
import java.util.List;

/**
 * Interface que define os métodos para a persistência de sinistros no sistema.
 * Esta interface atua como um contrato para a implementação das operações de CRUD,
 * possibilitando a adição, busca, remoção, listagem e atualização de sinistros.
 *
 * @since 1.0
 * @version 1.1
 */
public interface SinistroDao {

    /**
     * Adiciona um sinistro ao repositório de sinistros.
     *
     * @param sinistro O sinistro a ser adicionado.
     */
    void adicionarSinistro(Sinistro sinistro);

    /**
     * Busca um sinistro pelo número do sinistro.
     *
     * @param numero O número único do sinistro.
     * @return O sinistro correspondente ou null se não for encontrado.
     */
    Sinistro buscarSinistroPorNumero(String numero);

    /**
     * Remove um sinistro do repositório pelo número do sinistro.
     *
     * @param numero O número único do sinistro a ser removido.
     */
    void removerSinistro(String numero);

    /**
     * Atualiza um sinistro existente no repositório.
     *
     * @param sinistro O sinistro atualizado a ser persistido.
     */
    void atualizarSinistro(Sinistro sinistro);

    /**
     * Retorna uma lista contendo todos os sinistros registrados no sistema.
     *
     * @return Lista de sinistros.
     */
    List<Sinistro> listarSinistros();

    /**
     * Busca uma lista de sinistros ocorridos em uma data específica.
     *
     * @param data A data dos sinistros a serem buscados.
     * @return Lista de sinistros ocorridos na data fornecida.
     */
    List<Sinistro> buscarSinistrosPorData(LocalDate data);
}
