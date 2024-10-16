package org.example.dao;

import org.example.model.Sinistro;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementação da interface SinistroDao.
 * Esta classe utiliza um HashMap para armazenar os sinistros em memória,
 * simulando a persistência de dados sem o uso de banco de dados.
 *
 * @since 1.0
 * @version 1.1
 */
public class SinistroDaoImpl implements SinistroDao {

    // HashMap para armazenar os sinistros. A chave é o número do sinistro.
    private Map<String, Sinistro> sinistros = new HashMap<>();

    /**
     * Adiciona um sinistro ao HashMap, utilizando o número do sinistro como chave.
     *
     * @param sinistro O sinistro a ser adicionado.
     */
    @Override
    public void adicionarSinistro(Sinistro sinistro) {
        sinistros.put(sinistro.getNumeroSinistro(), sinistro);
    }

    /**
     * Busca um sinistro no HashMap utilizando o número do sinistro.
     *
     * @param numero O número único do sinistro.
     * @return O sinistro encontrado, ou null se não existir.
     */
    @Override
    public Sinistro buscarSinistroPorNumero(String numero) {
        return sinistros.get(numero);
    }

    /**
     * Remove um sinistro do HashMap pelo número do sinistro.
     *
     * @param numero O número único do sinistro.
     */
    @Override
    public void removerSinistro(String numero) {
        sinistros.remove(numero);
    }

    /**
     * Atualiza um sinistro existente no HashMap.
     * Se o sinistro não existir, nenhum dado será atualizado.
     *
     * @param sinistro O sinistro atualizado a ser persistido.
     */
    @Override
    public void atualizarSinistro(Sinistro sinistro) {
        sinistros.put(sinistro.getNumeroSinistro(), sinistro);  // Sobrescreve o sinistro existente
    }

    /**
     * Retorna uma lista com todos os sinistros registrados no HashMap.
     *
     * @return Lista de sinistros.
     */
    @Override
    public List<Sinistro> listarSinistros() {
        return new ArrayList<>(sinistros.values());
    }

    /**
     * Busca uma lista de sinistros ocorridos em uma data específica.
     *
     * @param data A data dos sinistros a serem buscados.
     * @return Lista de sinistros ocorridos na data fornecida.
     */
    @Override
    public List<Sinistro> buscarSinistrosPorData(LocalDate data) {
        List<Sinistro> sinistrosNaData = new ArrayList<>();
        for (Sinistro sinistro : sinistros.values()) {
            if (sinistro.getDataEvento().isEqual(data)) {
                sinistrosNaData.add(sinistro);
            }
        }
        return sinistrosNaData;
    }
}
