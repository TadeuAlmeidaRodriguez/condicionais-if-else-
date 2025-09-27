import java.util.Scanner;

public class Atividade5
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número para ser o dividendo (quem é dividido): ");
            float dividendo = entrada.nextFloat();
            System.out.printf ("Digite um numero para ser o divisor (aquele que divide): ");
            float divisor = entrada.nextFloat();

            float divisao = dividendo/divisor;

            if (divisor != 0)
            {
                System.out.printf ("A divisão é possível, e o resultado é: %.2f", divisao);
            }
            else
            {
                System.out.printf ("A divisão por zero não é possível");
            }

        }
    }
