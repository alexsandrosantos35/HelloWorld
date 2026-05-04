public class Vetores {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "bob", "Charle"};

        int[] numeros = new int[5];
        String[] nomes = new String[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Vetor de números: " + numbers);
        System.out.println("Vetor de números: " + numeros);

        System.out.println("Valores usando for");

        for (int i=0; i < numbers.length; i++) {
            System.out.println("Elemento na posisão[" + i + "]: " + numbers[i]);
        }
    }
}
