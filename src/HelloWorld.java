public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world.");


        // Oito bits, intervalo de -128 a 127
        byte muitoPequenoMesmo = 100;
        // 16 bits, intervalo de -32768 a 32767
        short numeroPequeno = 32;
        // 32 bits, intervalo de -2^31 a 2^31-1
        int inteiro = 32000;
        // 64 bits, intervalo de -2^63 a 2^63-1
        long numeroMuitoGrande = 168000;
        // 32 bits, ponto flutuante de precisão simples
        float decimalSinples = 31;
        //64 bits, ponto flutuante de precisão dupla
        double decimalPreciso = 31.4;
        // 16 bits, caractere unicode
        char caractere = 'a';
        // true ou false
        boolean teste = true;


        System.out.println(muitoPequenoMesmo);
        System.out.println(numeroPequeno);
        System.out.println(inteiro);
        System.out.println(numeroMuitoGrande);
        System.out.println(decimalSinples);
        System.out.println(decimalPreciso);
        System.out.println(caractere);
        System.out.println(teste);
    }
}
