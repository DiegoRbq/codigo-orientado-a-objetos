package atividade.pkg2.uc.pkg6.pkg_.diego.rodrigues;

public class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    // Construtor utilizando o método 'super' para preencher a classe mãe
    public FuncionarioAssalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    // Sobrescrita do método abstrato (Polimorfismo)
    @Override
    public double calcularPagamento() {
        return this.salarioMensal; // O total a receber é o próprio salário
    }

    // Implementação da regra de aumento para o assalariado
    @Override
    public void aplicarAumento(double porcentagem) {
        this.salarioMensal += this.salarioMensal * (porcentagem / 100);
    }

    // Getter e Setter específicos
    public double getSalarioMensal() { return salarioMensal; }
    public void setSalarioMensal(double salarioMensal) { this.salarioMensal = salarioMensal; }
    
    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Setor: " + getSetor());
        System.out.println("Endereço: " + getEndereco() + " | Tel: " + getTelefone());
        System.out.println("Tipo: Assalariado");
    }
}