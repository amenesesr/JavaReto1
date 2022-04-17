package mintic.edu.fpoo.vista;

import java.util.Scanner;
import mintic.edu.fpoo.modelo.Servicio;
import mintic.edu.fpoo.controlador.Controlador;
import mintic.edu.fpoo.vista.Presentacion;

/**
 *
 * @author Alejandro Meneses Roldan
 * Grupo 24
 */

public class VerificadorServicios {

    public static void main(String[] args) {
        Servicio modelo = asignarServicio();
        Presentacion factura = new Presentacion();
        Controlador controlador = new Controlador(modelo,factura);
        controlador.actualizaVista(); 
    }
    
    private static Servicio asignarServicio(){
        int opcion;
        int numero;
        double consumo;
        Scanner obj = new Scanner(System.in);
        Presentacion.plantillaInicial();
        opcion = obj.nextInt();
        while(true){
            if (opcion >=4 || opcion <=0)
                {
                    Presentacion.errorServico();
                    opcion = obj.nextInt();
                }
            else
                {
                    System.out.println("\n    ────────────────────────────────────────────────────────────────");
                    System.out.println("      VERIFICADOR DE FACTURA DEL SERVICIO DE ");
                    System.out.println("    ────────────────────────────────────────────────────────────────\n");
                    while (true){
                        System.out.println("Por favor digite el número del estrato socioeconómico donde se encuentra el predio:");
                        System.out.println("                         1, 2, 3, 4, 5, o 6");
                        System.out.println("    ────────────────────────────────────────────────────────────────");
                        numero = obj.nextInt();
                        if (numero <= 0 || numero > 6)
                            {
                                Presentacion.errorEstrato();
                            }
                        else    
                            {
                                while(true){
                                    System.out.println("\nPor favor digite la cantidad de consumidos en su factura:");
                                    System.out.println("    ────────────────────────────────────────────────────────────────");
                                    consumo = obj.nextDouble();
                                    if (consumo <= 0)
                                        {
                                            Presentacion.errorConsumo();
                                        }
                                    else 
                                        {
                                            Servicio ser = new Servicio();
                                            ser.asignarServicio(opcion, numero, consumo);
                                            return ser;
                                           
                                        } 
                                } 
                            }
                    }  
                }
        }    
    }       
}

