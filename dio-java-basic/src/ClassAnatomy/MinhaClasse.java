package ClassAnatomy;

public class MinhaClasse {
    /*Corpo da classe, que é um arquivo criado no código fonte,
    o diretório 'src' do projeto, escrito em Pascal case, que tem o mesmo
    nome do arquivo.
     */
    public static void main(String[] args) {
        /*
        Corpo do método main, que tem um parâmetro String, e o parâmetro
        [] que indica um array. Esse é um método específico dentro de uma classe,
        que conterá todas as operações dentro de seu escopo.
         */
        System.out.print("Hello World!");
        /*
        System é uma classe que tem inúmeras operações, nesse caso, a operação
        escolhida foi a out, operação de saída para  uma impressão(print), com um parâmetro
        sendo um texto em forma de string.
         */

        String brasil = "Brasil";
        final double PI=3.14;
        /*
        Ao declarar uma variável com a classe 'final', o valor se torna uma
        constante, ou seja, que não pode ser alterado posteriormente no
        código. Convenciona-se que contantes devem ter suas variáveis escritas em caixa alta.
        Uma declaração de variáveis em Java deve seguir a estrutura abaixo:
        Tipo nomeBemDefinido = Atribuição (opcional em alguns casos). Exemplo abaixo
         */

        String meuNome = "Lauro";

        int anoFabricação = 2022;

        boolean verdadeira= false;
        boolean simNao= false;

        anoFabricação = 2023;

        String primeiroNome = "Lauro";
        String segundoNome = "Barbalho Junior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

    }
}