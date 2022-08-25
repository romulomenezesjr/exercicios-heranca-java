package poo.heranca.responder;

class Metodo1 extends MetodoFinal1 {
    @Override
    void metodo1(){
        System.out.println("método 1 reescrito");
    }
}
public class MetodoFinal1 {

    final void metodo1(){
        System.out.println("método 1");
    }

    public static void main(String[] args) {
        /**
         * 1 - Explique o erro apontado no código acima?
         */
    }
}
