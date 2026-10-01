public class Operacoes {

    // 'public': acessível por qualquer outra classe do projeto
    // 'static': permite a invocação do método sem instanciar a classe em um objeto
    public static String contador(int inicio, int fim) {
        String s = "";
        for (int c = inicio; c <= fim; c++) {
            s += c + " ";
        }
        return s;
    }
}