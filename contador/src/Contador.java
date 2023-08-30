import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o primeiro parametro: ");
            int parametro1 = scanner.nextInt();

            System.out.println("Digite o segundo parametro:");
            int parametro2 = scanner.nextInt();

            try {
                contar(parametro1, parametro2);
                break; // Se não ocorreu exceção, sair do loop
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, tente novamente.");
            }
        }

        scanner.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro, Tente novamente:");
        }
        int contagem = (parametro2 - parametro1);
        int[] arrayContagem = new int[contagem];
        for(int i=0; i<contagem; i++){
            arrayContagem[i]= i+1;
        }

        for(int valor : arrayContagem){
            System.out.println("imprimindo o numero: " + valor);
            
        }

    }

}
