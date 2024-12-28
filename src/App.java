package src;

public class App {
    public static void main(String[] args){
        boolean isRunning = true;
        while(isRunning){
            System.out.println("\nEscolha:\n 1- Adicionar livro\n 2- Listar livros\n 3- Realizar empréstimo de livro\n 4- Realizar devolução de livro\n 5- Cadastrar usuário");
            int menu = Acoes.scanner.nextInt();

            switch (menu) {
                case 1: 
                    Acoes.cadastrarLivro();   
                    break;
                case 2:
                    if(Acoes.livrosBiblioteca.size() != 0){
                        Acoes.listaLivros();
                    }else{
                        System.out.println("NENHUM LIVRO CADASTRADO");
                    }
                    break;
                case 3:
                    Acoes.emprestimoLivro();
                    break;
                case 4:
                    Acoes.devolucaoLivro();
                    break;
                case 5:
                    Acoes.cadastrarUsuario();
                    break;
                default:
                    break;
            }
        }
        Acoes.scanner.close();
    }
}
