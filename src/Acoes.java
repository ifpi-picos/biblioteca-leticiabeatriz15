package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.dominio.Emprestimo;
import src.dominio.Livro;
import src.dominio.Usuario;

public class Acoes {
    static Scanner scanner = new Scanner(System.in);
    static List<Livro> livrosBiblioteca = new ArrayList<>();
    static List<Usuario> usuariosCadastrados = new ArrayList<>();
    static List<Emprestimo> emprestimos = new ArrayList<>();

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
    }

    public static void listaLivros(){
            System.out.println("Escolha uma das opções abaixo:\n 1- Listar todos os livros\n 2- Listar livros emprestados\n 3- Listar livros disponíveis");
            int opção = scanner.nextInt();

            switch (opção) {
                case 1:
                    for(int i = 0; i < livrosBiblioteca.size(); i++){
                        System.out.println("\nLivro " + (i + 1) + ":");
                        livrosBiblioteca.get(i).exibirValoresLivro();
                    }
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                default:
                    break;
            }
    }

    public static void cadastrarUsuario() {
        System.out.println("Digite o nome do usuário: ");
        String nomeUsuario = scanner.next();

        System.out.println("Digite o CPF do usuário: ");
        String cpf = scanner.next();

        System.out.println("Digite o email do usuário: ");
        String email = scanner.next();

        Usuario novoUsuario = new Usuario(nomeUsuario, cpf, email);
        usuariosCadastrados.add(novoUsuario);
        System.out.println("Usuário cadastrado com sucesso!");
        
    }

    public static void emprestimoLivros() {
        System.out.println("Digite o CPF do usuário que deseja emprestar o livro: ");
        String cpf = scanner.next();

        Usuario userEncontrado = null;
        for(Usuario user : usuariosCadastrados){
            if(user.getCpf().equals(cpf)){
                userEncontrado = user;
                break;
            }
        }

        System.out.println("Digite o nome do livro que deseja emprestar: ");
        String nomeLivro = scanner.next();

        Livro livroEncontrado = null;
        for(Livro livro : livrosBiblioteca){
            if(livro.getTitulo().equals(nomeLivro)){
                livroEncontrado = livro;
                break;
            }
        }

        Emprestimo novoEmprestimo = new Emprestimo(livroEncontrado, userEncontrado);
        emprestimos.add(novoEmprestimo);
        
    }
}
