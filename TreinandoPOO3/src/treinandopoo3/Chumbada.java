package treinandopoo3;


public class Chumbada {
    private String nome;
    private int ano;
    private String cor;
    private boolean motor;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
            
    public int getAno(){
        return this.ano;
    }
    public void setAno(int a){
        this.ano = a;
        
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getMotor(){
        return this.motor;
    }
    public void setMotor(boolean m){
        this.motor = m;
    }
    
    public Chumbada(String n, int a, String c, boolean m){//Método Construtor
        this.nome = n;
        this.ano = a;
        this.cor = c;
        this.motor = m;
    }
   
    public void status(){//Método para mostrar as informações
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cor: " + this.getCor());
        
        if(this.getMotor() == false){
            System.out.println("O motor está desligado");
        }
        else
            System.out.println("O motor está ligado");
    }
}
