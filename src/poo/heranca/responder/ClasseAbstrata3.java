package poo.heranca.responder;

class Classe3 extends ClasseAbstrata3 {

    @Override
    void metodo1() {
        System.out.println("Método 1");
    }
}
public abstract class ClasseAbstrata3 {
    abstract void metodo1();

    public static void main(String[] args) {
        /**
         * 1 - Qual classe pode ser instanciada? ClasseAbstrata3 ou Classe3?
         * 2 - Instancie um objeto e execute o método1
         */
    }
}




