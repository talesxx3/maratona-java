package academy.devtales.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //€ 0	€ 34,712	9.70%	27.65%	37.35%
    //€ 34,713	€ 68,507	37.35%	0%	37.35%
    //€ 68,507		49.50%	0%	49.50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxa1 = 9.70 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * taxa1;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * taxa2;
        }else{
            valorImposto = salarioAnual * taxa3;
        }
        System.out.println(valorImposto);


    }
}
