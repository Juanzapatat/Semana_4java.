package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    
   // Inicio actividad 1
       System.out.println("Ingrese el valor total de la cuenta, incluyendo el IVA: ");
     double valorCuenta= scanner.nextDouble();
    String.format("%.2f", valorCuenta);

    System.out.println("Ingrese el valor de la propina:");
    double porcentajePropina = scanner.nextDouble();
    
    double valorPropina = (valorCuenta*(porcentajePropina/100));
    String.format("%.2f", valorPropina);
   
    double valorTotal=(valorCuenta+valorPropina);
    
    System.out.println("Valor de la cuenta: " + valorCuenta);
    System.out.println("Porcnetaje de propina: " + porcentajePropina +"%");
    System.out.println("Valor de la propina: " + valorPropina);
    System.out.println("Valor total a pagar: " + valorTotal);
    
    
   // Inicio actividad 2
    
    System.out.println("Ingrese la distancia del viaje: ");
    double distancia= scanner.nextDouble();
  
    
    System.out.println("Ingrese el tiempo que espera pasar en tráfico");
    double tiempoEspera = scanner.nextDouble();
    
    double tarifaBase= 4000.0;
    double valorKilometro= 900;
    double valroMinuto= 150;
    
    double precioDK = (distancia*valorKilometro);
    double precioTM=(tiempoEspera*valroMinuto);

double precioTotal=(tarifaBase+precioDK+precioTM);
precioTotal/=1000;//uso esto para desplazar la coma 3 espacios a al izquierda

System.out.println("El valor del viaje es:" + String.format("%.3f", precioTotal));



//Inicio actividad 3

String mensajeCodificado = "H0l4 MUnD0, 3st0 3s Un m3ns4j3 s3cr3t0";

System.out.println( "mensaje inicial : " + "H0l4 MUnD0, 3st0 3s Un m3ns4j3 s3cr3t0");

String mensajeDeCodificado =mensajeCodificado
.replace('0', 'o')
.replace('3', 'e' )
.replace('4', 'a');

mensajeDeCodificado=mensajeDeCodificado.trim().replaceAll("\\\\s+"," ");

mensajeDeCodificado=mensajeDeCodificado.toUpperCase();

System.out.println("tu mensaje es:" + mensajeDeCodificado);


}
}