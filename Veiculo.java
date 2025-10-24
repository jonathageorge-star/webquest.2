//grupo: Jonatha George do Nascimento, Paulo Marcelo Cordeiro de Jesus, Cleverton Kauan Calista da Silva
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    // Construtor
    public Veiculo(String placa, String marca, String modelo, int ano, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para calcular IPVA padrão
    public double calcularIpva() {
        return valor * 0.04; // 4%
    }

    // Método para exibir informações básicas
    public String toString() {
        return "Placa: " + placa +
               ", Marca: " + marca +
               ", Modelo: " + modelo +
               ", Ano: " + ano +
               ", Valor: R$ " + valor;
    }
}
