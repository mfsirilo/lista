package pilhas;
public class Metodos {

    public Object[] pilha;
    public int posicaoPilha;

    public Metodos() {
        this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new Object[100];
// criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public void imprimepilha() {
        for (int i = 0; i < this.tamanho(); i++) {
            System.out.println(this.pilha[i]);
        }
    }

    public Object desempilhadoramento() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public boolean pilhaCheia() {
        if (this.pilha[this.pilha.length - 1] != null) {
            System.out.println("pilhaCheia");
            return true;
        }
        return false;
    }

//    public void empilhar(Object valor) {
//        // push
//        if (this.posicaoPilha < this.pilha.length - 1) {
//            this.pilha[++posicaoPilha] = valor;
//        }
//        this.pilha[++posicaoPilha] = valor;
//    }
    
    public void empilharadoramento (Object valor){
        if(this.pilhaCheia()){
           return;
        }
        this.pilha[++posicaoPilha] = valor;
    }

//    public static void main(String args[]) {
//        MetPilha p = new MetPilha();
//        p.empilhar("Portuguesa ");
//        p.empilhar("Frango com catupiry ");
//        p.empilhar("Calabresa ");
//        p.empilhar("Quatro queijos ");
//        p.empilhar(10);
//        while (p.pilhaVazia() == false) {
//            System.out.println(p.desempilhar());
//        }
//    }
}