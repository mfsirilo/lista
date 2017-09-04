package pilhas;

import java.util.*;

public class Pilhas {

    public static void main(String[] args) {
        Metodos pilha1 = new Metodos();
        Metodos pilha2 = new Metodos();
        Scanner scan = new Scanner(System.in);
        int valor;
        boolean continuar = true;

        while (continuar == true) {
            System.out.println("Informe 5 numeros para a pilha1");
            for (int i = 1; i < 6; i++) {
                System.out.println("Informe o numero " + i + " da pilha");
//                valor = scan.nextInt();
//                pilha1.empilharadoramento(valor);
                pilha1.empilharadoramento(scan.next());
            }

            System.out.println("Informe 5 numeros para a pilha2");
            for (int i = 1; i < 6; i++) {
                System.out.println("Informe o numero " + i + " da pilha");
//                valor = scan.nextInt();
//                pilha2.empilharadoramento(valor);
                pilha2.empilharadoramento(scan.next());
            }
            scan.nextLine();

            if (pilha1.Comparadoramento(pilha1, pilha2) == true) {
                System.out.println("");
                System.out.println("OBA!! Pilhas iguais :)");
            } else {
                System.out.println("");
                System.out.println("Ohh não!!! Pilhas Deferentes :/");
            }

            System.out.println("");
            System.out.println("");
           
            System.out.println("Deseja continuar comparando? \nS - Sim ou N - não");
            String cont = scan.next();

            if (cont.equals("s")) {
                continuar = true;
                System.out.println("ok então ... vamos lá!");
                System.out.println("");
            }else{
                continuar=false;
            }
            
        }
        
    }
}