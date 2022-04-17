package mintic.edu.fpoo.controlador;

import java.text.DecimalFormat;
import mintic.edu.fpoo.modelo.Servicio;
import static mintic.edu.fpoo.modelo.Servicio.getIMPUESTO;
import mintic.edu.fpoo.vista.Presentacion;

/**
 *
 * @author Alejandro Meneses Roldan
 * Grupo 24
 */
public class Controlador {
    
    private Servicio ser;
    private Presentacion VerSer;

    public Controlador(Servicio ser, Presentacion VerSer) {
        this.ser = ser;
        this.VerSer = VerSer;
    }

    public String getServicio() {
        return ser.getServicio();
    }
    
    public void setServicio(String servicio) {
        this.ser.setServicio(servicio);
    }
    
    public String getUnidad() {
        return ser.getUnidad();
    }

    public void setUnidad(String unidad) {
        this.ser.setUnidad(unidad);
    }
    
    public String getUnidades() {
        return ser.getUnidades();
    }

    public void setUnidades(String unidades) {
        this.ser.setUnidades(unidades);
    }

    public double getValorUnidad() {
        return ser.getValorUnidad();
    }
    
    public void setValorUnidad(double valorUnidad) {
        this.ser.setValorUnidad(valorUnidad);
    }
   
    public double getDescuento() {
        return ser.getDescuento();
    }
    
    public void setDescuento(double descuento) {
        this.ser.setDescuento(descuento);
    }
    
    public double getIncremento() {
        return ser.getIncremento();
    }
    
    public void setIncremento(double incremento) {
        this.ser.setIncremento(incremento);
    }
    
    public double getImpuesto() {
        return ser.getImpuesto();
    }
    
    public void setImpuesto(double impuesto) {
        this.ser.setImpuesto(impuesto);
    }
    
    public int getNumero() {
        return ser.getNumero();
    }
    
    public void setNumero(int numero) {
        this.ser.setNumero(numero);
    }
    
     public double getConsumo() {
        return ser.getConsumo();
    }
     
    public void setConsumo(double consumo) {
        this.ser.setConsumo(consumo);
    }
    
    public void actualizaVista(){
        VerSer.factura(ser.getServicio(), ser.getUnidad(), ser.getUnidades(), ser.getValorUnidad(), ser.getDescuento(), ser.getIncremento(), ser.getIMPUESTO(), ser.getConsumo(),ser.getNumero(), 
                ser.calcularConsumo(ser.getConsumo()),
                ser.valorDescuento(ser.calcularConsumo(ser.getConsumo())),
                ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))),
                ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo())))), 
                ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))))),
                ser.valorImpuesto(ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo())))))),
                ser.totalFinal(ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))))) , ser.valorImpuesto(ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))))))));
        /*DecimalFormat formateador = new DecimalFormat("###,###.##");
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════════════");
        System.out.println("║      VERIFICACION DEL SERVICIO DE "+getServicio());
        System.out.println("╠═══════════════════════════════════════════════════╦═══════════════════════════");
        System.out.println("║ Estrato socioeconómico del predio                 ║   "+getNumero());
        System.out.println("║ Cantidad de unidades consumidas*                  ║   "+getConsumo()+" "+getUnidades());
        System.out.println("║ Valor de la factura sin descuentos o incrementos  ║ $ "+formateador.format(ser.calcularConsumo(ser.getConsumo())));
        System.out.println("║ Porcentaje de descuento pare el estrato "+getNumero()+"         ║   "+getDescuento()*100+" %");
        System.out.println("║ Valor del descuento de acuerdo al estrato         ║ $ "+formateador.format(ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))));
        System.out.println("║ valor del factura con descuento                   ║ $ "+formateador.format(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo())))));
        System.out.println("║ Porcentaje de incremento pare el estrato "+getNumero()+"        ║   "+getIncremento()*100+" %");
        System.out.println("║ Valor del incremento de acuerdo al estrato        ║ $ "+formateador.format(ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))))));
        System.out.println("║ valor del factura con incrementos                 ║ $ "+formateador.format(ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo())))))));
        System.out.println("║ Porcentaje de incremento por impuestos **         ║   "+getIMPUESTO()*100+" %");
        System.out.println("║ Valor del incremento por impuestos                ║ $ "+formateador.format(ser.valorImpuesto(ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))))))));
        System.out.println("╠═══════════════════════════════════════════════════╬═══════════════════════════");
        System.out.println("║                         VALOR TOTAL DE SU FACTURA ║ $ "+formateador.format(ser.totalFinal(ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))))) , ser.valorImpuesto(ser.totalConIncrementos(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo()))), ser.valorIncremento(ser.totalConDescuento(ser.calcularConsumo(ser.getConsumo()), ser.valorDescuento(ser.calcularConsumo(ser.getConsumo())))))))));
        System.out.println("╚═══════════════════════════════════════════════════╩═══════════════════════════");
        System.out.println("");
        System.out.println("*Valor del "+getUnidad()+": $ "+formateador.format(getValorUnidad()));
        System.out.println("\n**Se realiza un sobrecobro del 1% para cubrir los daños a la infraestructura"
                         + "\n  causados por los hinchas del futbol.");*/
    }
}
