import java.util.Scanner;

public class Atividade3a
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("O seu nome está no SPC Serasa (0 não 1 sim)? ");
            int pode_comprar = entrada.nextInt();

            if(pode_comprar == 1)
            {
                System.out.printf ("Você não pode comprar à prazo.");
            }
            else
            {
                System.out.printf ("Você pode comprar à prazo");
            }
        }
    }
