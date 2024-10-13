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
 * @version 1.2
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
                return criarCarro(placa, marca, modelo, ano, cor, combustivel, anoAtual);

            case MOTO:
                return criarMoto(placa, marca, modelo, ano, cor, combustivel, anoAtual);

            case CAMINHAO:
                return criarCaminhao(placa, marca, modelo, ano, cor, combustivel, anoAtual);

            case ONIBUS:
                return criarOnibus(placa, marca, modelo, ano, cor, combustivel, anoAtual);

            default:
                throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }
    }

    // Métodos privados para cada tipo de veículo, mantendo o código mais organizado e modular

    private static Veiculo criarCarro(String placa, String marca, String modelo, int ano, Cor cor, String combustivel, int anoAtual) {
        return new Veiculo() {
            private String veiculoCombustivel = combustivel;
            private String veiculoMarca = marca;
            private Cor veiculoCor = cor;

            @Override
            public String getPlaca() {
                return placa;
            }

            @Override
            public String getMarca() {
                return veiculoMarca;
            }

            @Override
            public void setMarca(String marca) {
                this.veiculoMarca = marca;
            }

            @Override
            public void setModelo(String modelo) {

            }

            @Override
            public void setAno(int ano) {

            }

            @Override
            public String getModelo() {
                return modelo;
            }

            @Override
            public int getAno() {
                return ano;
            }

            @Override
            public Cor getCor() {
                return veiculoCor;
            }

            @Override
            public void setCor(Cor cor) {
                this.veiculoCor = cor;
            }

            @Override
            public String getCombustivel() {
                return veiculoCombustivel;
            }

            @Override
            public void setPlaca(String placa) {

            }

            @Override
            public void setCombustivel(String combustivel) {
                this.veiculoCombustivel = combustivel;
            }

            @Override
            public double calcularValorSeguro() {
                int idadeDoCarro = anoAtual - ano;
                double valorBase = 1000;
                return valorBase - (idadeDoCarro * 50);
            }

            @Override
            public String toString() {
                return "Carro: " + getMarca() + " " + getModelo() + ", Placa: " + getPlaca() +
                        ", Ano: " + getAno() + ", Cor: " + getCor() + ", Combustível: " + getCombustivel();
            }
        };
    }

    private static Veiculo criarMoto(String placa, String marca, String modelo, int ano, Cor cor, String combustivel, int anoAtual) {
        return new Veiculo() {
            private String veiculoCombustivel = combustivel;
            private String veiculoMarca = marca;
            private Cor veiculoCor = cor;

            @Override
            public String getPlaca() {
                return placa;
            }

            @Override
            public String getMarca() {
                return veiculoMarca;
            }

            @Override
            public void setMarca(String marca) {
                this.veiculoMarca = marca;
            }

            @Override
            public void setModelo(String modelo) {

            }

            @Override
            public void setAno(int ano) {

            }

            @Override
            public String getModelo() {
                return modelo;
            }

            @Override
            public int getAno() {
                return ano;
            }

            @Override
            public Cor getCor() {
                return veiculoCor;
            }

            @Override
            public void setCor(Cor cor) {
                this.veiculoCor = cor;
            }

            @Override
            public String getCombustivel() {
                return veiculoCombustivel;
            }

            @Override
            public void setPlaca(String placa) {

            }

            @Override
            public void setCombustivel(String combustivel) {
                this.veiculoCombustivel = combustivel;
            }

            @Override
            public double calcularValorSeguro() {
                int idadeDaMoto = anoAtual - ano;
                double valorBase = 600;
                return valorBase - (idadeDaMoto * 30);
            }

            @Override
            public String toString() {
                return "Moto: " + getMarca() + " " + getModelo() + ", Placa: " + getPlaca() +
                        ", Ano: " + getAno() + ", Cor: " + getCor() + ", Combustível: " + getCombustivel();
            }
        };
    }

    private static Veiculo criarCaminhao(String placa, String marca, String modelo, int ano, Cor cor, String combustivel, int anoAtual) {
        return new Veiculo() {
            private String veiculoCombustivel = combustivel;
            private String veiculoMarca = marca;
            private Cor veiculoCor = cor;

            @Override
            public String getPlaca() {
                return placa;
            }

            @Override
            public String getMarca() {
                return veiculoMarca;
            }

            @Override
            public void setMarca(String marca) {
                this.veiculoMarca = marca;
            }

            @Override
            public void setModelo(String modelo) {

            }

            @Override
            public void setAno(int ano) {

            }

            @Override
            public String getModelo() {
                return modelo;
            }

            @Override
            public int getAno() {
                return ano;
            }

            @Override
            public Cor getCor() {
                return veiculoCor;
            }

            @Override
            public void setCor(Cor cor) {
                this.veiculoCor = cor;
            }

            @Override
            public String getCombustivel() {
                return veiculoCombustivel;
            }

            @Override
            public void setPlaca(String placa) {

            }

            @Override
            public void setCombustivel(String combustivel) {
                this.veiculoCombustivel = combustivel;
            }

            @Override
            public double calcularValorSeguro() {
                int idadeDoCaminhao = anoAtual - ano;
                double valorBase = 1500;
                return valorBase - (idadeDoCaminhao * 70);
            }

            @Override
            public String toString() {
                return "Caminhão: " + getMarca() + " " + getModelo() + ", Placa: " + getPlaca() +
                        ", Ano: " + getAno() + ", Cor: " + getCor() + ", Combustível: " + getCombustivel();
            }
        };
    }

    private static Veiculo criarOnibus(String placa, String marca, String modelo, int ano, Cor cor, String combustivel, int anoAtual) {
        return new Veiculo() {
            private String veiculoCombustivel = combustivel;
            private String veiculoMarca = marca;
            private Cor veiculoCor = cor;

            @Override
            public String getPlaca() {
                return placa;
            }

            @Override
            public String getMarca() {
                return veiculoMarca;
            }

            @Override
            public void setMarca(String marca) {
                this.veiculoMarca = marca;
            }

            @Override
            public void setModelo(String modelo) {

            }

            @Override
            public void setAno(int ano) {

            }

            @Override
            public String getModelo() {
                return modelo;
            }

            @Override
            public int getAno() {
                return ano;
            }

            @Override
            public Cor getCor() {
                return veiculoCor;
            }

            @Override
            public void setCor(Cor cor) {
                this.veiculoCor = cor;
            }

            @Override
            public String getCombustivel() {
                return veiculoCombustivel;
            }

            @Override
            public void setPlaca(String placa) {

            }

            @Override
            public void setCombustivel(String combustivel) {
                this.veiculoCombustivel = combustivel;
            }

            @Override
            public double calcularValorSeguro() {
                int idadeDoOnibus = anoAtual - ano;
                double valorBase = 2000;
                return valorBase - (idadeDoOnibus * 100);
            }

            @Override
            public String toString() {
                return "Ônibus: " + getMarca() + " " + getModelo() + ", Placa: " + getPlaca() +
                        ", Ano: " + getAno() + ", Cor: " + getCor() + ", Combustível: " + getCombustivel();
            }
        };
    }
}
