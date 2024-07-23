
package exemplopratico;

public class Conta {        //Atributos:
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Método Construtor:
    public Conta(){
        
        this.saldo = 0;
        this.status = false;
    }
    //Métodos especiais Getters e Setters:
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    
    //Métodos "comuns":
    public void abrirConta(int n, String t, String d, boolean st){
        this.setNumConta(n);
        this.setTipo(t);
        this.setDono(d);
        this.setStatus(true);
        if(this.getTipo() == "cc"){
            this.setSaldo(50);
        }
        if(this.getTipo() == "cp"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if(this.getSaldo() == 0 && this.getStatus() == true){
            this.setStatus(false);
            System.out.println("A conta foi fechada");
        }
        else{
            System.out.println("Não foi possível fechar a conta");
        }
    }
    public void depositar(float d){
        this.setSaldo(this.getSaldo() + d);
        System.out.println("Foi depositado R$" + d + "reais");
    }
    public void sacar(float s){
        if(this.getSaldo() > 0){
            if(s <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Foi sacado R$" + s + " reais");
            }
            else{
                System.out.println("Não é possível sacar o valor solicitado");
            }
        }
    }
    public void pagarMensal(){
        if(this.getSaldo() >= 20 && this.getTipo() == "cc"){
            this.setSaldo(this.getSaldo() - 20);
            System.out.println("Foi pago a mensalidade de R$20 reais");
        }
        if(this.getSaldo() >= 12 && this.getTipo() == "cp"){
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("Foi pago a mensalidade de R$12 reais");
        }
        
    }
    public void mostrar(){
        System.out.println("---------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo na conta: " + this.getSaldo());
        
        if(this.getStatus() == true){
            System.out.println("Status da conta: Conta Aberta");
        }
        else{
            System.out.println("Status da conta: Conta Fechada");
        }
        System.out.println("---------------------------------");
    }
}
