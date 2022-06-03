/*
        CRIAR UMA NOVA CLASS PARA REALIZAR UM FOR NAS OPCOES EM TEMPERATURA E MOEDA.
        E RETORNAR AS VARIAVEIS COM AS OPCOES.

*/

import javax.swing.*;

import medidas.Medidas;
import moedas.Moedas;
import temperatura.Temperatura;
import opcoes.Opcoes;
import opcoes.Confirma;
import medidas.ConversaoMedida;
import moedas.ConversaoMoeda;
import temperatura.ConversaoTemperatura;

public class App {

        public static void main(String[] args) {

                Moedas moeda = new Moedas();
                Temperatura temperatura = new Temperatura();
                Medidas medidas = new Medidas();
                ConversaoMoeda conversaoMoeda = new ConversaoMoeda();
                ConversaoTemperatura conversaoTemperatura = new ConversaoTemperatura();
                ConversaoMedida conversaoMedida = new ConversaoMedida();

                Opcoes opcoes = new Opcoes();
                Object opcaoSelecionada = JOptionPane.showInputDialog(
                                null,
                                "escolha um item",
                                "conversor",
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                opcoes.getOpcoes(),
                                opcoes.getOpcoes());

                // TEMPERATURA
                if (opcaoSelecionada == "Temperatura") {
                        Object temperaturaEscolhida = JOptionPane.showInputDialog(
                                        null,
                                        "escolha a Moeda a ser convertida!!",
                                        "conversor",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null,
                                        temperatura.getTemperatura(),
                                        temperatura.getTemperatura());

                        String temperaturaUsuario = javax.swing.JOptionPane.showInputDialog(
                                        null,
                                        "Digite o valor a ser convertido");
                        javax.swing.JOptionPane.showMessageDialog(null,
                                        conversaoTemperatura.resultadoTemperatura(
                                                        temperaturaEscolhida,
                                                        Double.parseDouble(temperaturaUsuario)));

                        // MOEDA
                } else if (opcaoSelecionada == "Moeda") {
                        Object moedaSelecionada = JOptionPane.showInputDialog(
                                        null,
                                        "escolha a Moeda a ser convertida!!",
                                        "conversor",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null,
                                        moeda.getMoedas(),
                                        moeda.getMoedas());

                        String moedaUsuario = javax.swing.JOptionPane.showInputDialog(
                                        null,
                                        "Digite o valor a ser convertido");

                        // * CONVERSÃO AQUI

                        javax.swing.JOptionPane.showMessageDialog(null,
                                        conversaoMoeda.resultadoDaConversao(
                                                        moedaSelecionada,
                                                        Double.parseDouble(moedaUsuario)));

                        // KM, Metros, Centimetros e Milimetros
                } else if (opcaoSelecionada == "Medida") {
                        Object medidaSelecionada = JOptionPane.showInputDialog(
                                        null,
                                        "escolha a Moeda a ser convertida!!",
                                        "conversor",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null,
                                        medidas.getMedidas(),
                                        medidas.getMedidas());

                        String medidaUsuario = javax.swing.JOptionPane.showInputDialog(
                                        null,
                                        "Digite o valor a ser convertido");

                        // * CONVERSÃO AQUI

                        javax.swing.JOptionPane.showMessageDialog(null,
                                        conversaoMedida.resultadoDaMedida(
                                                        medidaSelecionada,
                                                        Double.parseDouble(medidaUsuario)));
                }
                Confirma confirma = new Confirma();
                int retornoDoTeste = confirma.confirmar();

                switch (retornoDoTeste) {
                        case 0:
                                main(args);
                                break;
                        case 1:
                                javax.swing.JOptionPane.showMessageDialog(null, "Programa finalizado");
                                break;

                        case 2:
                                javax.swing.JOptionPane.showMessageDialog(null, "Programa concluído");
                                break;
                        default:
                                break;
                }
        };
}
