public class EstruturaMetodos {

    // Método 'void': não possui instrução 'return' e apenas executa o bloco
    static void somaSemReturn(int a, int b) {
        int soma = a + b;
        System.out.printf("A soma entre %d e %d é %d%n", a, b, soma);
    }

    // Método com retorno do tipo 'int': exige a palavra reservada 'return'
    static int somaComReturn(int c, int d) {
        return c + d;
    }

    public static void main(String[] args) {
        somaSemReturn(5, 2);

        int sm = somaComReturn(5, 3);
        System.out.printf("A soma com return é %d%n", sm);

        // Chamando um método público estático residente em outra classe
        System.out.println(Operacoes.contador(1, 5));
    }
}