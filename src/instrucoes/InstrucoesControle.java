package instrucoes;

public class InstrucoesControle {
    public static void main(String[] args) {

        System.out.println("BREAK");
        for (int i=1; i<=10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println("Iteração " + i);
        }

        System.out.println("CONTINUE");
        for (int j=1; j<=10; j++) {
           if (j% 2 == 0) {
               continue;
           }
            System.out.println("Iteração " + j);
        }
    }
}
