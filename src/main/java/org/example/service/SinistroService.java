package org.example.service;

import org.example.model.Sinistro;
import java.time.LocalDate;
import java.util.List;

/**
 * Interface para a camada de serviço de sinistro.
 * Define as operações que podem ser realizadas sobre os sinistros, como registro, atualização, cálculo de indenização, etc.
 *
 * @since 1.0
 * @version 1.2
 */
public interface SinistroService {

    void registrarSinistro(Sinistro sinistro);

    Sinistro buscarSinistro(String numero);

    void removerSinistro(String numero);

    List<Sinistro> listarTodos();

    void atualizarSinistro(Sinistro sinistro);

    boolean existeSinistro(String numero);

    List<Sinistro> listarSinistrosPorData(LocalDate data);

    double calcularIndenizacao(Sinistro sinistro);

    double calcularTotalIndenizacoes();
}
