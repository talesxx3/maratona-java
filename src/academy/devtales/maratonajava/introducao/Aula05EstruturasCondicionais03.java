package academy.devtales.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Eu ainda nao vou doar";
        //Operador ternario: (condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
        }


    }

