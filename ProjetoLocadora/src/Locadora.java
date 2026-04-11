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
}
