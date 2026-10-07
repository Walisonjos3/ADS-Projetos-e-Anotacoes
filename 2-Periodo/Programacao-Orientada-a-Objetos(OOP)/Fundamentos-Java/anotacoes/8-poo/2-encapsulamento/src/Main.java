public class Main {

    public static void main(String[] args) {
        // Instanciando o objeto utilizando o método Construtor com parâmetros
        CanetaEncapsulada c1 = new CanetaEncapsulada("BIC Cristal", "Azul", 0.5);

        // Exibindo o estado inicial configurado pelo construtor
        c1.mostrarCaneta();

        System.out.println("\n--- Modificando atributos com Setters ---");
        // Alterando os dados de forma segura utilizando os métodos Setters (Mutatores)
        c1.setModelo("Faber-Castell Fine");
        c1.setPonta(0.7);
        c1.destampar();

        // Lendo valores específicos utilizando os métodos Getters (Acessores)
        System.out.println("Modelo atualizado: " + c1.getModelo());
        System.out.println("Ponta atualizada: " + c1.getPonta());

        System.out.println("\n--- Estado final do objeto ---");
        c1.mostrarCaneta();

        /*
         * CONCEITO DE ENCAPSULAMENTO E PRIVACIDADE:
         * Como os atributos foram declarados com o modificador 'private',
         * tentar acessá-los ou modificá-los diretamente gerará erro de compilação:
         *
         * c1.modelo = "Bic";  // ERRO: modelo has private access in CanetaEncapsulada
         * c1.ponta = 1.0;     // ERRO: ponta has private access in CanetaEncapsulada
         */
    }
}