import java.util.Scanner;

public class Atividade3b
    {
        public static void main(String[] args)
        {
           Scanner entrada = new Scanner (System.in);

           System.out.printf ("Você fala inglês (0 não 1 sim)? ");
           int fala_ingles = entrada.nextInt();
           System.out.printf ("Você fala espanhol (0 não 1 sim)? ");
           int fala_espanhol = entrada.nextInt();

           if (fala_ingles == 1 && fala_espanhol == 1)
           {
               System.out.printf ("Você será contrado");
           }
           else
           {
               System.out.printf ("Não será contratado");
           }

        }
    }
