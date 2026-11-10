/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1_uc6_diegorodrigues;

/**
 *
 * @author diego
 */
public class Transporte {
    private String tipo;
    private double valor;
   
    // Método Construtor
    public Transporte(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        }
    
    // Métodos Getters e Setters para encapsulamento
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    
    
}
