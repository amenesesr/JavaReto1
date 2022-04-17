package mintic.edu.fpoo.vista;

import java.text.DecimalFormat;
import mintic.edu.fpoo.modelo.Servicio;

/**
 *
 * @author Alejandro Meneses Roldan
 * Grupo 24
 */

public class Presentacion {

    public Presentacion() {
    }
    
    public void factura(String servicio, String unidad, String unidades, double valorUnidad, double descuento, double incremento,double impuesto, double consumo,int numero,
            double total, double valdescuento, double subtotaldes, double valincremento, double subtotalinc, double valimpuesto, double totalFinal){
        DecimalFormat formateador = new DecimalFormat("###,###.##");
        System.out.println("\n╔═════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("║      VERIFICACION DEL SERVICIO DE "+servicio);
        System.out.println("╠══════════════════════════════════════════════════════════╦═══════════════════════════");
        System.out.println("║ Estrato socioeconómico del predio                 ║   "+numero);
        System.out.println("║ Cantidad de unidades consumidas*                  ║   "+consumo+" "+unidades);
        System.out.println("║ Valor de la factura sin descuentos o incrementos  ║ $ "+formateador.format(total));
        System.out.println("║ Porcentaje de descuento pare el estrato "+numero+"         ║   "+descuento*100+" %");
        System.out.println("║ Valor del descuento de acuerdo al estrato         ║ $ "+formateador.format(valdescuento));
        System.out.println("║ valor del factura con descuento                   ║ $ "+formateador.format(subtotaldes));
        System.out.println("║ Porcentaje de incremento pare el estrato "+numero+"        ║   "+incremento*100+" %");
        System.out.println("║ Valor del incremento de acuerdo al estrato        ║ $ "+formateador.format(valincremento));
        System.out.println("║ valor del factura con incrementos                 ║ $ "+formateador.format(subtotalinc));
        System.out.println("║ Porcentaje de incremento por impuestos **         ║   "+impuesto*100+" %");
        System.out.println("║ Valor del incremento por impuestos                ║ $ "+formateador.format(valimpuesto));
        System.out.println("╠══════════════════════════════════════════════════════════╬═══════════════════════════");
        System.out.println("║                         VALOR TOTAL DE SU FACTURA ║ $ "+formateador.format(totalFinal));
        System.out.println("╚══════════════════════════════════════════════════════════╩═══════════════════════════");
        System.out.println("");
        System.out.println("*Valor del "+unidad+": $ "+formateador.format(valorUnidad));
        System.out.println("\n**Se realiza un sobrecobro del 1% para cubrir los daños a la infraestructura"
                         + "\n  causados por los hinchas del futbol.");
        despedida();
    }
    
    public static void plantillaInicial() {
        System.out.println("     ░░░░▒▒▒▒▓▓▓▓█████████████▓▓▓▓▒▒▒▒░░░░");
        System.out.println("     ▒                                                      ▒");
        System.out.println("     ▓ VERIFICADOR DE SERVICIOS PUBLICOS ALCALDIA DE BOGOTA ▓");
        System.out.println("     █                                                      █");
        System.out.println("     ▓         UNIVERSIDAD EL BOSQUE -  MINTIC 2022         ▓");
        System.out.println("     ▒                                                      ▒");
        System.out.println("     ░░░░▒▒▒▒▓▓▓▓█████████████▓▓▓▓▒▒▒▒░░░░");
        System.out.println("\n");
        System.out.println("Bienvenido al sistema de verificación de cobros de servicios publicos");
        System.out.println("el cual le permitirá revisar si el cobro de su factura está acorde con");
        System.out.println("lo estipulado en la ley basado en el consumo y el estrado del predio.");
        System.out.println("\n══════════════════════════════════════════════════════════════════════════════════════════\n\n");
        System.out.println("Por favor digite el número del servicio que desea consultar:");
        System.out.println("    ───────────────────────────────────────────────────────");
        System.out.println("              1. AGUA");
        System.out.println("              2. LUZ (ENERGIA)");
        System.out.println("              3. GAS NATURAL");
        System.out.println("    ───────────────────────────────────────────────────────");
        // TODO code application logic here
    }  
    
    public static void errorServico() {
        System.out.println("\n\n\n   ═════════════════════════════════════════════════════════");
        System.out.println("           EL SERVICIO INGRESADO NO EXISTE");
        System.out.println("   ═════════════════════════════════════════════════════════\n");
        System.out.println("Por favor digite el número del servicio que desea consultar:");
        System.out.println("    ───────────────────────────────────────────────────────");
        System.out.println("              1. AGUA");
        System.out.println("              2. LUZ (ENERGIA)");
        System.out.println("              3. GAS NATURAL");
        System.out.println("    ───────────────────────────────────────────────────────");
        // TODO code application logic here
    }
     
    public static void errorEstrato() {
        System.out.println("\n\n\n   ═════════════════════════════════════════════════════════");
        System.out.println("            EL ESTRATO INGRESADO NO EXISTE");
        System.out.println("   ═════════════════════════════════════════════════════════\n");
        // TODO code application logic here
    }
    
    public static void errorConsumo() {
        System.out.println("\n\n\n   ═════════════════════════════════════════════════════════");
        System.out.println("   EL CONSUMO NO PUEDE SER CERO(0) O MENOR QUE CERO (0)");
        System.out.println("   ═════════════════════════════════════════════════════════\n");
        // TODO code application logic here
    }
     
    public static void despedida() {
        System.out.println("\n   ═════════════════════════════════════════════════════════");
        System.out.println("       HASTA LUEGO, USTED HA SALIDO DEL SISTEMA");
        System.out.println("   ═════════════════════════════════════════════════════════");
        System.out.println("\nGracias por usar nuestro sistema de verificacion.");  
        System.out.println("Alejandro Meneses Roldan.");
        System.out.println("Grupo 24.");
        System.out.println("Proyecto Mintic 2022 - Universidad El Bosque.\n\n\n");
        // TODO code application logic here
    }
    
}
