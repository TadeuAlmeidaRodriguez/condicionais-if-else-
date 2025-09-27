import java.util.Scanner;

public class Atividade7
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número real: ");
            float numero_real = entrada.nextFloat();


            if (numero_real < 0 )
            {
                System.out.printf ("O número é negativo, o seu módulo é: %.2f", (numero_real * -1));
            }
            else
            {
                System.out.printf ("O número é posito, o seu módulo é ele mesmo: %.2f", numero_real);
            }
        }
    }
