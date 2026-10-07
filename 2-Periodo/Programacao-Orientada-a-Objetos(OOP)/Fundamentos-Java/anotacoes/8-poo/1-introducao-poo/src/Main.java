public class Main {

    public static void main(String[] args) {
        /*
         CONCEITOS CHAVES:
         - Classe: Molde / Planta estrutural que define atributos e métodos.
         - Objeto: Instância real criada com base na classe.
         - Instanciar: O ato de criar um objeto usando a palavra 'new'.
        */

        // Instanciando o objeto c1
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Crystal";
        c1.cor = "Verde";
        c1.carga = 60;
        c1.ponta = 0.5;
        c1.destampar();

        c1.status();
        c1.rabiscar();

        // Instanciando o objeto c2
        Caneta c2 = new Caneta();
        c2.modelo = "Faber-Castell";
        c2.cor = "Preta";
        c2.carga = 100;
        c2.ponta = 0.7;
        c2.tampar();

        c2.status();
        c2.rabiscar();
    }
}