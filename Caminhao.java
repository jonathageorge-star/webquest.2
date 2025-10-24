//grupo: Jonatha George do Nascimento, Paulo Marcelo Cordeiro de Jesus, Cleverton Kauan Calista da Silva
public class Caminhao extends Veiculo {
    private double capacidadeCarga; 

    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5)
            return getValor() * 0.02; // 2%
        else
            return getValor() * 0.03; // 3%
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Capacidade de Carga: " + capacidadeCarga + " toneladas" +
               ", IPVA: R$ " + String.format("%.2f", calcularIpva());
    }
}
