/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.pkg2.uc.pkg6.pkg_.diego.rodrigues;

/**
 *
 * @author diego
 */
public abstract class Funcionario {
    
    // Atributos privados garantindo o encapsulamento
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;
    
    // Método Construtor da superclasse
    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }
    
    // Método Abstrato: não possui corpo aqui, obrigando as filhas a implementarem sua própria lógica
    public abstract double calcularPagamento();
    
    // Método concreto comum para aplicação de aumento percentual nos rendimentos
    public abstract void aplicarAumento(double porcentagem);

    // Métodos públicos Getters e Setters para acesso seguro aos dados
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
    
    // Método para exibir os dados básicos comuns na tela
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Setor: " + setor);
        System.out.println("Endereço: " + endereco + " | Tel: " + telefone);
    }
    
    
    
    
}
