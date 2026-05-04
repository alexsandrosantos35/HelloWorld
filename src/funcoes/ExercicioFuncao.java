package funcoes;

public class ExercicioFuncao {

    public static void exibirMensagem(String nome) {
        System.out.println("Olá " + nome + "! Seja bem-vindo ao sistema");
    }

    public static int calcularQuadrado(int numero) {
        return numero * numero;  // Simples e direto
    }

    public static void main(String[] args) {

        exibirMensagem("Alexsandro");


        int resultado = calcularQuadrado(5);
        System.out.println("O quadrado de 5 é: " + resultado);
    }
}

