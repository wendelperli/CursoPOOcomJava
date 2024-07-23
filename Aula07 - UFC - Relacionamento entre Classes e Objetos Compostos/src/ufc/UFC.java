package ufc;

public class UFC {
    
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6]; // Declarando um vetor/array com espaço para 6 lutadores
        l[0] = new Lutador("Wendel", "Brasileiro", 30, 1.83f, 74.6f, 10, 0, 0);
        l[1] = new Lutador("José", "Mexicano", 28, 1.75f, 75.8f, 15, 2, 1);
        l[2] = new Lutador("Maria", "Espanhola", 25, 1.70f, 65.4f, 8, 1, 0);
        l[3] = new Lutador("Anna", "Russa", 27, 1.80f, 72.6f, 12, 3, 0);
        l[4] = new Lutador("John", "Americano", 32, 1.90f, 80, 20, 5, 2);
        l[5] = new Lutador("David", "Inglês", 29, 1.78f, 70.4f, 18, 1, 1);       
        //for (int i = 0; i < l.length; i++) {
            //l[i].apresentar();
           // l[i].status();
        //}
        Luta ufc01 = new Luta();
        ufc01.marcarLuta(l[0], l[0]);
        ufc01.lutar();
        l[0].status();
    }  
}
