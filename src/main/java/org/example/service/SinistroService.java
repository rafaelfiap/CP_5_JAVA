package org.example.service;

import org.example.model.Sinistro;
import java.time.LocalDate;
import java.util.List;

/**
 * Interface para a camada de serviço de sinistro.
 * Define as operações que podem ser realizadas sobre os sinistros, como registro, atualização, cálculo de indenização, etc.
 * Esta camada é responsável por implementar a lógica de negócios relacionada aos sinistros.
 *
 * @since 1.0
 * @version 1.2
 */
public interface SinistroService {

    /**
     * Registra um novo sinistro no sistema.
     * O sinistro deve conter todas as informações necessárias, como data do evento e número.
     *
     * @param sinistro O sinistro a ser registrado.
     */
    void registrarSinistro(Sinistro sinistro);

    /**
     * Busca um sinistro pelo número.
     * Retorna o sinistro correspondente ao número informado ou null se não for encontrado.
     *
     * @param numero O número do sinistro a ser buscado.
     * @return O sinistro correspondente ao número, ou null se não encontrado.
     */
    Sinistro buscarSinistro(String numero);

    /**
     * Remove um sinistro do sistema.
     * O sinistro é removido com base no seu número único.
     *
     * @param numero O número do sinistro a ser removido.
     */
    void removerSinistro(String numero);

    /**
     * Lista todos os sinistros registrados no sistema.
     * Retorna uma lista contendo todos os sinistros.
     *
     * @return Uma lista de sinistros.
     */
    List<Sinistro> listarTodos();

    /**
     * Atualiza um sinistro existente no sistema.
     * Substitui os dados do sinistro com as informações atualizadas.
     *
     * @param sinistro O sinistro com os dados atualizados.
     */
    void atualizarSinistro(Sinistro sinistro);

    /**
     * Verifica se um sinistro com o número fornecido existe no sistema.
     *
     * @param numero O número do sinistro a ser verificado.
     * @return true se o sinistro existir, false caso contrário.
     */
    boolean existeSinistro(String numero);

    /**
     * Lista todos os sinistros que ocorreram em uma data específica.
     * Retorna uma lista de sinistros que ocorreram na data fornecida.
     *
     * @param data A data dos sinistros a serem buscados.
     * @return Uma lista de sinistros ocorridos na data especificada.
     */
    List<Sinistro> listarSinistrosPorData(LocalDate data);

    /**
     * Calcula o valor da indenização para um sinistro específico.
     * O cálculo pode levar em consideração fatores como o valor do bem segurado e as condições do evento.
     *
     * @param sinistro O sinistro para o qual o valor de indenização será calculado.
     * @return O valor da indenização calculado para o sinistro.
     */
    double calcularIndenizacao(Sinistro sinistro);

    /**
     * Calcula o valor total de todas as indenizações pagas.
     * Este método soma os valores de indenização de todos os sinistros registrados.
     *
     * @return O valor total das indenizações pagas.
     */
    double calcularTotalIndenizacoes();
}
