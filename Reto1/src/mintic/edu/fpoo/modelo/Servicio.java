package mintic.edu.fpoo.modelo;

import mintic.edu.fpoo.vista.Presentacion;
import java.text.DecimalFormat;

/**
 *
 * @author Alejandro Meneses Roldan
 * Grupo 24
 */

public class Servicio {
    
    //Definir atributos
    private static final double IMPUESTO = 0.01;
    private String servicio;
    private String unidad;
    private String unidades;
    private double valorUnidad;
    private double descuento;
    private double incremento;
    private double impuesto;
    private double consumo;
    private int numero;
    
    //constructor
    public Servicio() {
    }

    public Servicio(String servicio, String unidad, String unidades, double valorUnidad, double descuento, double incremento, double impuesto, double consumo, int numero) {
        this.servicio = servicio;
        this.unidad = unidad;
        this.unidades = unidades;
        this.valorUnidad = valorUnidad;
        this.descuento = descuento;
        this.incremento = incremento;
        this.impuesto = impuesto;
        this.consumo = consumo;
        this.numero = numero;
    }

    //Setter 
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public void setValorUnidad(double valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    //Getter
    public static double getIMPUESTO() {
        return IMPUESTO;
    }

    public String getServicio() {
        return servicio;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getUnidades() {
        return unidades;
    }

    public double getValorUnidad() {
        return valorUnidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getIncremento() {
        return incremento;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public int getNumero() {
        return numero;
    }

    public double getConsumo() {
        return consumo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "servicio=" + servicio + ", unidad=" + unidad + ", unidades=" + unidades + ", valorUnidad=" + valorUnidad + ", descuento=" + descuento + ", incremento=" + incremento + ", impuesto=" + impuesto + ", consumo=" + consumo + ", numero=" + numero + '}';
    }
     
    public void asignarServicio(int opcion, int estrato, double consumo){
    setConsumo(consumo);
    switch (opcion){
        case 1:
            setServicio("AGUA");
            setUnidad("Metro Cubico");
            setUnidades("Metros Cubicos");
            setValorUnidad(9256);
            break;   
                
        case 2:
            setServicio("LUZ (ENERGIA)");
            setUnidad("KW (KiloWatt)");
            setUnidades("KWs (KiloWatts)");
            setValorUnidad(6200);
            break;
                
        case 3:
            setServicio("GAS NATURAL");
            setUnidad("Metro Cubico");
            setUnidades("Metros Cubicos");
            setValorUnidad(5234);
            break;              
        }
        if (estrato == 1){
                    setNumero(1);
                    setDescuento(0.5);
                    setIncremento(0.0);
                }
            else if (estrato == 2)
                {
                    setNumero(2);
                    setDescuento(0.5);
                    setIncremento(0.0);
                }
                else if (estrato == 3)
                    {
                        setNumero(3);
                        setDescuento(0.1);
                        setIncremento(0.0);
                    }
                    else if (estrato == 4)
                        {
                            setNumero(4);
                            setDescuento(0.1);
                            setIncremento(0.0);
                        }
                        else if (estrato == 5)
                            {
                                setNumero(5);
                                setDescuento(0.0);
                                setIncremento(0.25);
                            }
                            else if (estrato == 6)
                                {
                                    setNumero(5);
                                    setDescuento(0.0);
                                    setIncremento(0.25);
                                }
    //presentacionFinal();
    //calcularConsumo(consumo);
    //valorDescuento(calcularConsumo(consumo));
    //totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)));
    //valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))));    
    //totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))     , valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))));
    //valorImpuesto(totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))), valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))))); 
    //totalFinal(totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))     , valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))))) , valorImpuesto(totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))), valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))))));
    
    }
    /*
    public void presentacionFinal(){
        DecimalFormat formateador = new DecimalFormat("###,###.##");
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════════════");
        System.out.println("║      VERIFICACION DEL SERVICIO DE "+getServicio());
        System.out.println("╠═══════════════════════════════════════════════════╦═══════════════════════════");
        System.out.println("║ Estrato socioeconómico del predio                 ║   "+getNumero());
        System.out.println("║ Cantidad de unidades consumidas*                  ║   "+getConsumo()+" "+getUnidades());
        System.out.println("║ Valor de la factura sin descuentos o incrementos  ║ $ "+formateador.format(calcularConsumo(consumo)));
        System.out.println("║ Porcentaje de descuento pare el estrato "+getNumero()+"         ║   "+getDescuento()*100+" %");
        System.out.println("║ Valor del descuento de acuerdo al estrato         ║ $ "+formateador.format(valorDescuento(calcularConsumo(consumo))));
        System.out.println("║ valor del factura con descuento                   ║ $ "+formateador.format(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))));
        System.out.println("║ Porcentaje de incremento pare el estrato "+getNumero()+"        ║   "+getIncremento()*100+" %");
        System.out.println("║ Valor del incremento de acuerdo al estrato        ║ $ "+formateador.format(valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))))));
        System.out.println("║ valor del factura con incrementos                 ║ $ "+formateador.format(totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))     , valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))))));
        System.out.println("║ Porcentaje de incremento por impuestos **         ║   "+getIMPUESTO()*100+" %");
        System.out.println("║ Valor del incremento por impuestos                ║ $ "+formateador.format(valorImpuesto(totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))), valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))))))));
        System.out.println("╠═══════════════════════════════════════════════════╬═══════════════════════════");
        System.out.println("║                         VALOR TOTAL DE SU FACTURA ║ $ "+formateador.format(totalFinal(totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))     , valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))))) , valorImpuesto(totalConIncrementos(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo))), valorIncremento(totalConDescuento(calcularConsumo(consumo), valorDescuento(calcularConsumo(consumo)))))))));
        System.out.println("╚═══════════════════════════════════════════════════╩═══════════════════════════");
        System.out.println("");
        System.out.println("*Valor del "+getUnidad()+": $ "+formateador.format(getValorUnidad()));
        System.out.println("\n**Se realiza un sobrecobro del 1% para cubrir los daños a la infraestructura"
                         + "\n  causados por los hinchas del futbol.");
        System.out.println("ESTA PRESENTACION");
    }
    */
    
    public double calcularConsumo(double consumo) {
        double total;
        setConsumo(consumo);
        total = this.consumo * this.valorUnidad;
        return total;
        // TODO code application logic here
    }
    
    public double valorDescuento(double total) {
        double valdescuento;
        valdescuento = total * this.descuento;
        return valdescuento;
        // TODO code application logic here
    }
    
    public double totalConDescuento(double total, double valdescuento){
        double subtotaldes=0;
        subtotaldes = total - valdescuento;
        return subtotaldes;
    }
    
     public double valorIncremento(double subtotaldes) {
        double valincremento;
        valincremento = subtotaldes * this.incremento;
        return valincremento;   
        // TODO code application logic here
    }
    
    public double totalConIncrementos(double subtotaldes, double valincremento) {
        double subtotalinc;
        subtotalinc = subtotaldes + valincremento;
        return subtotalinc; 
        // TODO code application logic here
    }
 
    public double valorImpuesto(double subtotalinc) {
        double valimpuesto;
        valimpuesto = subtotalinc * this.IMPUESTO;
        return valimpuesto;  
        // TODO code application logic here
    }
       
    public double totalFinal(double subtotalinc,double valimpuesto) {
        double totalFinal;
        totalFinal = subtotalinc + valimpuesto;
        return totalFinal;
        // TODO code application logic here
    }

    
}
