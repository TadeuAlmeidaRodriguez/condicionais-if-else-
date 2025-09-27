import java.util.Scanner;


public class Atividade4
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("O dia de hoje é sábado ou domingo (0 não 1 sim)? ");
            int fim_semana = entrada.nextInt();
            System.out.printf ("O dia hoje está quente (0 não  1 sim)? ");
            int temperatura_dia = entrada.nextInt();

            if (fim_semana == 1 &&  temperatura_dia == 1)
            {
                System.out.printf ("As condições estão proprícias para ir à praia");
            }
            else
            {
                System.out.printf ("As condições não estão proprícias para ir à praia");
            }

        }
    }
