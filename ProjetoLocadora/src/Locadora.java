import java.util.ArrayList;
import java.util.List;
public class Locadora {
    private List<Veiculo> frota;

    public List<Veiculo> getFrota() {
        return frota;
    }

    public Locadora(){
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        frota.add(veiculo);
    }

    public void listarVeiculo(){
        for (int i = 0; i< frota.size(); i++){
            Veiculo v = frota.get(i);
            System.out.printf("[%d] %s %s %s | Diária: R$%.2f \n", (i+1), v.getMarca(), v.getModelo(), v.getPlaca(), v.calcularDiaria());
        }
        System.out.println("===========================================");
    }

    public void aluguelVeiculo(int dias, int idVeiculo){
        //Logica para alugar o carro.
        try{
            Veiculo v = frota.get(idVeiculo);
            System.out.println("Veiculo encontrado!");
            System.out.println("Para o veiculo: " + v.toString());
            System.out.printf("Preço diário: R$%.2f | Dias alugados: %s| Novo preco: R$%.2f", v.calcularDiaria(), dias, v.calcularDiaria() * dias);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Veiculo nao encontrado!");
        }

    }
}
