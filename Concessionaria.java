//grupo: Jonatha George do Nascimento, Paulo Marcelo Cordeiro de Jesus, Cleverton Kauan Calista da Silva
import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        // Adicionando 3 carros
        veiculos.add(new Carro("FSD-5468", "Toyota", "Corolla", 2020, 95000, 4));
        veiculos.add(new Carro("CDF-8678", "Honda", "Civic", 2021, 110000, 4));
        veiculos.add(new Carro("ZXD-9011", "Fiat", "Argo", 2019, 55000, 4));

        // Adicionando 2 motos
        veiculos.add(new Moto("SDS-9376", "Yamaha", "Fazer 250", 2022, 21000, 250));
        veiculos.add(new Moto("PDF-2310", "Honda", "CG 160", 2023, 15000, 160));

        // Adicionando 2 caminhões
        veiculos.add(new Caminhao("RPG-8261", "Volvo", "FH", 2018, 350000, 10));
        veiculos.add(new Caminhao("LKM-4523", "Scania", "R Series", 2020, 400000, 4));

        // Exibindo informações
        System.out.println("=== LISTA DE VEICULOS ===\n");
        for (Veiculo v : veiculos) {
            System.out.println(v.toString());
            System.out.println("-----------------------------");
        }
    }
}
