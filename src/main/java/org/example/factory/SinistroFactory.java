package org.example.factory;

import org.example.model.Apolice;
import org.example.model.Cliente;
import org.example.model.Endereco;
import org.example.model.Sinistro;
import java.time.LocalDate;

/**
 * Fábrica para a criação de instâncias da classe Sinistro.
 * Centraliza a lógica de criação de sinistros utilizando o padrão Factory para desacoplar a criação do código cliente.
 *
 * @since 1.0
 * @version 1.0
 */
public class SinistroFactory {

    /**
     * Cria uma nova instância da classe Sinistro com os parâmetros fornecidos.
     *
     * @param numeroSinistro O número único do sinistro.
     * @param dataEvento A data em que o sinistro ocorreu.
     * @param cliente O cliente associado ao sinistro.
     * @param apolice A apólice coberta pelo sinistro.
     * @param endereco O endereço onde ocorreu o sinistro.
     * @return Um novo objeto Sinistro.
     */
    public static Sinistro criarSinistro(String numeroSinistro, LocalDate dataEvento, Cliente cliente, Apolice apolice, Endereco endereco) {
        return new Sinistro(numeroSinistro, dataEvento, cliente, apolice, endereco);
    }
}
