package exerciciopraticoaula09;


public class ExercicioPraticoAula09 {

  
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Wendel", 30, "M");
        Livro l1 = new Livro("Jobs", "Tanembaum", 150, 3, false, p1);
        p1.setNome("Joao");
        l1.setLeitor(p1);
        l1.folhear(15);
        l1.mostrar();
        
        
    }
    
}
