package academy.devtales.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // imprima os primeiros 25 numeros de um dado valor. Por exemplo 50.
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
