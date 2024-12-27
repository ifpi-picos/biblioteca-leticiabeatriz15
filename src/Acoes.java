package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.dominio.Livro;

public class Acoes {
    static Scanner scanner = new Scanner(System.in);
    static List<Livro> livrosBiblioteca = new ArrayList<>();

    public static void cadastrarLivro(){
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = scanner.next();
        
        System.out.println("Digite o nome do Autor: ");
        String nomeAutor = scanner.next();
        
        System.out.println("Digite o nome da editora: ");
        String nomeEditora = scanner.next();
    
        System.out.println("Digite o ano em que o livro foi lançado: ");
        int anoLivro = scanner.nextInt();

        Livro novoLivro = new Livro(nomeLivro, nomeAutor, nomeEditora, anoLivro);
        novoLivro.exibirValoresLivro();
        livrosBiblioteca.add(novoLivro);

        System.out.println("O livro é -->" + livrosBiblioteca.get(0).getTitulo());

        // scanner.close();
    }

    // public static void listaLivros(){
    //     System.out.println("Veio aq");
    // }
}
