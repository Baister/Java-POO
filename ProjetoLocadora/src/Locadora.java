import java.util.ArrayList;
import java.util.List;
public class Locadora {
    private List<Veiculo> frota;

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
        for(int i = 0; i < frota.size(); i++){
            if(frota.indexOf(frota.get(i)) == idVeiculo){
                System.out.println("Veiculo encontrado!");
                System.out.println("Para o veiculo: " + frota.get(i).toString());
                System.out.printf("Preco base: R$%.2f | Dias alugados: %s| Novo preco: R$%.2f", frota.get(i).calcularDiaria(), dias, frota.get(i).calcularDiaria() * dias);
            }
        }
    }
}
