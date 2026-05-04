package funcoes;

import java.util.function.Consumer;

public class FuncaoLambda {

    public static void main(String[] args) {

        //Exemplo de função lambda que implementa a interface funcional Consumer
        Consumer<String> imprimirMensagem = mensagem -> System.out.println(mensagem);
        imprimirMensagem.accept("Olá mundo! Este é um exemplo de função lambda");
    }
}
