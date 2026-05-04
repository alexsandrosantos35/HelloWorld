package funcoes;

public class Funcoes {

        //Função retorna valor do tipo int
        public static int soma(int a, int b) {
            return a+b;
        }
        public static int subtracao() {
            int a = 600;
            int b = 200;
             return a - b;
        }

        //Procedimento não retorna valor(void)

    public static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);//Imprime a mensagem na tela.
    }

    public static void imprimeNaTela() {
        System.out.println("Esse função não tem parametro");//Imprime a mensagem na tela.
    }

    public static void main(String[] args) {

            int resultado = soma(40, 60);
        System.out.println("Resultado: " + resultado);
        System.out.println("Soma " + soma(2, 3));

        //Usando a função subtracao
        System.out.println("Subtração " + subtracao());

        //Usando o procedimento imprimaMensagem
        imprimeMensagem("É o que necessito.");
        imprimeNaTela();
    }

}
