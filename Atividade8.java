import java.util.Scanner;

public class Atividade8
    {
        public static void main (String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Joãozinho, seus avós veem a tua casa hoje (0 não 1 sim)? ");
            int avo_casa = entrada.nextInt();
            System.out.printf ("Joãozinho, hoje é um dia de promoção (0 não 1 sim)? ");
            int dia_promocao = entrada.nextInt();

            if (avo_casa == 1 || dia_promocao ==1)
            {
                System.out.printf ("As condições são proprícias para ir ao shopping");
            }
            else
            {
                System.out.printf ("As condições não são proprícias para ir ao shopping hoje");
            }
        }
    }
