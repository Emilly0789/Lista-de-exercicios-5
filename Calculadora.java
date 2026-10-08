public class Calculadora {
    public static void main(String[] args) {
        // Cada operação é implementada como uma expressão lambda
        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return a / b;
        };

        double x = 10;
        double y = 4;

        System.out.print("Soma: " + x + " + " + y + " = " + soma.executar(x, y));
        System.out.print("Subtração: " + x + " - " + y + " = " + subtracao.executar(x, y));
        System.out.print("Multiplicação: " + x + " * " + y + " = " + multiplicacao.executar(x, y));
        System.out.print("Divisão: " + x + " / " + y + " = " + divisao.executar(x, y));

        // Testando a divisão por zero
        try {
            System.out.print("Divisão: " + x + " / 0 = " + divisao.executar(x, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
