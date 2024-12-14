package src;

import java.util.Scanner;

import src.dominio.Emprestimo;
import src.dominio.Livro;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        
        System.out.println("Digite o nome do Autor: ");
        String nomeAutor = scanner.nextLine();
        
        System.out.println("Digite o nome da editora: ");
        String nomeEditora = scanner.nextLine();
    
        System.out.println("Digite o ano em que o livro foi lançado: ");
        int anoLivro = scanner.nextInt();

        scanner.close();

        Livro novoLivro = new Livro(nomeLivro, nomeAutor, nomeEditora, anoLivro);
        novoLivro.exibirValoresLivro();
    }
}
