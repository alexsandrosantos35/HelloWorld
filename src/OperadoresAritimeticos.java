public class OperadoresAritimeticos {
    public static void main(String[] args) {

        int x = 15;
        int y = 5;

        int soma = x + y;   //Adição
        System.out.println("Soma " + soma);

        int subtracao = x - y;   //Subtração
        System.out.println("Subtração " + subtracao);

        int multiplicacao = x * y;   //Multiplicação
        System.out.println("Multiplicação " + multiplicacao);

        int divisao = x / y;   //Divisão
        System.out.println("Divisão " + divisao);

        int modulo = x % y; //Módulo (Resto da divisão por aquele número)
        System.out.println("Módulo");

        //Operadores de decremento e incremento
        int incremento = 10;
        int decremento = 10;

        incremento++; //Incremento (incremento + 1)
        System.out.println("Valor após incremento " + incremento);

        decremento--; //Incremento (decremento - 1)
        System.out.println("Valor após decremento " + decremento);



    }
}
