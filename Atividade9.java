import java.util.Scanner;

public class Atividade9
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite o valor do produto em R$ (reais): ");
            double valor_produto = entrada.nextFloat();
            System.out.printf ("Digite o número de parcelas que você deseja fazer: ");
            int numero_parcelas = entrada.nextInt();

            double valor_desconto = valor_produto * 0.9;
            double valor_parcelado = valor_produto/numero_parcelas;

            if (numero_parcelas != 0)
            {
                System.out.printf ("Foi dividido em: %dx\nO valor ficou : %.2f R$\nAs parcelas ficaram no valor: %.2f R$", numero_parcelas, valor_produto, valor_parcelado);
            }
            else
            {
                System.out.printf ("O valor á vista fica em: %.2f R$", valor_desconto);
            }
        }
    }
