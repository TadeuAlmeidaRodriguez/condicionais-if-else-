import java.util.Scanner;

public class Atividade6
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número qualquer: ");
            float numero_real = entrada.nextFloat();

            float validador = numero_real%2;

            if (validador == 0)
            {
                System.out.printf ("Esse núemero é par");
            }
            else
            {
                System.out.printf ("Esse número é impar");
            }
        }
    }
