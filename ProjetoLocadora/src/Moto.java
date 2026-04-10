public class Moto extends Veiculo{
    private int cilindrada;
    //se cilindrada > 300 . acréscicmo de 15%
    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int cilindrada){
        super(marca, modelo, ano, placa, precoBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularDiaria(){
        if(cilindrada > 300){
            return getPrecoBase() * 1.15;
        }
        return getPrecoBase();
    }
}
