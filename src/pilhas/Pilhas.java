package pilhas;

public class Pilhas {

  public static void main(String[] args) {
        Metodos pilha = new Metodos();
        System.out.println("enpilhando 50");
        for (int i = 1; i < 50; i++) {
            pilha.empilharadoramento(i);
        }
        System.out.println("");
        System.out.println("desempilhando 10");
        pilha.imprimepilha();
       
        for (int i =1; i< 10; i++){
            pilha.desempilhadoramento();
//            System.out.println(pilha.desempilhadoramento());
        }
        
        pilha.imprimepilha();
        System.out.println("");
        System.out.println("empilhando 5");
        pilha.imprimepilha();
        
        for (int i = 1; i < 5; i++) {
            pilha.empilharadoramento(i);
        }
        System.out.println("");
        pilha.imprimepilha();
    }
}