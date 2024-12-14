package src.dominio;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo = LocalDate.now();
    private LocalDate dataDevolucao = dataEmprestimo.plusDays(7);
    public void datas(){
        System.out.println("Data:" + dataEmprestimo);
        System.out.println("Data Modificada:" + dataDevolucao);
    }
}
