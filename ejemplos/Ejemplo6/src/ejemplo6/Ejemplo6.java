/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale (Locale.US);
        
        int membresia = 25;
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int dia_pago;
        
        double descuento = membresia*0.05;
        double valor_total= membresia - descuento;
        
        System.out.println("Ingrese nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese apellido:");
        apellido = entrada.nextLine();
        System.out.println("Ingrese usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese parroquia:");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese usuario:");
        dia_pago = entrada.nextInt();
        
        if ((dia_pago<10) && (parroquia.equals("El Sagrario")) || (parroquia.equals("El Valle"))) {
            System.out.printf("Reporte\nNombre: %s\nApellido: %s\nUsuario: %s\nEdad: %d\nParroquia: %s\nDía de pago: %d\n\n\tCosto membresía: %d\n\n\tDescuento: %.2f\n\n\tValor total: %.2f\n"
                    , nombre, apellido, usuario, edad, parroquia, dia_pago, membresia, descuento, valor_total);
        }else{
                System.out.printf("Reporte\nNombre: %s\nApellido: %s\nUsuario: %s\nEdad: %d\nParroquia: %s\nDía de pago: %d\n\n\tCosto membresía: %d\n\n\tValor total: %.2f\n"
                    , nombre, apellido, usuario, edad, parroquia, dia_pago, membresia, valor_total);
                }        
    }
 }
    

