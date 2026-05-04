public class ForEach {
    public static void main(String[] args) {



        //Declaração de variáveis primitivas
        int num = 12;
        double num2 = 1.5;
        boolean teste = true;
        //Estrutura de controle de fluxo (if-else)
        if (num > 10 && teste) {
            System.out.println("Saimos da pindaiba");
        }
        else {
            System.out.println("Estamos na pindaiba");
        }
        //Estrutura de repetição (for loop)
        for (int i=1; i< 6; i++) {
            System.out.println("Iteração mais gorjeta: " + i+num2);
        }
        //Tratamento de exeção
        int[] numeros = {10, 20, 30};

        try {
            int valor = numeros[5];
            System.out.println("Valor encontrado: " + valor);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Erro: Índice inválido!");
            System.out.println(" O array possui apenas " + numeros.length + " elementos (índices de 0 a " + (numeros.length - 1) + ").");
            System.out.println(" Mensagem da exceção: " + e.getMessage());
            // e.printStackTrace(); // descomente se quiser ver o stack trace completo
        }

        //Manipulação de array (Vetor)

        int[] numerais = {42, 48, 83, 34, 26};

        for(int numero : numerais) {
            System.out.println("Idades aleatórias " + numero);
        }

        int[][] idades = {
                {42, 48},
                {83, 0}
        };
        for (int i=0; i< idades.length; i++) {
            for (int j=0; j< idades[i].length; j++) {
                System.out.print(idades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
