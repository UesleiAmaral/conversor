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

    public String resultadoDaConversao(Object moedaUm, double valorInput) {


        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);

        // INICIO DA CONVERSÃO DE REAIS PARA A MOEDA ESCOLHIDA

        if (moedaUm == "De Reais a Euros") {
            this.resultado = valorInput / this.euro;
            return this.msg += "€ " + df.format(this.resultado);

        }

        else if (moedaUm == "De Reais a Dolares") {
            this.resultado = valorInput / this.dolar;
            return msg += "US$ " + df.format(this.resultado);
        }

        else if (moedaUm == "De Reais a Libras Esterlinas") {
            this.resultado = valorInput / this.librasEsterlinas;
            return msg += "£ " + df.format(this.resultado);
        }

        else if (moedaUm == "De Reais a Peso Argentino") {
            this.resultado = valorInput / this.pesoArgentino;
            return msg += "$ " + df.format(this.resultado);
        }

        else if (moedaUm == "De Reais a Peso chileno") {
            this.resultado = valorInput / this.pesoChileno;
            return msg += "CLP$ " + df.format(this.resultado);

        }

        // INICIO DA CONVERSÃO DA MOEDA ESCOLHIDA PARA REAL

        else if (moedaUm == "De Euros a Reais") {
            this.resultado = valorInput * this.euro;
            return msg += reais + df.format(this.resultado);
        }

        else if (moedaUm == "De Dolares a Reais") {
            this.resultado = valorInput * this.dolar;
            return msg += reais + df.format(this.resultado);
        }

        else if (moedaUm == "De Libras Esterlinas a Reais") {
            this.resultado = valorInput * this.librasEsterlinas;
            return msg += reais + df.format(this.resultado);
        }

        else if (moedaUm == "De Peso Argentino a Reais") {
            this.resultado = valorInput * this.pesoArgentino;
            return msg += reais + df.format(this.resultado);

        } else if (moedaUm == "De Peso chileno a Reais") {
            this.resultado = valorInput * this.pesoChileno;
            return msg += reais + df.format(this.resultado);
        };

        return this.msg = "Valor Invalido!";

    };
}
