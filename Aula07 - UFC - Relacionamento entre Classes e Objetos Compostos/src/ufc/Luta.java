package ufc;
import java.util.Random;

public class Luta {
    //Atributos:
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){ //Passa dois parâmetros usando a Classe Lutador como tipo primitivo
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
                }        
    }
    //Métodos públicos
    public void lutar(){
        if(this.aprovada == true){
            this.desafiado.apresentar(); // Funciona porque o objeto 'desafiado' tem como tipo primitivo a Classe Lutador, a qual o método 'apresentar()' pertence
             this.desafiante.apresentar(); // Funciona porque o objeto 'desafiante' tem como tipo primitivo a Classe Lutador, a qual o método 'apresentar()' pertence
            
            Random aleatorio = new Random(); // Instancia um objeto da Classe Random para gerar números aleatórios
            int vencedor = aleatorio.nextInt(3); //0 1 2
            
            switch(vencedor){
                case 0://Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " Venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " Venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }       
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
