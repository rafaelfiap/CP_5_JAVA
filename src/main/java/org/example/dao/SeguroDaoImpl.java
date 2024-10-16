package org.example.dao;

import org.example.dao.SeguroDao;
import org.example.model.Seguro;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface SeguroDao, utilizando uma lista em memória
 * para armazenar os seguros. Simula a persistência de dados.
 *
 * @since 1.0
 * @version 1.1
 */
public class SeguroDaoImpl implements SeguroDao {

    // Lista que simula o armazenamento de seguros em memória
    private List<Seguro> seguros = new ArrayList<>();

    @Override
    public void adicionarSeguro(Seguro seguro) {
        seguros.add(seguro); // Adiciona o seguro à lista
    }

    @Override
    public Seguro buscarSeguroPorNumero(String numero) {
        // Busca o seguro pelo número
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroSeguro().equals(numero)) {
                return seguro;
            }
        }
        return null; // Retorna null se não encontrado
    }

    @Override
    public List<Seguro> listarSeguros() {
        return seguros; // Retorna todos os seguros cadastrados
    }

    @Override
    public void atualizarSeguro(Seguro seguro) {
        Seguro seguroExistente = buscarSeguroPorNumero(seguro.getNumeroSeguro());
        if (seguroExistente != null) {
            seguros.remove(seguroExistente);
            seguros.add(seguro); // Substitui o seguro antigo pelo atualizado
        }
    }

    @Override
    public void removerSeguro(String numero) {
        Seguro seguro = buscarSeguroPorNumero(numero);
        if (seguro != null) {
            seguros.remove(seguro); // Remove o seguro encontrado
        }
    }
}
