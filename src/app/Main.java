package app;

import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto da classe FuncoesUteis
        FuncoesUteis funcoes = new FuncoesUteis(5, 10, 4, "arquivo.txt");

        // Testar a função soma
        int resultadoSoma = funcoes.soma();
        System.out.println("\nResultado da soma: " + resultadoSoma);

        // Testar a função triangulo
        System.out.println("\nTriângulo de altura " + funcoes.getAltura() + ":");
        funcoes.triangulo();

        // Testar a função printArquivo
        System.out.println("\nConteúdo do arquivo:");
        funcoes.printArquivo();
        
        // Testar toString
        System.out.println(funcoes.toString());
    }
}
