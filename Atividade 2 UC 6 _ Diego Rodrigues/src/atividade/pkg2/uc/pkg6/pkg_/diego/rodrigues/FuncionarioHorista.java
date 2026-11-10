package atividade.pkg2.uc.pkg6.pkg_.diego.rodrigues;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    // Construtor
    public FuncionarioHorista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    // Sobrescrita do método abstrato calculando: horas * valor da hora
    @Override
    public double calcularPagamento() {
        return this.horasTrabalhadas * this.valorHora;
    }

    // Implementação da regra de aumento para o horista (aplica-se no valor da hora)
    @Override
    public void aplicarAumento(double porcentagem) {
        this.valorHora += this.valorHora * (porcentagem / 100);
    }

    // Getters e Setters específicos
    public double getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }
    
    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Setor: " + getSetor());
        System.out.println("Endereço: " + getEndereco() + " | Tel: " + getTelefone());
        System.out.println("Tipo: Horista");
    }
}