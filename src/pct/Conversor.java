/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author gilberto
 */
public class Conversor {
    public static void main(String[] args) {
        //Declaração de variáveis
        double cel, fah;
        
        //Criação e instância de objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Conversor de Temperatura --\n");
        
        //Entrada
        System.out.print("\nInforme a temperatura em ºF: ");
        fah = entrada.nextDouble();
        
        //Processamento
        cel = 5 * (fah - 32) / 9;
        
        //Saída
        System.out.printf("\n\n%.2fº Fahrenheit = %.2fº Celsius\n\n", fah, cel);
        
    }
}
