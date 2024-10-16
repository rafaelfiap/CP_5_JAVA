package org.example.service;

import org.example.dao.SinistroDao;
import org.example.model.Sinistro;
import java.time.LocalDate;
import java.util.List;

/**
 * Implementação da interface SinistroService.
 * Fornece a lógica de negócios para gerenciar sinistros, incluindo registro, busca, remoção, atualização e listagem.
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

    @Override
    public void registrarSinistro(Sinistro sinistro) {
        sinistroDao.adicionarSinistro(sinistro);
    }

    @Override
    public Sinistro buscarSinistro(String numero) {
        return sinistroDao.buscarSinistroPorNumero(numero);
    }

    @Override
    public void removerSinistro(String numero) {
        sinistroDao.removerSinistro(numero);
    }

    @Override
    public List<Sinistro> listarTodos() {
        return sinistroDao.listarSinistros();
    }

    @Override
    public void atualizarSinistro(Sinistro sinistro) {
        Sinistro existente = sinistroDao.buscarSinistroPorNumero(sinistro.getNumeroSinistro());
        if (existente != null) {
            sinistroDao.atualizarSinistro(sinistro);
        }
    }

    @Override
    public boolean existeSinistro(String numero) {
        return sinistroDao.buscarSinistroPorNumero(numero) != null;
    }

    @Override
    public List<Sinistro> listarSinistrosPorData(LocalDate data) {
        return sinistroDao.buscarSinistrosPorData(data);
    }

    /**
     * Método para calcular a indenização do sinistro.
     * Aqui podemos aplicar as regras específicas de cálculo.
     *
     * @param sinistro O sinistro para o qual o valor de indenização será calculado.
     * @return O valor da indenização calculado.
     */
    @Override
    public double calcularIndenizacao(Sinistro sinistro) {
        // Exemplo de cálculo de indenização:
        // Podemos aplicar lógica de negócio para determinar o valor da indenização.
        double valorBase = 10000.0; // Valor base de exemplo
        double fatorRisco = 0.9;   // Exemplo de fator de risco
        return valorBase * fatorRisco; // Cálculo da indenização
    }

    /**
     * Método que calcula o valor total de todas as indenizações pagas.
     *
     * @return O valor total de indenizações.
     */
    @Override
    public double calcularTotalIndenizacoes() {
        List<Sinistro> sinistros = sinistroDao.listarSinistros();
        return sinistros.stream().mapToDouble(this::calcularIndenizacao).sum();
    }
}
