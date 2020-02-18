/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

/**
 *
 * @author 082170027
 */
public class Cliente {
    
    
    private String nome;
    private String numeroConta;
    private int saldo;
    
    public void setNomeCliente(String nomeCliente){ 
        this.nome = nomeCliente;
    }
    
    public String getNomeCliente(){
    return nome;
    }
    
    public void setNumeroConta(String numeroContaCliente){
        this.numeroConta = numeroContaCliente;
    }
    
    public String getNumeroContaCliente(){
        return numeroConta;
    }
    
    public void setSaldo(int saldoCliente){
        this.saldo = saldoCliente;
    }
    
    public int getSaldoCliente(){
        return saldo;
    }
    
}
