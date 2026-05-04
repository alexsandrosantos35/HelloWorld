package funcoes;

public class FuncaoRecursiva {

    int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else
        {
            return n * fatorial(n - 1);
        }
    }


    public static void main(String[] args) {

        FuncaoRecursiva exemplo = new FuncaoRecursiva();
        int numero = 5;
        int resultado = exemplo.fatorial(numero);
        System.out.println("Fatorial de " + numero + " é " + resultado);
     }


}