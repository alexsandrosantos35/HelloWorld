package funcoes;

public class PassagemDeParametros {



    //  Métódo que tenta modificar valor primitivo(passagem por valor)
    public static void modificarValor(int numero) {
        numero = numero * 2;
        System.out.println("Dentro do método(valor primitivo) " +numero);
    }

    //métódo que modifica objeto(passagem por referência)
    public static void modificaObjeto(Pessoa pessoa) {
        pessoa.nome = "João"; //Modifica o estado do objeto, o que será refletido fora do métódo
    }

    //Métódo que tenta reatribuir uma referêcia(não afeta a referência original)
    public static void reatribuirObjeto(Pessoa pessoa) {
        pessoa = new Pessoa();//Tenta criar um novo objeto mas não afeta a referência original.
        pessoa.nome = "Maria";//Este nome não será refletido fora do métódo.
    }

    public static void main(String[] args) {

        //Passagem por valor(primitivos).
        int numero = 10;
        System.out.println("Antes do método(valor primitivo) " + numero);
        modificarValor(numero);
        System.out.println("Depois do método(valor primitivo)");

        //Passagem por referência(objetos)
        System.out.println("\n--------------");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos";
        System.out.println("Antes do método " + pessoa.nome);
        modificaObjeto(pessoa);
        System.out.println("Depois do método " + pessoa.nome);

        //Tentativa de reatribuição de referência.
        reatribuirObjeto(pessoa);
        System.out.println("Após tentar reatribuir objeto" + pessoa.nome);


    }
}
class Pessoa {
    String nome;
}