/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

import java.util.Scanner;
import caixaeletronico.Cliente;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author 082170027
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean dadosCliente = VerificaCliente();
        boolean saque = CalculaQuantidadeNotas();
        
        if(dadosCliente && saque){
            System.out.println();
            System.out.println("Extrato:");
            System.out.println("Saque realizado por: " + cliente.getNomeCliente());
            System.out.println("Na conta: " + cliente.getNumeroContaCliente());
            System.out.println("Valor sacado: " + valorLido);
        }
        
        System.out.println();
        System.out.println("Aperte ENTER para finalizar");
        scan.nextLine();
        //System.console().readLine();
        // TODO code application logic here
    }
    
    public static Cliente cliente = new Cliente();
    public static Scanner scan = new Scanner(System.in);
    public static String valorLido; 
    
    public static boolean VerificaCliente(){
        
        System.out.println("Informe o seu nome:");
        cliente.setNomeCliente(scan.nextLine());
        System.out.println("Informe o numero de sua conta:");
        cliente.setNumeroConta(scan.nextLine());
        return true;
        
    }
    
    public static boolean CalculaQuantidadeNotas(){
        try{
            int[] notas = {100,50,20,10,5,2,1} ;
               
            System.out.println("Digite o valor para sacar: ");        
            valorLido = scan.nextLine();
            int valor = Integer.parseInt(valorLido);

            System.out.println("Quantidade de notas:");
            for (int n = 0; n < notas.length; n++)
            {
                double quantDouble = valor/notas[n];
                int quant = (int)(truncateSafely(quantDouble));
                
                if (quant >= 1)
                {
                    System.out.println(quant + " nota(s) de " + notas[n] + " reais");
                    valor = valor - (notas[n] * quant);
                    valor =  Math.round(valor);
                }
            }

            if (valor > 0)            
                System.out.println("Não teve como lhe entregar " + valor); 
            return true;
        }
        catch(Exception e){
            return false;
        }         
    }
    
    static double truncateSafely(double value) {
        // For negative numbers, use Math.ceil.
        // ... For positive numbers, use Math.floor.
        if (value < 0) {
            return Math.ceil(value);
        } else {
            return Math.floor(value);
        }
    }
}
