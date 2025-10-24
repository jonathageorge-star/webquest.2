//grupo: Jonatha George do Nascimento, Paulo Marcelo Cordeiro de Jesus, Cleverton Kauan Calista da Silva
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int ano, double valor, int cilindradas) {
        super(placa, marca, modelo, ano, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIpva() {
        return getValor() * 0.025; // 2.5%
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Cilindradas: " + cilindradas +
               ", IPVA: R$ " + String.format("%.2f", calcularIpva());
    }
}
