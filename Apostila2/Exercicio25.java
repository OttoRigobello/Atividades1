        import java.util.Scanner;
        public class Exercicio25 {
        public static void main(String[] args) {
        Scanner Change = new Scanner(System.in);
        System.out.println("Digite 2 numeros abaixo com seus antigos valores");
        int A, B, C;
        System.out.print("Primeiro Número: ");
        A = Change.nextInt();
        System.out.print("Segundo Número: ");
        B = Change.nextInt();
        C = A;
        A = B;
        B = C;
        System.out.println("Novo resultado de A:  "+A);
        System.out.println("Novo resultado de B: "+B);


        }
        }
