package medidas;
public class ConversaoMedida {

    private String msg;
    private double kmMetros = 1000;
    private double metrosCentimetros = 100;
    private double centimetrosMilimetros = 10;
    private double resultado;
    private Medidas medidas = new Medidas();
    public String resultadoDaMedida(Object medida, double medidaUsuario) {

        if (medida == this.medidas.getMedidas()[0]) {
            this.resultado = medidaUsuario * this.kmMetros;
            this.msg = this.resultado + " Metros";
            return this.msg;

        } else if (medida == this.medidas.getMedidas()[1]) {
            this.resultado = medidaUsuario * this.metrosCentimetros;
            this.msg = this.resultado + " Centimetros";
            return this.msg;

        } else if (medida == this.medidas.getMedidas()[2]) {
            this.resultado = medidaUsuario * this.centimetrosMilimetros;
            this.msg = this.resultado + " Milímetros";
            return this.msg;
        }
        ;

        return this.msg = "Valor invalido!!";

    };
}
