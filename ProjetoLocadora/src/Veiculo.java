//SISTEMA DE VEÍCULOS - 4 PILARES DE POO em Java.
//Uma locadora de veículos precisa calcular o valor da diária
//de diferentes tipos de veículos (Carro e moto)
//Cada tipo tem seu próprio cálculo.

//PILAR 1 - ABSTRAÇÃO
//MODELAR APENAS O QUE IMPORTA: MARCA, MODELO, ANO, PLACA, PREÇO BASE.
// MÉTOD0 CALCULAR DIÁRIA() pois com cada veículo terá sua própria diária(calculo

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;

    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;

    }

    public abstract double calcularDiaria();

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public String getPlaca(){
        return placa;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public void setPrecoBase(double precoBase){
        if(precoBase < 0){
            System.out.println("Erro: preço não pode ser negativo");
            return; // Ele encerra o fluxo de dados para o VOID!
        }
        this.precoBase = precoBase;
    }

    public String toString(){
        return marca + " " + modelo + " ("+ ano +") ";
    }
}


//CARRO -> PORTAS -=- calcularDiaria -> se qtdePortas >= 4 acréscimo de 20%


