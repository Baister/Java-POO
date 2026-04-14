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
            System.out.printf("");
        }
    }
    public void alugarVeiculo(String modelo){
        for (Veiculo v:frota){
            if(v.getModelo().equalsIgnoreCase(modelo)){
                System.out.println(v.getModelo() + " -> ALUGADO!");
            }
        }
        System.out.println("===========================================");
    }
}
