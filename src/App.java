package src;

public class App {
    public static void main(String[] args){
        boolean programaExecutando = true;
        while(programaExecutando){
            System.out.println("Escolha:\n 1- Adicionar Livro");
            
            int menu = Acoes.scanner.nextInt();

            switch (menu) {
                case 1: 
                    Acoes.cadastrarLivro();   
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
        
    }
}
