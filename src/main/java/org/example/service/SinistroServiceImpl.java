package org.example.service;

import org.example.dao.SinistroDao;
import org.example.model.Sinistro;

import java.util.List;

/**
 * Implementação da interface SinistroService.
 * Fornece a lógica de negócios para gerenciar sinistros, incluindo registro, busca, remoção e listagem.
 *
 * @since 1.0
 * @version 1.0
 */
public class SinistroServiceImpl implements SinistroService {

    // Dependência da camada de persistência, injetada no construtor.
    private SinistroDao sinistroDao;

    /**
     * Construtor da classe SinistroServiceImpl.
     * Inicializa a implementação com um objeto SinistroDao para acesso ao repositório de dados.
     *
     * @param sinistroDao A instância de SinistroDao usada para persistência.
     */
    public SinistroServiceImpl(SinistroDao sinistroDao) {
        this.sinistroDao = sinistroDao;
    }

    /**
     * Registra um novo sinistro no sistema utilizando o DAO para persistência.
     *
     * @param sinistro O sinistro a ser registrado.
     */
    @Override
    public void registrarSinistro(Sinistro sinistro) {
        sinistroDao.adicionarSinistro(sinistro);
    }

    /**
     * Busca um sinistro pelo número utilizando o DAO para busca.
     *
     * @param numero O número do sinistro.
     * @return O sinistro encontrado, ou null se não for encontrado.
     */
    @Override
    public Sinistro buscarSinistro(String numero) {
        return sinistroDao.buscarSinistroPorNumero(numero);
    }

    /**
     * Remove um sinistro do sistema utilizando o DAO para remoção.
     *
     * @param numero O número do sinistro a ser removido.
     */
    @Override
    public void removerSinistro(String numero) {
        sinistroDao.removerSinistro(numero);
    }

    /**
     * Retorna uma lista com todos os sinistros registrados no sistema.
     *
     * @return Lista de sinistros.
     */
    @Override
    public List<Sinistro> listarTodos() {
        return sinistroDao.listarSinistros();
    }
}
