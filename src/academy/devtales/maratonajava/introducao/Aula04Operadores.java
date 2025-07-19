package academy.devtales.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Aritimeticos: + - / *
        int num01 = 10;
        double num02 = 20;
        double resultado = num01 / num02;
        System.out.println(resultado);

        //Resto %
        int resto = 21 % 7;
        System.out.println(resto);

        //Operadores Relacionais: < ou >, <= ou >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteDeDez= 10 != 10;


        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteDeDez "+isDezDiferenteDeDez);

        // Operadores Logicos (E) &&, (OU) ||
        int idade = 29;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //Operadores de Atribuicao =  +=  -=  *=  /=  %=
        double bonus = 2000;
        bonus += 500;
        bonus -= 1000;
        bonus /= 2;
        System.out.println(bonus);

        // ++  --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);







    }
}
