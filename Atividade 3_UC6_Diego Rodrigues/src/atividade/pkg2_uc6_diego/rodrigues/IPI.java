
package atividade.pkg2_uc6_diego.rodrigues;


public class IPI implements Imposto {
    private double valorProduto;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;

    // Construtor
    public IPI(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota) {
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    // Sobrescrita dos métodos da interface (Polimorfismo)
    @Override
    public double calcularImposto() {
        double baseCalculo = valorProduto + frete + seguro + outrasDespesas; // Base de cálculo unificada
        return baseCalculo * (aliquota / 100); // Aplica o percentual[cite: 6]
    }

    @Override
    public String getDescricao() {
        return "IPI"; // Descrição exigida[cite: 6]
    }

    // Getters e Setters para o Encapsulamento
    public double getValorProduto() { return valorProduto; }
    public void setValorProduto(double valorProduto) { this.valorProduto = valorProduto; }

    public double getFrete() { return frete; }
    public void setFrete(double frete) { this.frete = frete; }

    public double getSeguro() { return seguro; }
    public void setSeguro(double seguro) { this.seguro = seguro; }

    public double getOutrasDespesas() { return outrasDespesas; }
    public void setOutrasDespesas(double outrasDespesas) { this.outrasDespesas = outrasDespesas; }

    public double getAliquota() { return aliquota; }
    public void setAliquota(double aliquota) { this.aliquota = aliquota; }
}