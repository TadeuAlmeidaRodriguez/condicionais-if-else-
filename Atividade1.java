import java.util.Scanner;


public class Atividade1
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número: ");
            float numero_teste = entrada.nextFloat();

            if (numero_teste > 0)
            {
                System.out.printf ("O número é maior que zero");
            }
        }
    }
