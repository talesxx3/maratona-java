package academy.devtales.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // Condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }
    }

}

