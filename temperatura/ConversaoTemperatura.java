package temperatura;
public class ConversaoTemperatura {
  /*
   * INICIAR A CAPTURA E CONVERSÃO DA TEMPERATURA ESCOLHIDA
   * CONTINUAR A ASSISTIR E GRAVAR AS AULAS DE JAVA
   */
  private String msg = "O valor da conversão é ";
  private double resultado;
  private double kelvinCelsius = 273.15;
  private double fahrenheitKelvin = 459.67;
  private double fahrenheit = 32;
  private double celsiusFahrenheit = 1.8;

  public String resultadoTemperatura(Object temperatura, double valorInput) {

    if (temperatura == "Celsius para Fahrenheit") {
      this.resultado = valorInput * celsiusFahrenheit + fahrenheit;
      return this.msg += this.resultado;

    } else if (temperatura == "Celsius para Kelvin") {
      this.resultado += valorInput + kelvinCelsius;
      return this.msg += this.resultado;

    } else if (temperatura == "Fahrenheit para Celsius") {
      this.resultado += (valorInput - fahrenheit) / celsiusFahrenheit;
      return this.msg += this.resultado;

    } else if (temperatura == "Fahrenheit para Kelvin") {
      this.resultado += (valorInput + fahrenheitKelvin) * (5 / 9);
      return this.msg += this.resultado;

    } else if (temperatura == "Kelvin para Celsius") {
      this.resultado += valorInput - kelvinCelsius;
      return this.msg += this.resultado;

    } else if (temperatura == "Kelvin para Fahrenheit") {
      this.resultado += (valorInput * 9 / 5) - fahrenheitKelvin;
      return this.msg += this.resultado;

    };

    return this.msg = "Valor Invalido!";

  };

}