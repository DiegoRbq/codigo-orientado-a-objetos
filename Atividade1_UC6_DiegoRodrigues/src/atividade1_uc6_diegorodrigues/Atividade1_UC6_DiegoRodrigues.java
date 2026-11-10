/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1_uc6_diegorodrigues;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Atividade1_UC6_DiegoRodrigues {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("    SISTEMA DE CADASTRO DE VIAGENS       ");
        System.out.println("=========================================");

        // 1. Coleta dos dados do Transporte
        System.out.print("Digite o tipo de transporte (ex: Aéreo, Rodoviário): ");
        String tipoTransp = entrada.nextLine();
        System.out.print("Digite o valor do transporte: R$ ");
        double valorTransp = entrada.nextDouble();
        entrada.nextLine(); // Consumir quebra de linha

        Transporte transporte = new Transporte(tipoTransp, valorTransp);

        // 2. Coleta dos dados da Hospedagem
        System.out.print("\nDigite a descrição da hospedagem (ex: Hotel Marazul): ");
        String descHosp = entrada.nextLine();
        System.out.print("Digite o valor da diária: R$ ");
        double valorDiaria = entrada.nextDouble();
        entrada.nextLine(); 

        Hospedagem hospedagem = new Hospedagem(descHosp, valorDiaria);

        // 3. Coleta dos dados do Pacote de Viagem
        System.out.print("\nDigite o destino da viagem: ");
        String destino = entrada.nextLine();
        System.out.print("Digite a quantidade de dias da viagem: ");
        int dias = entrada.nextInt();

        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino, dias);

        // Informações financeiras adicionais para o cálculo do pacote
        System.out.print("Informe a margem de lucro desejada (porcentagem, ex: 20): ");
        double margemLucro = entrada.nextDouble();
        System.out.print("Informe o valor das taxas adicionais: R$ ");
        double taxas = entrada.nextDouble();
        entrada.nextLine(); 

        // 4. Coleta dos dados da Venda
        System.out.print("\nDigite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();
        System.out.print("Digite a forma de pagamento: ");
        String formaPagto = entrada.nextLine();

        Venda novaVenda = new Venda(nomeCliente, formaPagto, pacote);

        // Cotação da moeda para conversão cambial
        System.out.print("Informe a cotação atual do dólar para conversão: R$ ");
        double cotacao = entrada.nextDouble();

        // 5. Exibição dos relatórios solicitados na tela
        novaVenda.mostrarInformacoesPacote(margemLucro, taxas);
        novaVenda.mostrarInformacoesVenda(margemLucro, taxas, cotacao);

        System.out.println("\n=========================================");
        System.out.println("       PROCESSO FINALIZADO!              ");
        System.out.println("=========================================");
    }
    
}
