package moedas;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ConversaoMoeda {

    private String msg = "O valor da conversão é ";
    private String reais = "R$";

    private double resultado;
    private double euro = 5.11;
    private double dolar = 4.75;
    private double librasEsterlinas = 6.00;
    private double pesoArgentino = 0.04;
    private double pesoChileno = 0.0057;
    private Moedas moedas = new Moedas();

    public String resultadoDaConversao(Object moedaUm, double valorInput) {


        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);

        // INICIO DA CONVERSÃO DE REAIS PARA A MOEDA ESCOLHIDA

        if (moedaUm == this.moedas.getMoedas()[0]) {
            this.resultado = valorInput / this.euro;
            return this.msg += "€ " + df.format(this.resultado);

        }

        else if (moedaUm == this.moedas.getMoedas()[1]) {
            this.resultado = valorInput / this.dolar;
            return this.msg += "US$ " + df.format(this.resultado);
        }

        else if (moedaUm == this.moedas.getMoedas()[2]) {
            this.resultado = valorInput / this.librasEsterlinas;
            return this.msg += "£ " + df.format(this.resultado);
        }

        else if (moedaUm == this.moedas.getMoedas()[3]) {
            this.resultado = valorInput / this.pesoArgentino;
            return this.msg += "$ " + df.format(this.resultado);
        }

        else if (moedaUm == this.moedas.getMoedas()[4]) {
            this.resultado = valorInput / this.pesoChileno;
            return this.msg += "CLP$ " + df.format(this.resultado);

        }

        // INICIO DA CONVERSÃO DA MOEDA ESCOLHIDA PARA REAL

        else if (moedaUm == this.moedas.getMoedas()[5]) {
            this.resultado = valorInput * this.euro;
            return this.msg += this.reais + df.format(this.resultado);
        }

        else if (moedaUm == this.moedas.getMoedas()[6]) {
            this.resultado = valorInput * this.dolar;
            return this.msg += this.reais + df.format(this.resultado);
        }

        else if (moedaUm == this.moedas.getMoedas()[7]) {
            this.resultado = valorInput * this.librasEsterlinas;
            return this.msg += this.reais + df.format(this.resultado);
        }

        else if (moedaUm == this.moedas.getMoedas()[8]) {
            this.resultado = valorInput * this.pesoArgentino;
            return this.msg += this.reais + df.format(this.resultado);

        } else if (moedaUm == this.moedas.getMoedas()[9]) {
            this.resultado = valorInput * this.pesoChileno;
            return this.msg += this.reais + df.format(this.resultado);
        };

        return this.msg = "Valor Invalido!";

    };
}
