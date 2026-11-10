package atividade.pkg2_uc6_diego.rodrigues;

import java.util.Scanner;

public class Atividade3_UC6_DiegoRodrigues {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("     SISTEMA DE LANÇAMENTO CONTÁBIL      ");
        System.out.println("=========================================");
        
        System.out.print("Informe o nome da Empresa: ");
        String empresa = entrada.nextLine();
        
        // Instancia o objeto gerenciador de pagamentos com a lista dinâmica (ArrayList)
        Pagamentos controlePagamentos = new Pagamentos(empresa);

        while (true) {
            System.out.println("\n--- Adicionar Novo Imposto ---");
            System.out.print("Escolha o tipo (pis / ipi) ou digite 'pare' para encerrar: ");
            String tipo = entrada.nextLine().trim().toLowerCase();

            // Condição de parada informando "pare"
            if (tipo.equals("pare")) {
                break;
            }

            if (tipo.equals("pis")) {
                System.out.print("Valor Total de Débito: R$ ");
                double debito = entrada.nextDouble();
                System.out.print("Valor Total de Crédito: R$ ");
                double credito = entrada.nextDouble();
                entrada.nextLine(); // Limpar buffer do teclado

                // Polimorfismo de interface: adicionando PIS na lista genérica
                PIS novoPis = new PIS(debito, credito);
                controlePagamentos.adicionarImposto(novoPis);
                System.out.println("Lançamento de PIS registrado!");

            } else if (tipo.equals("ipi")) {
                System.out.print("Valor do Produto: R$ ");
                double produto = entrada.nextDouble();
                System.out.print("Valor do Frete: R$ ");
                double frete = entrada.nextDouble();
                System.out.print("Valor do Seguro: R$ ");
                double seguro = entrada.nextDouble();
                System.out.print("Outras Despesas: R$ ");
                double despesas = entrada.nextDouble();
                System.out.print("Alíquota do Imposto (%): ");
                double aliquota = entrada.nextDouble();
                entrada.nextLine(); // Limpar buffer do teclado

                // Polimorfismo de interface: adicionando IPI na lista genérica
                IPI novoIpi = new IPI(produto, frete, seguro, despesas, aliquota);
                controlePagamentos.adicionarImposto(novoIpi);
                System.out.println("Lançamento de IPI registrado!");

            } else {
                System.out.println("Opção inválida! Digite 'pis', 'ipi' ou 'pare'.");
            }
        }

        // Relatório Final utilizando o laço for-each para percorrer a lista
        System.out.println("\n=========================================");
        System.out.println("  RELATÓRIO DE IMPOSTOS DA EMPRESA       ");
        System.out.println("  Empresa: " + controlePagamentos.getNomeEmpresa().toUpperCase());
        System.out.println("=========================================");

        double totalGeralImpostos = 0;

        // Laço for-each ideal para estruturas de dados da biblioteca java.util
        for (Imposto imp : controlePagamentos.getListaImpostos()) {
            System.out.println("-----------------------------------------");
            System.out.println("Imposto: " + imp.getDescricao());
            System.out.printf("Total Calculado: R$ %.2f\n", imp.calcularImposto());
            totalGeralImpostos += imp.calcularImposto();
        }

        System.out.println("=========================================");
        System.out.printf(" VALOR TOTAL DA GUIA DE IMPOSTOS: R$ %.2f\n", totalGeralImpostos);
        System.out.println("=========================================");
    }
}