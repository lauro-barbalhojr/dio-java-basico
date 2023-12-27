package Operators;

public class Operators {

    public static void main(String[] args) {
//        String nomeCompleto = "LINGUAGEM " + "JAVA";
//
//        System.out.println(nomeCompleto);
//
//        String concatenacao = "?";
//
//        concatenacao = 1+1+1+"1";
//
//        System.out.println(concatenacao);
//
//        concatenacao = 1+"1"+1+1;
//
//        System.out.println(concatenacao);
//
//        concatenacao = 1+"1"+1+"1";
//
//        System.out.println(concatenacao);
//
//        concatenacao = "1"+1+1+1;
//
//        System.out.println(concatenacao);
//
//        concatenacao = "1"+(1+1+1);
//
//
//        System.out.println(concatenacao);
//
//        Os exemplos acima demonstram as operações de concatenação, em que tal qual no operador aritmético,
//        Usa-se o símbolo +, e sua utilidade varia de acordo com o contexto. Dentro da implementação de uma string
//        ou saida de impressão, é usado como operador de concatenação, e em caso de uso em operações numéricas,
//        é usado como operador aritmético.


        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero =  numero;

        System.out.println(numero);
/*
        O código acima demonstra a aplicação do operador unitário de valores positivos e negaivos,
        que funciona ao atribuir um valor com seus respectivos operadores, causando a mudança do sinal
 */

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        // O operador ! é utilizado para inverter valores booleanos em sua atribuição.


        // Operadores ternários


        int a, b;
        a = 5;
        b= 6;

        String resultado = a==b? "verdadeiro" : "falso";

        System.out.println(resultado);

//        O código acima demonstra um operador condicional ternário, muito útil para executar condicionais simples.
//        A sintaxe é consiste na atribuição de uma variável (resultado =) relacionando-a a uma expressão booleana (a==b);
//        O símbolo de interrogação separa a expressão dos valores que serão atribuídos à variável, separados por ':', dependendo
//        do resultado do teste n expressão booleana (? "verdadeiro" : "falso")
//


    }
}
