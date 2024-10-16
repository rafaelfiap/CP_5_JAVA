package org.example.service;

import org.example.dao.SinistroDao;
import org.example.model.Sinistro;
import java.time.LocalDate;
import java.util.List;

/**
 * Implementação da interface SinistroService.
 * Fornece a lógica de negócios para gerenciar sinistros, incluindo registro, busca, remoção, atualização e listagem.
 * Esta classe é responsável por aplicar as regras de negócio aos sinistros antes de delegar a persistência ao DAO.
 *
 * @since 1.0
 * @version 1.2
 */
public class SinistroServiceImpl implements SinistroService {

    private final SinistroDao sinistroDao;

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
     * Este método valida e adiciona o sinistro ao repositório.
     *
     * @param sinistro O sinistro a ser registrado.
     */
    @Override
    public void registrarSinistro(Sinistro sinistro) {
        sinistroDao.adicionarSinistro(sinistro);
    }

    /**
     * Busca um sinistro no sistema utilizando o número do sinistro.
     * Utiliza o DAO para recuperar o sinistro correspondente ao número fornecido.
     *
     * @param numero O número do sinistro a ser buscado.
     * @return O sinistro encontrado ou null se não for encontrado.
     */
    @Override
    public Sinistro buscarSinistro(String numero) {
        return sinistroDao.buscarSinistroPorNumero(numero);
    }

    /**
     * Remove um sinistro do sistema utilizando o número do sinistro.
     * A operação é delegada ao DAO para remoção do sinistro persistido.
     *
     * @param numero O número do sinistro a ser removido.
     */
    @Override
    public void removerSinistro(String numero) {
        sinistroDao.removerSinistro(numero);
    }

    /**
     * Retorna uma lista com todos os sinistros registrados no sistema.
     * A lista é obtida utilizando o DAO que contém os sinistros persistidos.
     *
     * @return Lista de todos os sinistros.
     */
    @Override
    public List<Sinistro> listarTodos() {
        return sinistroDao.listarSinistros();
    }

    /**
     * Atualiza as informações de um sinistro existente no sistema.
     * Verifica se o sinistro existe e então aplica as atualizações ao registro.
     *
     * @param sinistro O sinistro com as informações atualizadas.
     */
    @Override
    public void atualizarSinistro(Sinistro sinistro) {
        Sinistro existente = sinistroDao.buscarSinistroPorNumero(sinistro.getNumeroSinistro());
        if (existente != null) {
            sinistroDao.atualizarSinistro(sinistro);
        }
    }

    /**
     * Verifica se um sinistro existe no sistema utilizando o número do sinistro.
     *
     * @param numero O número do sinistro a ser verificado.
     * @return true se o sinistro existir, false caso contrário.
     */
    @Override
    public boolean existeSinistro(String numero) {
        return sinistroDao.buscarSinistroPorNumero(numero) != null;
    }

    /**
     * Lista todos os sinistros que ocorreram em uma data específica.
     * Utiliza o DAO para buscar os sinistros com a data do evento correspondente.
     *
     * @param data A data dos sinistros a serem buscados.
     * @return Uma lista de sinistros que ocorreram na data fornecida.
     */
    @Override
    public List<Sinistro> listarSinistrosPorData(LocalDate data) {
        return sinistroDao.buscarSinistrosPorData(data);
    }

    /**
     * Calcula o valor da indenização para um sinistro específico.
     * O cálculo pode aplicar regras específicas de negócio, como fatores de risco ou outros critérios.
     *
     * @param sinistro O sinistro para o qual o valor de indenização será calculado.
     * @return O valor da indenização calculado.
     */
    @Override
    public double calcularIndenizacao(Sinistro sinistro) {
        // Exemplo de cálculo de indenização:
        // Aplicar regras de negócio para calcular o valor da indenização.
        double valorBase = 10000.0; // Valor base de exemplo
        double fatorRisco = 0.9;   // Exemplo de fator de risco
        return valorBase * fatorRisco; // Cálculo da indenização
    }

    /**
     * Calcula o valor total de todas as indenizações pagas no sistema.
     * Soma o valor da indenização de todos os sinistros registrados.
     *
     * @return O valor total de todas as indenizações pagas.
     */
    @Override
    public double calcularTotalIndenizacoes() {
        List<Sinistro> sinistros = sinistroDao.listarSinistros();
        return sinistros.stream().mapToDouble(this::calcularIndenizacao).sum();
    }
}
