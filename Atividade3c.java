import java.util.Scanner;

public class Atividade3c
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Você fala inglês: ");
            int fala_ingles = entrada.nextInt();
            System.out.printf ("Você fala mandarim: ");
            int fala_mandarim = entrada.nextInt();

            if (fala_mandarim == 1 || fala_ingles == 1)
            {
                System.out.printf ("Você será contratado");
            }
            else
            {
                System.out.printf ("Você não será contrado");
            }
        }
    }
