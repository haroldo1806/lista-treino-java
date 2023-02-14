import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s1 = new Scanner(System.in);

        int countPar = 0;
        int countImpar = 0;
        int countPositivo = 0;
        int countNegativo = 0;

        for(int i = 0; i < 5; i++){
            double N = s1.nextDouble();

            if(N%2==0)
                countPar++;

            if(N%2!=0)
                countImpar++;

            if(N>0)
                countPositivo++;

            if(N<0)
                countNegativo++;
        }

        System.out.println(countPar + " valor(es) par(es)");
        System.out.println(countImpar + " valor(es) impar(es)");
        System.out.println(countPositivo + " valor(es) positivo(s)");
        System.out.println(countNegativo + " valor(es) negativo(s)");
    }
}