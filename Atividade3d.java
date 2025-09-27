import java.util.Scanner;

public class Atividade3d
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Você vai ao trabalho (0 não 1 sim)? ");
            int ir_trabalho = entrada.nextInt();

            if (ir_trabalho ==1)
            {
                System.out.printf ("Então você não poderá ir à praia");
            }
            else
            {
                System.out.printf ("Então você poderá ir à praia");
            }
        }
    }
