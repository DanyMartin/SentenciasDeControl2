
package com.mycompany.sentenciasdecontrol2;


public class SWITCH {

  
    public static void main(String[] args) {
       package sentenciasdecontrol2; 
import java.util.Scanner; 
public class Switch { 
    private String nombredelcurso; 
    private int total; 
    private int contadorCalif; 
    private int acuenta; 
    private int bcuenta; 
    private int cCuenta; 
    private int dcuenta; 
    private int fcuenta; 
    public switch (String nombre) 
    { 
        nombredelcurso = nombre; 
    } 
    public void establecernombredelcurso(String nombre) 
    { 
        nombredelcurso=nombre; 
    } 
    public String obtenernombredelcurso ()     
    { 
        return nombredelcurso; 
    } 
    public void mostrarmensaje() 
    { 
        System.out.println("Bienvenido al libro de calificaciones "+obtenernombredelcurso() );         
    } 
    public void introducirCalif() 
    { 
        Scanner entrada = new Scanner (System.in); 
        int calificacion; 
        System.out.println("Escriba las calificaciones enteras en el rango de 0 a 100.","Escriba el indicador de fin de archivo"); 
        while (entrada.hasNext()) 
        { 
            calificaion = entrada.nextInt(); 
            total += calificacion; 
            ++contadorCalif; 
              
           incrementarContadorCalifLetra(calificacion);             
        } 
    } 
    public void incrementarContadorCalifLetra( int calificacion ) 
    { 
        switch (calificacion / 10) 
        { 
            case 9: 
            case 10: 
              ++acuenta; 
              break; 
            case 8: 
              ++bcuenta; 
              break; 
            case 7: 
                ++cCuenta; 
                break; 
            case 6; 
            ++dcuenta; 
            break; 
            default; 
            ++fcuenta; 
            break; 
        } 
    } 
    public void mostrarreporteCalif() 
    { 
        System.out.println("\nReporte de calificaciones: " ); 
        if (contadorCalif != 00) 
        { 
          double promedio = (double) total / contadorCalif; 
            System.out.println("El total de las %d calificaciones introducidads es %d\n",contadorCalif, total ); 
            System.out.println("El promedio de la clase es %.2f\n", promedio ); 
            System.out.println("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",  
                    "Número de estudiantes que recibieron cada calificación: ", 
                    "A: ", acuenta, 
                    "B: ", bcuenta, 
                    "C: ", cCuenta, 
                    "D: ", dcuenta, 
                    "F: ", fcuenta); 
        } 
        else 
            System.out.println("No se introdujeron calificaciones"); 
    } 
    }
    }
    
}
