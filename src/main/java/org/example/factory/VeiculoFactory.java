package org.example.factory;


import org.example.model.*;
import java.time.Year;

/**
 * Fábrica para criar instâncias de veículos.
 * Esta fábrica implementa o padrão Factory, permitindo a criação de diferentes tipos de veículos
 * (como Carro, Moto, Caminhão, Ônibus), sem que o código cliente precise saber as classes concretas.
 *
 * O cálculo do valor do seguro é realizado dinamicamente com base na idade do veículo,
 * sendo ajustado para diferentes tipos de veículos.
 *
 * @since 1.0
 * @version 1.1
 */
public class VeiculoFactory {

    /**
     * Cria uma instância de um veículo com base no tipo de veículo informado.
     *
     * @param tipo Tipo do veículo (ex: CARRO, MOTO, CAMINHAO, ONIBUS).
     * @param placa Placa do veículo.
     * @param marca Marca do veículo.
     * @param modelo Modelo do veículo.
     * @param ano Ano de fabricação do veículo.
     * @param cor Cor do veículo (representada pelo enum Cor).
     * @param combustivel Tipo de combustível utilizado pelo veículo (ex: Gasolina, Diesel, Elétrico).
     * @return Uma instância de Veiculo (ex: Carro, Moto, Caminhão, etc.).
     * @throws IllegalArgumentException Se o tipo de veículo informado for inválido.
     */
    public static Veiculo criarVeiculo(TipoVeiculo tipo, String placa, String marca, String modelo, int ano, Cor cor, String combustivel) {
        // Obtendo o ano atual dinamicamente para usar nos cálculos de seguro
        int anoAtual = Year.now().getValue();

        // Escolha do tipo de veículo a ser criado com base no parâmetro 'tipo'
        switch (tipo) {
            case CARRO:
                return new Veiculo() {
                    // Implementação dos métodos da interface Veiculo para o Carro
                    @Override
                    public String getPlaca() {
                        return placa;  // Retorna a placa do veículo
                    }

                    @Override
                    public String getMarca() {
                        return marca;  // Retorna a marca do veículo
                    }

                    @Override
                    public String getModelo() {
                        return modelo;  // Retorna o modelo do veículo
                    }

                    @Override
                    public int getAno() {
                        return ano;  // Retorna o ano de fabricação do veículo
                    }

                    @Override
                    public Cor getCor() {
                        return cor;  // Retorna a cor do veículo
                    }

                    @Override
                    public String getCombustivel() {
                        return combustivel;  // Retorna o tipo de combustível do veículo
                    }

                    @Override
                    public double calcularValorSeguro() {
                        // Cálculo do valor do seguro para um carro, com base no ano de fabricação.
                        int idadeDoCarro = anoAtual - ano;
                        double valorBase = 1000; // Valor base do seguro para carros.
                        return valorBase - (idadeDoCarro * 50); // Reduz o valor com base na idade do carro.
                    }
                };

            case MOTO:
                return new Veiculo() {
                    // Implementação dos métodos da interface Veiculo para a Moto
                    @Override
                    public String getPlaca() {
                        return placa;  // Retorna a placa da moto
                    }

                    @Override
                    public String getMarca() {
                        return marca;  // Retorna a marca da moto
                    }

                    @Override
                    public String getModelo() {
                        return modelo;  // Retorna o modelo da moto
                    }

                    @Override
                    public int getAno() {
                        return ano;  // Retorna o ano de fabricação da moto
                    }

                    @Override
                    public Cor getCor() {
                        return cor;  // Retorna a cor da moto
                    }

                    @Override
                    public String getCombustivel() {
                        return combustivel;  // Retorna o tipo de combustível da moto
                    }

                    @Override
                    public double calcularValorSeguro() {
                        // Cálculo do valor do seguro para uma moto.
                        int idadeDaMoto = anoAtual - ano;
                        double valorBase = 600; // Valor base do seguro para motos.
                        return valorBase - (idadeDaMoto * 30); // Reduz o valor com base na idade da moto.
                    }
                };

            case CAMINHAO:
                return new Veiculo() {
                    // Implementação dos métodos da interface Veiculo para o Caminhão
                    @Override
                    public String getPlaca() {
                        return placa;  // Retorna a placa do caminhão
                    }

                    @Override
                    public String getMarca() {
                        return marca;  // Retorna a marca do caminhão
                    }

                    @Override
                    public String getModelo() {
                        return modelo;  // Retorna o modelo do caminhão
                    }

                    @Override
                    public int getAno() {
                        return ano;  // Retorna o ano de fabricação do caminhão
                    }

                    @Override
                    public Cor getCor() {
                        return cor;  // Retorna a cor do caminhão
                    }

                    @Override
                    public String getCombustivel() {
                        return combustivel;  // Retorna o tipo de combustível do caminhão
                    }

                    @Override
                    public double calcularValorSeguro() {
                        // Cálculo do valor do seguro para um caminhão.
                        int idadeDoCaminhao = anoAtual - ano;
                        double valorBase = 1500; // Valor base do seguro para caminhões.
                        return valorBase - (idadeDoCaminhao * 70); // Reduz o valor com base na idade do caminhão.
                    }
                };

            case ONIBUS:
                return new Veiculo() {
                    // Implementação dos métodos da interface Veiculo para o Ônibus
                    @Override
                    public String getPlaca() {
                        return placa;  // Retorna a placa do ônibus
                    }

                    @Override
                    public String getMarca() {
                        return marca;  // Retorna a marca do ônibus
                    }

                    @Override
                    public String getModelo() {
                        return modelo;  // Retorna o modelo do ônibus
                    }

                    @Override
                    public int getAno() {
                        return ano;  // Retorna o ano de fabricação do ônibus
                    }

                    @Override
                    public Cor getCor() {
                        return cor;  // Retorna a cor do ônibus
                    }

                    @Override
                    public String getCombustivel() {
                        return combustivel;  // Retorna o tipo de combustível do ônibus
                    }

                    @Override
                    public double calcularValorSeguro() {
                        // Cálculo do valor do seguro para um ônibus.
                        int idadeDoOnibus = anoAtual - ano;
                        double valorBase = 2000; // Valor base do seguro para ônibus.
                        return valorBase - (idadeDoOnibus * 100); // Reduz o valor com base na idade do ônibus.
                    }
                };

            default:
                // Se o tipo de veículo for inválido, lançamos uma exceção.
                throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }
    }
}
