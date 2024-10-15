package org.example.service;

import org.example.model.Sinistro;
import java.util.List;

/**
 * Interface que define os métodos do serviço de sinistro.
 * Esta interface fornece operações de negócio para o gerenciamento de sinistros,
 * como o registro, busca, remoção e listagem de sinistros.
 *
 * @since 1.0
 * @version 1.0
 */
public interface SinistroService {

    /**
     * Registra um novo sinistro no sistema.
     *
     * @param sinistro O sinistro a ser registrado.
     */
    void registrarSinistro(Sinistro sinistro);

    /**
     * Busca um sinistro pelo número.
     *
     * @param numero O número do sinistro a ser buscado.
     * @return O sinistro encontrado, ou null se não for encontrado.
     */
    Sinistro buscarSinistro(String numero);

    /**
     * Remove um sinistro do sistema utilizando o número do sinistro.
     *
     * @param numero O número do sinistro a ser removido.
     */
    void removerSinistro(String numero);

    /**
     * Retorna uma lista com todos os sinistros registrados.
     *
     * @return Lista de sinistros.
     */
    List<Sinistro> listarTodos();
}
