import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao iFood Simples !");
        System.out.println("1 - Ver cardápio ");
        System.out.println("2 - Finalizar pedido");
        System.out.println("0 - Sair");

        int opcao;
        do {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirCardapio();
                    break;
                case 2:
                    System.out.println("Pedido finalizado! Obrigado por usar o iFood Simples.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao !=0);

        scanner.close();

    }

    public static void exibirCardapio() {
        System.out.println("Cardápio :");
        System.out.println("1 - Hambúrguer - R$20,00");
        System.out.println("2 - Pizza - R$30,00");
        System.out.println("3 - Refrigerante - R$5,00");
    }
}
