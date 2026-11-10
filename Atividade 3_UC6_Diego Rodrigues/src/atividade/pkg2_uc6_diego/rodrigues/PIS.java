package atividade.pkg2_uc6_diego.rodrigues;

public class PIS implements Imposto {
    private double debito;
    private double credito;

    // Construtor
    public PIS(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    // Sobrescrita dos métodos da interface (Polimorfismo)
    @Override
    public double calcularImposto() {
        double baseCalculo = debito - credito;
        if (baseCalculo < 0) {
            baseCalculo = 0; 
        }
        return baseCalculo * 0.0165; // Alíquota de 1,65% definida no enunciado
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }

    // Getters e Setters para o Encapsulamento
    public double getDebito() { return debito; }
    public void setDebito(double debito) { this.debito = debito; }

    public double getCredito() { return credito; }
    public void setCredito(double credito) { this.credito = credito; }
}