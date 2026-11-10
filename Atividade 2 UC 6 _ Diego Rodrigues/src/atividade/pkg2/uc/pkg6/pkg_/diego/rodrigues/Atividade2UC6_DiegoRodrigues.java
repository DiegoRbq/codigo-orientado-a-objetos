package atividade.pkg2.uc.pkg6.pkg_.diego.rodrigues;

import java.util.Scanner;

public class Atividade2UC6_DiegoRodrigues {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Criação de uma lista única capaz de armazenar qualquer tipo de Funcionario (Polimorfismo)
        Funcionario[] listaFuncionarios = new Funcionario[10];
        int totalCadastrado = 0;

        System.out.println("=========================================");
        System.out.println("    SISTEMA DE GESTÃO DE FOLHA DE RH     ");
        System.out.println("=========================================");

        // Loop para cadastrar até 10 funcionários
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Cadastro do Funcionário nº " + (i + 1) + " ---");
            System.out.print("Informe o tipo (1 - Assalariado | 2 - Horista | 0 - Sair): ");
            int tipo = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            if (tipo == 0) {
                break; // Encerra o cadastro mais cedo se o usuário desejar
            }

            if (tipo != 1 && tipo != 2) {
                System.out.println("Opção inválida! Tente novamente.");
                i--; // Retorna o índice para repetir a tentativa atual
                continue;
            }

            // Coleta dos dados básicos comuns
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("CPF: ");
            String cpf = entrada.nextLine();
            System.out.print("Endereço: ");
            String endereco = entrada.nextLine();
            System.out.print("Telefone: ");
            String telefone = entrada.nextLine();
            System.out.print("Setor de trabalho: ");
            String setor = entrada.nextLine();

            // Instanciação condicional dependendo do tipo informado
            if (tipo == 1) {
                System.out.print("Salário mensal: R$ ");
                double salario = entrada.nextDouble();
                listaFuncionarios[i] = new FuncionarioAssalariado(nome, cpf, endereco, telefone, setor, salario);
            } else {
                System.out.print("Quantidade de horas trabalhadas: ");
                double horas = entrada.nextDouble();
                System.out.print("Valor da hora: R$ ");
                double valorHora = entrada.nextDouble();
                listaFuncionarios[i] = new FuncionarioHorista(nome, cpf, endereco, telefone, setor, horas, valorHora);
            }
            totalCadastrado++;
        }

        // Exibição dos pagamentos atuais
        System.out.println("\n=========================================");
        System.out.println("     FOLHA DE PAGAMENTO ATUAL            ");
        System.out.println("=========================================");
        for (int i = 0; i < totalCadastrado; i++) {
            System.out.println("-----------------------------------------");
            listaFuncionarios[i].mostrarDados();
            System.out.printf("Valor do Pagamento Atual: R$ %.2f\n", listaFuncionarios[i].calcularPagamento());
        }

        // Aplicação do aumento geral solicitado no enunciado
        System.out.println("\n=========================================");
        System.out.print("Digite a porcentagem de aumento geral para todos (ex: 10): ");
        double porcentagemAumento = entrada.nextDouble();

        for (int i = 0; i < totalCadastrado; i++) {
            listaFuncionarios[i].aplicarAumento(porcentagemAumento);
        }

        // Exibição dos pagamentos após o reajuste
        System.out.println("\n=========================================");
        System.out.println("   FOLHA DE PAGAMENTO COM REAJUSTE       ");
        System.out.println("=========================================");
        for (int i = 0; i < totalCadastrado; i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Funcionário: " + listaFuncionarios[i].getNome());
            System.out.printf("Novo Valor a Receber: R$ %.2f\n", listaFuncionarios[i].calcularPagamento());
        }
        System.out.println("=========================================");
    }
}