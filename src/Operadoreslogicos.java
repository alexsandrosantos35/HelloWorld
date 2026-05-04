public interface Operadoreslogicos {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        //Operador && (AND lógico)
        System.out.println("a && b " + (a && b)); //Falso porque b é igual a false

        //Operado || (OR lógico)
        System.out.println("a || b " + (a || b)); //Verdadeiro porque a é igual a true

        //Operador ! (NOT lógico)
        System.out.println("!a " + !(a)); //Falso porque a é igual true
        System.out.println("!b " + !(b)); //Verdadeiro porque b é igual false
    }
}
