import java.util.Scanner;

public class Atividade10
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número: ");
            float numero_um = entrada.nextFloat();
            System.out.printf ("Digite outro número: ");
            float numero_dois = entrada.nextFloat();

            if (numero_dois > numero_um)
            {
                System.out.printf ("O número %.2f é maior que o número %.2f.", numero_dois, numero_um);
            }
            else
            {
                System.out.printf ("O número %.2f é maior que o número %.2f.", numero_um, numero_dois);
            }
            
        }
    }
