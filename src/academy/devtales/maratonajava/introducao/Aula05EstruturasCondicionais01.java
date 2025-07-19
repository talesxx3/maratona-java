package academy.devtales.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        }
        else{
            System.out.println("Nao Autorizado");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao Autorizado");
        }
    }
}

