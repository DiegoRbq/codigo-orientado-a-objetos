/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1_uc6_diegorodrigues;

/**
 *
 * @author diego
 */
public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;
    
    // Construtor
    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }
    
    // Método para converter o valor de reais para dólar com base na cotação informada
    public double converterRealParaDolar(double valorReais, double cotacaoDolar) {
        if (cotacaoDolar <= 0) return 0;
        return valorReais / cotacaoDolar;
    }
    
    // Métodos para exibição dos relatórios solicitados na atividade
    public void mostrarInformacoesPacote(double margemLucro, double taxas) {
        System.out.println("\n--- INFORMAÇÕES DO PACOTE ---");
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Transporte: " + pacoteViagem.getTransporte().getTipo() + " (R$ " + pacoteViagem.getTransporte().getValor() + ")");
        System.out.println("Hospedagem: " + pacoteViagem.getHospedagem().getDescricao() + " (" + pacoteViagem.getQuantidadeDias() + " diárias)");
        System.out.println("Total Hospedagem: R$ " + pacoteViagem.calcularTotalHospedagem());
        System.out.println("Margem de Lucro calculada: R$ " + pacoteViagem.calcularLucro(margemLucro));
        System.out.println("Taxas Adicionais: R$ " + taxas);
        System.out.println("VALOR TOTAL DO PACOTE: R$ " + pacoteViagem.calcularTotalPacote(margemLucro, taxas));
    }
    
    
    public void mostrarInformacoesVenda(double margemLucro, double taxas, double cotacaoDolar) {
        double totalReais = pacoteViagem.calcularTotalPacote(margemLucro, taxas);
        double totalDolar = converterRealParaDolar(totalReais, cotacaoDolar);

        System.out.println("\n--- RESUMO DA VENDA ---");
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Forma de Pagamento: " + this.formaPagamento);
        System.out.println("Destino do Pacote: " + pacoteViagem.getDestino());
        System.out.printf("Valor Total em Reais: R$ %.2f\n", totalReais);
        System.out.printf("Valor Total em Dólar (Cotação R$ %.2f): $ %.2f\n", cotacaoDolar, totalDolar);
    }
    
    
    // Getters e Setters
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public String getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }

    public PacoteViagem getPacoteViagem() { return pacoteViagem; }
    public void setPacoteViagem(PacoteViagem pacoteViagem) { this.pacoteViagem = pacoteViagem; }
}
    
    

