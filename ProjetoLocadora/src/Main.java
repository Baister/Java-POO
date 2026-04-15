import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Carro carro1 = new Carro("Ferrari", "PORTOFINO", 2026, "ghf-888", 10000, 4);
//        System.out.println(carro1.toString());
//
//        Moto moto1 = new Moto("Harley-Davidson", "FATBOY", 2026, "png-666", 1000, 1600);
//        System.out.println(moto1.toString());
//
        Locadora locadora = new Locadora();
        locadora.adicionarVeiculo(new Carro("Ferrari", "PORTOFINO", 2026, "ghf-888", 900, 4));
        locadora.adicionarVeiculo(new Moto("Harley-Davidson", "FATBOY", 2026, "png-666", 500, 1600));
        locadora.listarVeiculo();

        int tamanho = locadora.getFrota().size();

        System.out.print("Escolha o veiculo (1 a " + tamanho + "):");
        Scanner sc = new Scanner(System.in);
        int idVeiculo = sc.nextInt();
        System.out.print("Digite a quantidade de dias: ");
        int diasAlugados = sc.nextInt();

        locadora.aluguelVeiculo(diasAlugados, idVeiculo-1);

    }

}
