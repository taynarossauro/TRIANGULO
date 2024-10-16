package utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FuncoesUteis {

    private int valorA;
    private int valorB;
    private int altura;
    private String arquivo;

    // Construtor da classe
    public FuncoesUteis(int valorA, int valorB, int altura, String arquivo) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.altura = altura;
        this.arquivo = arquivo;
    }

    // getter para retornar o atributo
    public int getValorA() {
        return valorA;
    }

    // getter para retornar o atributo
    public int getValorB() {
        return valorB;
    }

    // getter para retornar o atributo
    public int getAltura() {
        return altura;
    }

    // getter para retornar o atributo
    public String getArquivo() {
        return arquivo;
    }

    // Método para somar dois parâmetros usando os valores do objeto
    public int soma() {
        return getValorA() + getValorB();
    }

    // Método para exibir um triângulo de altura especificada usando o valor do objeto
    public void triangulo() {
        for (int i = 1; i <= getAltura(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // Método que lê um arquivo de texto e imprime seu conteúdo
    public void printArquivo() {
        try {
            File file = new File(getArquivo());
            //le o conteúdo do arquivo
            Scanner scanner = new Scanner(file);
            // Loop enquanto ainda houver linhas
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Se der erro no caminho do arquivo
            System.out.println("Não tem arquivo");
        }
    }

}
