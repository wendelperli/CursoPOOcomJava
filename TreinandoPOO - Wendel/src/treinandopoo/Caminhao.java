

package treinandopoo;


public class Caminhao implements Comandos {
    String cor;
    String nome;
    int ano;
    boolean motor;
    
    Adicional adicional; //Adiciona a Classe 'Adicional' como um tipo de dados.
    
    //Método Construtor
    public Caminhao(String nome, String cor, int ano, boolean motor, Adicional add) {
        this.cor = cor;
        this.nome = nome;
        this.ano = ano;
        this.motor = motor;
        this.adicional = add;
    }

    //Método Getter e Setter para o atributo 'adicional'
    public Adicional getAdicional() {
        return adicional;
    }

    public void setAdicional(Adicional adicional) {
        this.adicional = adicional;
    }
    

    @Override
    public void ligarMotor(){
        this.motor = true;
    }
    @Override
    public void desligarMotor(){
        this.motor = false;
    }
    @Override
    public void estadoMotor(){
        if (motor == false){
            System.out.println("Motor está desligado!");
        }
        else{
            System.out.println("Motor está ligado!");
        }
    }
    
    @Override
    public void status(){
        System.out.println("Cor " + this.cor);
        System.out.println("Nome " + this.nome);
        System.out.println("Ano " + this.ano);
        System.out.println("Combustivel: " + this.getAdicional().getCombustivel()); //assume-se que getAdicional() retorna um objeto que possui o método getCombustivel()
        System.out.println("Cavalos: " + this.getAdicional().getCavalos());
    }    

 
   
}
