/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1_uc6_diegorodrigues;

/**
 *
 * @author diego
 */
public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    
    
    // Construtor
    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantityDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantityDias;
    }
    
    // Método para calcular o total da hospedagem (dias * valor da diária)
    public double calcularTotalHospedagem() {
        return this.quantidadeDias * this.hospedagem.getValorDiaria();
    }
    
    // Método para calcular o lucro (retorna: valor base + porcentagem de lucro)
    public double calcularLucro(double porcentagemMargem) {
        double valorBase = this.transporte.getValor() + calcularTotalHospedagem();
        return valorBase * (porcentagemMargem / 100);
    }
    
    // Método para calcular o total do pacote (transporte + hospedagem total + taxas + lucro)
    public double calcularTotalPacote(double porcentagemMargem, double taxasAdicionais) {
        double valorBase = this.transporte.getValor() + calcularTotalHospedagem();
        double lucro = calcularLucro(porcentagemMargem);
        return valorBase + lucro + taxasAdicionais;
    }
    
   // Getters e Setters
    public Transporte getTransporte() { return transporte; }
    public void setTransporte(Transporte transporte) { this.transporte = transporte; }

    public Hospedagem getHospedagem() { return hospedagem; }
    public void setHospedagem(Hospedagem hospedagem) { this.hospedagem = hospedagem; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public int getQuantidadeDias() { return quantidadeDias; }
    public void setQuantidadeDias(int quantidadeDias) { this.quantidadeDias = quantidadeDias; } 
    
}
