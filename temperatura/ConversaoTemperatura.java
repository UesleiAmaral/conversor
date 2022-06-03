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
  private Temperatura temperatura = new Temperatura();

  public String resultadoTemperatura(Object temperaturaUsuario, double valorInput) {

    if (temperaturaUsuario == this.temperatura.getTemperatura()[0]) {
      this.resultado = valorInput * this.celsiusFahrenheit + this.fahrenheit;
      return this.msg += this.resultado;

    } else if (temperaturaUsuario == this.temperatura.getTemperatura()[1]) {
      this.resultado += valorInput + this.kelvinCelsius;
      return this.msg += this.resultado;

    } else if (temperaturaUsuario == this.temperatura.getTemperatura()[2]) {
      this.resultado += (valorInput - this.fahrenheit) / this.celsiusFahrenheit;
      return this.msg += this.resultado;

    } else if (temperaturaUsuario == this.temperatura.getTemperatura()[3]) {
      this.resultado += (valorInput + this.fahrenheitKelvin) * (5 / 9);
      return this.msg += this.resultado;

    } else if (temperaturaUsuario == this.temperatura.getTemperatura()[4]) {
      this.resultado += valorInput - this.kelvinCelsius;
      return this.msg += this.resultado;

    } else if (temperaturaUsuario == this.temperatura.getTemperatura()[5]) {
      this.resultado += (valorInput * 9 / 5) - this.fahrenheitKelvin;
      return this.msg += this.resultado;

    };

    return this.msg = "Valor Invalido!";

  };

}