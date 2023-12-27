package VariableTypes;

public class VariableTypes {
    public static void main(String[] args) {
        byte idade = 27;
        short ano = 2023;
        int cep = 58068330;
        long cpf = 70000053434L;
        float pi = 3.14F;
        double salario = 1275.33;
        short numero_curto = 1;
        int numero_normal = numero_curto;
        short numero_curto2 = (short) numero_normal;
        // A implementação acima denomina-se casting, ao colocar a variável inteira
        // com o tipo short entre parênteses é realizada uma conversão que impede que hajam incompatibilidades


    }
}
