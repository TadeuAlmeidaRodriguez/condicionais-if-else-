import java.util.Scanner;

public class Atividade2
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número real: ");
            float numero_real = entrada.nextFloat();

            if (numero_real < 0)
            {
                System.out.printf ("O número é menor que zero");
            }
            else
            {
                System.out.printf ("O número é maior ou igual que zero");
            }
        }
    }
